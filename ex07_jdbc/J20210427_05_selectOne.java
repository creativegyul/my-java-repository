package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class J20210427_05_selectOne {

	public static void main(String[] args) {
		//PK로 한 건만 조회
		Connection con=DBConn.getConn();
		PreparedStatement pstmt;
		ResultSet rs = null;
		ItemDTO idto=null;
		String sql="SELECT*FROM ITEM WHERE ITEMCODE=?";
		String itemcode="8801";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,itemcode);
			rs=pstmt.executeQuery();
			if(rs.next()) { //데이터가 있다면
				String itemname=rs.getString("itemname");
				int price=rs.getInt("price");
				String bigo=rs.getString("bigo");
				Date regidate=rs.getDate("regidate");
				idto=new ItemDTO(itemcode, itemname, price, bigo, regidate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//item 출력
		System.out.println(idto.getItemcode()+"/"+idto.getItemname()+"/"+idto.getPrice()+"/"+idto.getBigo()+"/"+idto.getRegidate());
		
	}

}
