package myProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	//싱글톤패턴: 인스턴스를 하나만 생성해서 재사용
	private static Connection conn = null; //지역변수 아닌 static 변수로 만들어줌
	
	//커넥션을 리턴하는 메소드
	public static Connection getConn() {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String password="hr";
		try {
			//만약 커넥션객체가 null이거나 커넥션이 끊어졌다면
			if (conn==null || conn.isClosed()) {
				//드라이버 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
//				System.out.println("Driver has been loaded.");
				//커넥션객체 생성
				conn=DriverManager.getConnection(url, user, password);
//				System.out.println("Connected.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver does not exist.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Oracle not connected.");
			e.printStackTrace();
		}
		return conn;
	}
	
	//커넥션 접속 해제 메소드
	public static void dbClose() {
		try {
			if (conn!=null && !conn.isClosed()) {
				conn.close();
//				System.out.println("Disconnected.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
