package ex01_class;
//객체지향언어
//독립된 사물, 독립된 공간
//같은 속성+기능(동작)-> 클래스: 객체를 만들기 위한 틀
class Dog {
	//속성:필드
	//자동초기화
	String type="강아지";
	String name="송이";
	int legs=4;
	int cnt; //걸음수
	//기능:메소드
	void walk() {
		cnt++;
		System.out.println(name+" 걷는다.");
	}
	//먹는다 출력 메소드
	void eat() {
		String food="사료"; //지역변수
		System.out.println(name+" "+food+" 먹는다.");
	}
}
public class J20210416_03_class { //public권한 class는 반드시 하나
	public static void main(String[] args) {
		//클래스(형)
		//클래스도 함수처럼 괄호를 붙여줌
		Dog d1=new Dog(); //d1이라는 객체 생성
		System.out.println(d1.type);
		System.out.println(d1.legs);
		d1.walk();
		System.out.println(d1.cnt);
		d1.eat();
	}
}
