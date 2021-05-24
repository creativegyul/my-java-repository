package ex12_inner;
interface Item{
	void namePrint(String itemname);
}
//class ItemImple implements Item{
//	@Override
//	public void namePrint(String itemname) {
//		System.out.println(itemname);
//	}
//}

public class J20210507_04_Item {

	public static void main(String[] args) {
//		ItemImple item=new ItemImple();
//		item.namePrint("치킨팝");
		
		//item 인터페이스를 상속받는 객체 생성
		Item item=new Item() {
			@Override
			public void namePrint(String itemname) {
				System.out.println(itemname);	
			}
		};
		item.namePrint("치킨팝");
	}

}
