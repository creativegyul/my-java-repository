package ex08_inher;
//부모클래스
class MyCar{
	static final String name="람보르기니 무르시엘라고";
}
class Tyre extends MyCar{
	private String company; //회사
	public Tyre(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "타이어 회사: " + company;
	}
}
class Mirror extends MyCar{
	private String company;
	public Mirror(String company) {
		super();
		this.company = company;
	}
	@Override
	public String toString() {
		return "거울 회사: " + company ;
	}
}
//수리업체 클래스
class Repair{
	//부품을 체인지해주는 메소드
	//다형성을 이용
	void changePart(MyCar t) {
		System.out.println(t+" 교체 완료");
	}
//	void changePart(Mirror m) { //오버로딩
//		System.out.println(m+" 교체 완료");
//	}
}

public class J20210504_02_Car {
	public static void main(String[] args) {
		System.out.println(MyCar.name);
		Tyre t1=new Tyre("앗 타이어 신발보다 싸다");
		//System.out.println(t1);
		Mirror m1=new Mirror("우리거울");
		//System.out.println(m1);
		Repair r1=new Repair();
		r1.changePart(t1);
		r1.changePart(m1);
	}
}
