package ex01_class;
//상품 클래스(Item)
//필드:itemcode(코드), itemname(이름), price(단가)
//메소드:
//1) 판매금액 계산: 매개변수(판매수량), 리턴값(판매금액)
class Item{
	//private 접근제한자: 클래스 내부에서만 접근 가능
	private String itemcode;
	private String itemname;
	private int price;
	int total(int ea) {
		return price*ea;
	}
	//메소드를 이용해서 접근
	//세터(setter)
	//this는 객체 자신
	void setItemcode(String itemcode) {
		this.itemcode=itemcode;
	}
	void setItemname(String itemname) {
		this.itemname=itemname;
	}
	void setPrice(int price) {
		this.price=price;
	}
	//getter: 필드값을 읽어오는 전용 함수
	String getItemcode() {
		return itemcode;
	}
	String getItemname() {
		return itemname;
	}
	int getPrice() {
		return price;
	}
	
}

public class J20210419_04_Item {
	public static void main(String[] args) {
		Item item=new Item();
		item.setItemcode("8801");
		item.setItemname("마이쮸");
		item.setPrice(700);
		System.out.println(item.getItemcode()+" "+item.getItemname()+
				" "+item.getPrice()+"원 판매금액: "+item.total(5));
		System.out.printf("%,d\n",5000000);
		Item item2=new Item();
		item2.setItemcode("8802");
		item2.setItemname("제로콜라");
		item2.setPrice(1500);
		System.out.println(item2.getItemcode()+" "+item2.getItemname()+
				" "+item2.getPrice()+"원 판매금액: "+item2.total(10));
		
	}
}
