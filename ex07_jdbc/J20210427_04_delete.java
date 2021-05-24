package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J20210427_04_delete {

	public static void main(String[] args) {
		//데이터 삭제: delete
		Connection con=DBConn.getConn();
		PreparedStatement pstmt;
		String itemcode="8802";
		String sql="DELETE FROM ITEM WHERE ITEMCODE=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, itemcode);
			int cnt=pstmt.executeUpdate();
			System.out.println(cnt+"건 삭제");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
