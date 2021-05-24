package ex07_jdbc.sales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ex07_jdbc.DBConn;

public class SalesDAO {
	//일일 상품 판매 리스트
	List<Map<String, Object>> dayItemSalesList(){
		List<Map<String, Object>> slist=new ArrayList<>();
		//connection 객체 생성
		Connection con=DBConn.getConn();
		//PreparedStatement
		PreparedStatement pstmt=null;
		//ResultSet
		ResultSet rs=null;
		StringBuffer sql=new StringBuffer();
		sql.append("SELECT s.saledate, S.SEQ, S.ITEMCODE, i.itemname, s.qty, s.amount ");
		sql.append("FROM SALES S INNER JOIN ITEM I ON (S.ITEMCODE=I.ITEMCODE) ");
		sql.append("ORDER BY S.ITEMCODE, S.SEQ");
		try {
			pstmt=con.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String saledate=rs.getString("saledate");
				int seq=rs.getInt("seq");
				String itemcode=rs.getString("itemcode");
				String itemname=rs.getString("itemname");
				int qty=rs.getInt("qty");
				int amount=rs.getInt("amount");
				//System.out.println(saledate+" "+seq+" "+itemcode+" "+itemname+" "+qty+" "+amount);
				//매출 한 건 데이터 저장
				Map<String, Object> map=new HashMap<>();
				map.put("saledate", saledate);
				map.put("seq", seq);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				slist.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if (pstmt!=null) pstmt.close();
				if (con!=null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return slist;
	}
	//일일 상품별 집계 판매
	List<Map<String, Object>> dayEachItemSales(){
		List<Map<String, Object>> list=new ArrayList<>();
		Connection con=DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sql=new StringBuffer();
		sql.append("SELECT S.SALEDATE, S.ITEMCODE, I.ITEMNAME, SUM(S.QTY) QTY, SUM(S.AMOUNT) AMOUNT ");
		sql.append("FROM SALES S JOIN ITEM I ON(S.ITEMCODE=I.ITEMCODE) ");
		sql.append("GROUP BY S.SALEDATE, S.ITEMCODE, I.ITEMNAME ");
		sql.append("HAVING SUM(S.QTY)>2 ORDER BY S.SALEDATE, S.ITEMCODE");
		try {
			pstmt=con.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String saledate=rs.getString(1);
				String itemcode=rs.getString(2);
				String itemname=rs.getString(3);
				int qty=rs.getInt(4);
				int amount=rs.getInt(5);
				Map<String, Object> map=new HashMap<>();
				map.put("saledate", saledate);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if (pstmt!=null) pstmt.close();
				if (con!=null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	//상품마스터 + 상품별 집계판매금액
	List<Map<String, Object>> dayItemSalesTotal(String saledate) {
		List<Map<String, Object>> list=new ArrayList<>();
		Connection con=DBConn.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		StringBuffer sql=new StringBuffer();
		sql.append("SELECT I.ITEMCODE, I.ITEMNAME, I.PRICE, NVL(S.AMT,0) TOTAL_AMOUNT,  NVL(I.BIGO,'없음') BIGO, ");
		sql.append("I.REGIDATE FROM ITEM I LEFT JOIN (SELECT ITEMCODE, SUM(AMOUNT) AMT FROM SALES ");
		sql.append("WHERE SALEDATE=? GROUP BY ITEMCODE) S ");
		sql.append("ON I.ITEMCODE=S.ITEMCODE ORDER BY I.ITEMCODE");
		try {
			pstmt=con.prepareStatement(sql.toString());
			pstmt.setString(1, saledate);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Map<String, Object> map=new HashMap<>();
				map.put("itemcode", rs.getString("itemcode"));
				map.put("itemname", rs.getString("itemname"));
				map.put("price", rs.getString("price"));
				map.put("total_amount", rs.getString("total_amount"));
				map.put("bigo", rs.getString("bigo"));
				map.put("regidate", rs.getString("regidate"));
				list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if (pstmt!=null) pstmt.close();
				if (con!=null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	//VIEW를 이용해서 상품별 판매 조회
	//일자별 조회
	List<Map<String, Object>> itemSalesView(String saledate) {
		List<Map<String, Object>> list=new ArrayList<>();
		Connection con=DBConn.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		StringBuffer sb=new StringBuffer();
		sb.append("SELECT*FROM day_item_sales_view ");
		sb.append("WHERE SALEDATE=?");
		try {
			pstmt=con.prepareStatement(sb.toString());
			pstmt.setString(1, saledate);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Map<String, Object> map=new HashMap<>();
				map.put("saledate", saledate);
				map.put("itemcode", rs.getString(2));
				map.put("itemname", rs.getString(3));
				map.put("price", rs.getInt(4));
				map.put("total_amount", rs.getInt(5));
				map.put("bigo", rs.getString(6));
				map.put("regidate", rs.getString(7));
				list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
}
