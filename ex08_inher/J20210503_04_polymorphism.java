package ex08_inher;

//부모클래스
class Shape{
	//다형성을 위해서 메소드 작성
	void printShape() {
		//System.out.println("다각형");
	}
}

//사각형 클래스
class Rectangle extends Shape{
	//오버라이딩
	@Override
	void printShape() {
		System.out.println("사각형");
	}
}
//삼각형 클래스
class Triangle extends Shape{
	//오버라이딩
	@Override
	void printShape() {
		System.out.println("삼각형");
	}
}

public class J20210503_04_polymorphism {

	public static void main(String[] args) {
		//다형성을 이용해서 메소드를 실행하려면 오버라이딩이 되어있어야
		//Runtime시에는 자식메소드를 실행
		Shape r1=new Rectangle();
		r1.printShape();
		Shape t1=new Triangle();
		t1.printShape();
	}

}
