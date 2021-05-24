package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210426_01_selectList {
	static Connection c1; //필드: 자동 초기화

	public static void main(String[] args) {
		//오라클 DB연결
		//Connection c1 = null; //지역변수: 반드시 초기화 필요
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver has been loaded.");
			c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("Connected.");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver does not exist.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Oracle not connected.");
			e.printStackTrace();
		}
		if(c1==null) return; //커넥션 실패시 종료
		
		//DB 정보 Select
		List<CountriesDTO> clist=new ArrayList<>();
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt=c1.createStatement();
			String sql="SELECT*FROM COUNTRIES";
			rs=stmt.executeQuery(sql); //조회
			while (rs.next()) {
				String country_id=rs.getString("country_id");
				String country_name=rs.getString("country_name");
				int region_id=rs.getInt("region_id");
				CountriesDTO co=new CountriesDTO(country_id, country_name, region_id);
				clist.add(co);
				//System.out.println(rs.getString("country_id")+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (SQLException e) {
			System.out.println("SQL문 예외");
			e.printStackTrace();
		} finally { //예외가 발생하든지 안 하든지 무조건 실행
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(c1!=null) c1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//출력(ArrayList)
		for(CountriesDTO i:clist) {
			System.out.println(i.getCountry_id()+" "+i.getCountry_name()+" "+i.getRegion_id());
		}
//		for (int i=0;i<clist.size();i++) {
//			Countries c=clist.get(i);
//			System.out.println(c.getCountry_id()+" "+c.getCountry_name()+" "+c.getRegion_id());
//		}
		
	}

}
