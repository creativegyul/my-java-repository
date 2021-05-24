package ex07_jdbc.sales;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import ex07_jdbc.DBConn;

class JunitTest {

	@Test
//	void testDayItemSalesList() {
//		SalesDAO sdao=new SalesDAO();
//		List<Map<String, Object>> list=sdao.dayItemSalesList();
//		//출력
//		for (Map<String, Object> m:list) {
//			System.out.println(m.get("saledate"));
//			System.out.println(m.get("seq"));
//			System.out.println(m.get("itemcode"));
//			System.out.println(m.get("itemname"));
//			System.out.println(m.get("qty"));
//			System.out.println(m.get("amount"));
//		}
//	}

//	void testDayEachItemSales() {
//		SalesDAO sdao=new SalesDAO();
//		List<Map<String, Object>> list=sdao.dayEachItemSales();
//		//출력
//		for(Map<String, Object> m:list) {
//			System.out.println(m);
//		}
//	}

//	void testDayItemSalesTotal() {
//		SalesDAO sdao=new SalesDAO();
//		Scanner sc=new Scanner(System.in);
//		System.out.print("조회년월일(YYYYMMDD): "); //SimpleDateFormat
//		String saledate=sc.next();
//		saledate=saledate.substring(0, 4)+"-"+saledate.substring(4, 6)+"-"
//				+saledate.substring(6);
//		List<Map<String, Object>> list=sdao.dayItemSalesTotal(saledate);
//		for(Map<String, Object> m:list) {
//			System.out.println(m.get("itemcode")+" "+m.get("itemname")+" "+m.get("price")
//			+" "+m.get("total_amount")+" "+m.get("bigo")+" "+m.get("regidate"));
//		}
//	}
	
	void itemSalesView() {
		SalesDAO sdao=new SalesDAO();
		Scanner sc=new Scanner(System.in);
		System.out.print("조회년월일(YYYYMMDD): "); //SimpleDateFormat
		String saledate=sc.next();
		saledate=saledate.substring(0, 4)+"-"+saledate.substring(4, 6)+"-"
				+saledate.substring(6);
		List<Map<String, Object>> list=sdao.itemSalesView(saledate);
		for(Map<String, Object> m:list) {
			System.out.println(m.get("saledate")+" "+m.get("itemcode")+" "+m.get("itemname")+" "+m.get("price")
			+" "+m.get("total_amount")+" "+m.get("bigo")+" "+m.get("regidate"));
		}
	}
	
}
