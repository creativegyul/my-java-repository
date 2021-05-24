package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J20210427_03_update {

	public static void main(String[] args) {
		//수정: update
		Connection con=DBConn.getConn();
		String itemcode="8801";
		String itemname="맛없는쿠키";
		String sql="UPDATE ITEM SET ITEMNAME=? WHERE ITEMCODE=?";
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, itemname);
			pstmt.setString(2, itemcode);
			int cnt=pstmt.executeUpdate();
			System.out.println(cnt+"건 수정");
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		}
	}

}
