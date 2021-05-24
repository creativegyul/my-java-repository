package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class J20210427_02_insert {

	public static void main(String[] args) {
		//오라클에 데이터 추가: insert
		Connection con=DBConn.getConn();
		//Statement stmt=null;
		PreparedStatement pstmt=null; //SQL문을 간결하게, 보안에 우수
		
		Scanner sc=new Scanner(System.in);
		System.out.print("상품코드:");
		String itemcode=sc.next();
		sc.nextLine(); //엔터값 처리
		System.out.print("상품명:");
		String itemname=sc.nextLine();
		System.out.print("판매가:");
		int price=sc.nextInt();
		//String sql="INSERT INTO ITEM(ITEMCODE, ITEMNAME, PRICE) VALUES('"
					//+itemcode+"','"+itemname+"',"+price+")";
		String sql="INSERT INTO ITEM(ITEMCODE, ITEMNAME, PRICE) VALUES(?,?,?)";
		System.out.println(sql);
		try {
			pstmt=con.prepareStatement(sql);
			//SQL문의 ?에 값 대치
			pstmt.setString(1, itemcode);
			pstmt.setString(2, itemname);
			pstmt.setInt(3, price);
			//stmt=con.createStatement();
			int cnt=pstmt.executeUpdate(); //적용된 건수를 반환
			System.out.println(cnt+"건 추가"); //자바에서 auto-commit
		} catch (SQLException e) {
			System.out.println("SQL문 예외");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
