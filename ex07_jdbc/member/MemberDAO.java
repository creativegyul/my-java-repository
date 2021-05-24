package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import ex07_jdbc.DBConn;

//DAO: 데이터베이스에 접근하는 메소드들의 모음
public class MemberDAO {
	//전체조회
	List<MemberDTO> selectList(){
		List<MemberDTO> mlist=new ArrayList<>();
		Connection con=DBConn.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="SELECT*FROM MEMBER ORDER BY REGIDATE";
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String userid=rs.getString("userid");
				String passwd=rs.getString("passwd");
				int birthyear=rs.getInt("birthyear");
				Date regidate=rs.getDate(4);
				MemberDTO mdto=new MemberDTO(userid, passwd, birthyear, regidate);
				mlist.add(mdto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mlist;
	}
	//한건조회
	MemberDTO selectOne(String userid){
		MemberDTO mdto=null;
		Connection con=DBConn.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="SELECT*FROM MEMBER WHERE USERID=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs=pstmt.executeQuery();
			if (rs.next()) {
				String passwd=rs.getString("passwd");
				int birthyear=rs.getInt(3);
				Date regidate=rs.getDate(4);
				mdto=new MemberDTO(userid, passwd, birthyear, regidate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if (pstmt!=null) pstmt.close();
				if (con!=null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mdto;
	}
	//추가(insert)
	int insert(MemberDTO mdto){
		int cnt = 0; //적용 건수
		PreparedStatement pstmt=null;
		Connection con=DBConn.getConn();
		String sql="INSERT INTO MEMBER(USERID,PASSWD,BIRTHYEAR) VALUES(?,?,?)";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, mdto.getUserid());
			pstmt.setString(2, mdto.getPasswd());
			pstmt.setInt(3, mdto.getBirthyear());
			cnt=pstmt.executeUpdate();
			System.out.println(cnt+"건 추가 완료.");
		} catch(SQLIntegrityConstraintViolationException e) {
			System.out.println("이미 존재하는 ID입니다.");
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		} finally {
			try {
				if (pstmt!=null) pstmt.close();
				if (con!=null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cnt;
	}
	//수정(update)
	int update(MemberDTO mdto) {
		int cnt=0;
		Connection con=DBConn.getConn();
		PreparedStatement pstmt=null;
		//String sql="UPDATE MEMBER SET PASSWD=? WHERE USERID=?";
		//속도의 성능 향상
		StringBuffer sql=new StringBuffer();
		sql.append("UPDATE MEMBER ");
		sql.append("SET PASSWD=? ");
		sql.append("WHERE USERID=?");
		try {
			pstmt=con.prepareStatement(sql.toString());
			pstmt.setString(1, mdto.getPasswd());
			pstmt.setString(2, mdto.getUserid());
			cnt=pstmt.executeUpdate();
			System.out.println(cnt+"건 수정 완료.");
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cnt;
	}
	//삭제(delete)
	int delete(String userid) {
		int cnt=0;
		Connection con=DBConn.getConn();
		PreparedStatement pstmt=null;
		String sql="DELETE FROM MEMBER WHERE USERID=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, userid);
			cnt=pstmt.executeUpdate();
			System.out.println(cnt+"건 삭제 완료.");
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cnt;
	}
}
