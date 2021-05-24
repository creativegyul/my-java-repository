package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210426_02_regionSelectList {

	public static void main(String[] args) {
		//커넥션 개체 얻기
		Connection con=DBConn.getConn();
		List<RegionsDTO> rlist=new ArrayList<>();
		Statement st=null;
		ResultSet rs=null;
		try {
			st=con.createStatement();
			String sql="SELECT*FROM REGIONS ORDER BY REGION_ID";
			rs=st.executeQuery(sql);
			while (rs.next()) {
				int region_id=rs.getInt("region_id");
				String region_name=rs.getString(2);
				RegionsDTO rdto=new RegionsDTO();
				rdto.setRegion_id(region_id);
				rdto.setRegion_name(region_name);
				rlist.add(rdto);
			}
		} catch (SQLException e) {
			System.out.println("SQL문 예외");
			e.printStackTrace();
		} finally {
			try {
				if (con!=null) con.close();
				if (rs!=null) rs.close();
				if (st!=null) st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//출력
		for (RegionsDTO r:rlist) {
			System.out.println(r.getRegion_id()+" "+r.getRegion_name());
		}
		
	}

}
