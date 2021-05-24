package ex11_guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuestDAOImple implements GuestDAO {
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	@Override
	public int insert(GuestDTO gdto) {
		Connection con=DBConn.getConn();
		int cnt=0;
		String sql="INSERT INTO GUEST(SEQ, NAME, EMAIL, PASSWD, CONTENT)\r\n" + 
				"VALUES(GUEST_SEQ.NEXTVAL,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3, gdto.getPasswd());
			pstmt.setString(4, gdto.getContent());
			cnt=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			try {
//				if(pstmt!=null) pstmt.close();
//				if(con!=null) con.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		return cnt;
	}

	@Override
	public int update(GuestDTO gdto) {
		Connection con=DBConn.getConn();
		int cnt=0;
		String sql="UPDATE GUEST SET NAME=?, EMAIL=?, PASSWD=?, CONTENT=?\r\n" + 
				"WHERE SEQ=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3, gdto.getPasswd());
			pstmt.setString(4, gdto.getContent());
			pstmt.setInt(5, gdto.getSeq());
			cnt=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int delete(int seq) {
		Connection con=DBConn.getConn();
		int cnt=0;
		String sql="DELETE FROM GUEST WHERE SEQ=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, seq);
			cnt=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public GuestDTO selectOne(int seq) {
		Connection con=DBConn.getConn();
		GuestDTO gdto=new GuestDTO();
		String sql="SELECT SEQ, NAME, EMAIL, SUBSTR(PASSWD, 1,2)||'**' PASSWD, CONTENT, REGIDATE\r\n" + 
				"FROM GUEST WHERE SEQ=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, seq);
			rs=pstmt.executeQuery();
			if (rs.next()) {
				String name=rs.getString(2);
				String email=rs.getString(3);
				String passwd=rs.getString(4);
				String content=rs.getString(5);
				String regidate=rs.getString(6);
				gdto=new GuestDTO(seq, name, email, passwd, content, regidate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gdto;
	}

	@Override
	public List<GuestDTO> selectList() {
		Connection con=DBConn.getConn();
		List<GuestDTO> glist=new ArrayList<>();
		String sql="SELECT SEQ, NAME, EMAIL, SUBSTR(PASSWD, 1,2)||'**' PASSWD, CONTENT, REGIDATE\r\n" + 
				"FROM GUEST ORDER BY SEQ DESC";
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int seq=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String passwd=rs.getString(4);
				String content=rs.getString(5);
				String regidate=rs.getString(6);
				GuestDTO gdto=new GuestDTO(seq, name, email, passwd, content, regidate);
				glist.add(gdto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			try {
//				if(rs!=null) rs.close();
//				if(pstmt!=null) pstmt.close();
//				if(con!=null) con.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		return glist;
	}
	
}
