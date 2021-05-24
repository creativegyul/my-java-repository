package myProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyProjectDAO {
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	//USERINFO 테이블 아이디로 한건조회(selectOne)
	UserinfoDTO selectOne(String userid) {
		Connection con=DBConn.getConn();
		UserinfoDTO udto=null;
		String sql="SELECT*FROM USERINFO WHERE USERID=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs=pstmt.executeQuery();
			if (rs.next()) {
				udto=new UserinfoDTO(userid,rs.getString("passwd"),rs.getString("nickname"));
			}
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		}
		return udto;
	}
	
	//1. 회원등록(insertUser)
	int insertUser(UserinfoDTO udto) {
		Connection con=DBConn.getConn();
		int cnt=0;
		String sql="INSERT INTO USERINFO(USERID, PASSWD, NICKNAME) VALUES(?,?,?)";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, udto.getUserid());
			pstmt.setString(2, udto.getPasswd());
			pstmt.setString(3, udto.getNickname());
			cnt=pstmt.executeUpdate();
			System.out.println("새로운 회원으로 등록되었습니다.");
		} catch(SQLIntegrityConstraintViolationException e) {
			System.out.println("이미 있는 아이디/닉네임입니다.");
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		}
		return cnt;
	}
	
	//2. 회원탈퇴(deleteUser)
	//자식 dao의 delete 호출하고 부모 삭제
	int deleteUser(String userid) {
		Connection con=DBConn.getConn();
		PreparedStatement pstmt2=null;
		int cnt=0;
		String sql="DELETE FROM CONTENT WHERE USERID=?";
		String sql2="DELETE FROM USERINFO WHERE USERID=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, userid);
			cnt=pstmt.executeUpdate();
			pstmt2=con.prepareStatement(sql2);
			pstmt2.setString(1, userid);
			cnt=pstmt2.executeUpdate();
			System.out.println(cnt+"건 삭제되었습니다.");
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		}
		return cnt;
	}
	
	//3. 닉네임 변경(updateUser)
	int updateUser(UserinfoDTO udto) {
		Connection con=DBConn.getConn();
		int cnt=0;
		String sql="UPDATE USERINFO SET NICKNAME=? WHERE USERID=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, udto.getNickname());
			pstmt.setString(2, udto.getUserid());
			cnt=pstmt.executeUpdate();
			System.out.println(cnt+"건 수정되었습니다.");
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		}
		return cnt;
	}
	
	//4. 한마디 작성(insertContent)
	int insertContent(ContentDTO cdto) {
		Connection con=DBConn.getConn();
		int cnt=0;
		String sql="INSERT INTO CONTENT(SEQ, USERID, COMMENTS) VALUES(CONTENT_SEQ.NEXTVAL,?,?)";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, cdto.getUserid());
			pstmt.setString(2, cdto.getComments());
			cnt=pstmt.executeUpdate();
			System.out.println("새로운 한마디가 등록되었습니다.");
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		}
		return cnt;
	}
	
	//한마디 수정/삭제 건 조회
	List<Map<String, Object>> selectOneContent(String userid){
		List<Map<String, Object>> list=new ArrayList<>();
		Connection con=DBConn.getConn();
		String sql="SELECT C.SEQ, U.NICKNAME, C.COMMENTS, C.REGIDATE\n" + 
				"FROM USERINFO U JOIN CONTENT C ON(U.USERID=C.USERID)\n" + 
				"WHERE U.USERID=? ORDER BY C.SEQ DESC";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Map<String, Object> map=new HashMap<>();
				map.put("seq", rs.getInt("seq"));
				map.put("nickname", rs.getString("nickname"));
				map.put("comments", rs.getString("comments"));
				map.put("regidate", rs.getDate("regidate"));
				list.add(map);
			}
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		}
		return list;
	}
	
	//5. 한마디 수정(updateContent)
	int updateContent(ContentDTO cdto) {
		Connection con=DBConn.getConn();
		int cnt=0;
		String sql="UPDATE CONTENT SET COMMENTS=? WHERE SEQ=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, cdto.getComments());
			pstmt.setInt(2, cdto.getSeq());
			cnt=pstmt.executeUpdate();
			System.out.println(cnt+"건 수정되었습니다.");
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		}
		return cnt;
	}
	
	//6. 한마디 삭제(deleteContent)
	int deleteContent(int seq) {
		Connection con=DBConn.getConn();
		int cnt=0;
		String sql="DELETE FROM CONTENT WHERE SEQ=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, seq);
			cnt=pstmt.executeUpdate();
			System.out.println(cnt+"건 삭제되었습니다.");
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		}
		return cnt;
	}
	
	//7-1. 아이디로 조회(selectOneId)
	List<Map<String, Object>> selectOneId(String userid){
		List<Map<String, Object>> list=new ArrayList<>();
		Connection con=DBConn.getConn();
		String sql="SELECT U.NICKNAME, C.COMMENTS, C.REGIDATE\n" + 
				"FROM USERINFO U JOIN CONTENT C ON(U.USERID=C.USERID)\n" + 
				"WHERE U.USERID=? ORDER BY C.SEQ DESC";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Map<String, Object> map=new HashMap<>();
				map.put("nickname", rs.getString("nickname"));
				map.put("comments", rs.getString("comments"));
				map.put("regidate", rs.getDate("regidate"));
				list.add(map);
			}
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		}
		return list;
	}
	
	//7-2. 일자별 조회(selectOneDate)
	List<Map<String, Object>> selectOneDate(String regidate){
		List<Map<String, Object>> list=new ArrayList<>();
		Connection con=DBConn.getConn();
		String sql="SELECT U.NICKNAME, C.COMMENTS, C.REGIDATE\n" + 
				"FROM USERINFO U JOIN CONTENT C ON(U.USERID=C.USERID)\n" + 
				"WHERE C.REGIDATE BETWEEN TO_DATE(?,'YYYY-MM-DD')\n" + 
				"AND TO_DATE(?,'YYYY-MM-DD')+0.99999\n" + 
				"ORDER BY C.SEQ DESC";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, regidate);
			pstmt.setString(2, regidate);			
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Map<String, Object> map=new HashMap<>();
				map.put("nickname", rs.getString("nickname"));
				map.put("comments", rs.getString("comments"));
				map.put("regidate", rs.getDate("regidate"));
				list.add(map);
			}
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		}
		return list;
	}
	
	//7-3. 전체조회(selectList)
	List<Map<String, Object>> selectList(){
		List<Map<String, Object>> list=new ArrayList<>();
		Connection con=DBConn.getConn();
		String sql="SELECT C.SEQ, U.NICKNAME, C.COMMENTS, C.REGIDATE\n" + 
				"FROM USERINFO U JOIN CONTENT C ON(U.USERID=C.USERID) ORDER BY C.SEQ DESC";
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Map<String, Object> map=new HashMap<>();
				map.put("seq", rs.getInt("seq"));
				map.put("nickname", rs.getString("nickname"));
				map.put("comments", rs.getString("comments"));
				map.put("regidate", rs.getDate("regidate"));
				list.add(map);
			}
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		}
		return list;
	}
}