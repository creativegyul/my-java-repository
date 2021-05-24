package ex08_inher;
//부모클래스
//final 클래스는 상속 불가
class Bird{
	private String name;
	Bird(String name){
		this.name=name;
	}
	void born() {
		System.out.println(name+"는 알을 낳는다");
	}
	//final void fly(): final 메소드는 오버라이딩 불가
	void fly() {
		System.out.println(name+"는 날 수 있다");
	}
}
//참새
class Sparrow extends Bird{
	Sparrow(String name){ //부모의 생성자를 실행
		super(name);
	}
}
//타조
class Ostrich extends Bird{
	private String name="타조";
	Ostrich(String name){
		super(name);
	}
//	Ostrich(){
//		super.name=name;
//	}
	//오버라이딩:부모클래스의 메소드를 다시 정의
	@Override
	void fly() {
		System.out.println(name+"는 날 수 없다");
	}
}

public class J20210503_03_Bird {

	public static void main(String[] args) {
		Sparrow sp=new Sparrow("참새");
		sp.born();
		sp.fly();
		Ostrich os=new Ostrich("타조");
		os.born();
		os.fly();
		System.out.println("-----------------");
		Bird o2=new Ostrich("타조"); //업캐스팅(자동)
		Ostrich o3=(Ostrich)o2; //다운캐스팅(수동)
		o3.fly();
		
	}

}
