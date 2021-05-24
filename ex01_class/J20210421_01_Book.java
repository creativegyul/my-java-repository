package ex01_class;

import java.util.Arrays;

//책 클래스
//필드: 책 코드, 책명, 단가, 할인율
//생성자, 게터, 세터, toString
//메소드: 판매금액 계산(매개변수:수량, 반환값: 판매금액)
//D.T.O.
class Book{
	//필드
	private String bookcode;
	private String bookname;
	private int bookprice;
	private double rate;
	Book(){}
	Book(String bookcode, String bookname, int bookprice, double rate){
		this.bookcode=bookcode;
		this.bookname=bookname;
		this.bookprice=bookprice;
		this.rate=rate;
	}
	public String getBookcode() {
		return bookcode;
	}
	public void setBookcode(String bookcode) {
		this.bookcode = bookcode;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Book [bookcode=" + bookcode + ", bookname=" + bookname + ", bookprice=" + bookprice + ", rate=" + rate + "]";
	}
}
//책 관리 클래스
//M.V.C.
class Manager{
	//판매금액 합계의 배열
	//0=b001, 1=b002
	private int[] total=new int[10];
	int[] getTotal() {
		return total;
	}
	//메소드: 판매금액 계산, 배열에 누적
	int sellCal(Book book,int qty, int index) {
//		System.out.println(book);
//		System.out.println(qty);
		int bookprice=book.getBookprice();
		double rate=book.getRate();
		int totPrice=(int)(bookprice-bookprice*rate)*qty;
		total[index]+=totPrice;
		return totPrice;
	}
}
public class J20210421_01_Book {
	public static void main(String[] args) {
		Book[] barr=new Book[10];
		barr[0]=new Book();
		barr[0].setBookcode("b001");
		barr[0].setBookname("이것이 자바다");
		barr[0].setBookprice(30000);
		barr[0].setRate(0.2);
		//System.out.println(b1);
		barr[1]= new Book("b002","이것이 파이썬이다",18000,0.15);
		Manager mg=new Manager();
		System.out.println(barr[0].getBookcode()+" "+barr[0].getBookname()+" "+mg.sellCal(barr[0],3,0));
		System.out.println(barr[0].getBookcode()+" "+barr[0].getBookname()+" "+mg.sellCal(barr[0],5,0));
		System.out.println(barr[1].getBookcode()+" "+barr[1].getBookname()+" "+mg.sellCal(barr[1],2,1));
		System.out.println("-----------------------------");
		System.out.println(Arrays.toString(mg.getTotal()));

	}
}
