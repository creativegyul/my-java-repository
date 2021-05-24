package ex12_inner;

class Dog{
	void walk(){
		System.out.println("걷는다.");
	}
}

//class HuntDog extends Dog{
//	@Override
//	void walk() {
//		System.out.println("걸을 수 없다.");
//	}
//}

public class J20210507_02_anonymous {

	public static void main(String[] args) {
//		HuntDog hd=new HuntDog();
//		hd.walk();
		//익명 클래스:부모의 클래스로 재정의해서 생성
		//			  한번만 쓰고자 할 때(1회용)
		Dog hdog=new Dog() {
			@Override
			void walk() {
				System.out.println("걸을 수 없다.");
			}
			//오버라이딩만 의미가 있다-모부클래스에 없는 메소드는 실행 안됨
//			void eat() {
//				System.out.println("먹는다.");
//			}
		};
		hdog.walk();
	}

}
