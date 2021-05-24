package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	//커넥션을 리턴하는 메소드
	public static Connection getConn() {
		Connection conn = null;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String password="hr";
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("Driver has been loaded.");
			//커넥션객체 생성
			conn=DriverManager.getConnection(url, user, password);
//			System.out.println("Connected.");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver does not exist.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Oracle not connected.");
			e.printStackTrace();
		}
		return conn;
	}
}
