package ex01_class;
//원 클래스
class Circle{
	//필드:반지름(정수 또는 실수형), 원의 넓이
	//반지름과 원주율을 입력받아 원의 넓이를 구하는 메소드
	//원주율을 입력받지 않으면 3.14로 정한다
	private double r; //반지름
	private double one; //넓이
	//생성자
	Circle(){}
	public Circle(double r) {
		//this(); //생성자 호출
		this.r=r;
		circleCal(r); //생성자에서 메소드 실행
	}
	//게터
	double getOne() {
		return one;
	}
	//원의 넓이를 구하는 메소드
	double circleCal(double r) {
		one=r*r*Math.PI;
		return one;
	}
	double circleCal(int r) {
		one=r*r*Math.PI;
		return one;
	}
	double circleCal(double r, double pi) {
		one=r*r*pi;
		return one;
	}
	double circleCal(int r, double pi) {
		one=r*r*pi;
		return one;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + ", one=" + one + "]";
	}
}

public class J20210420_05_Area {

	public static void main(String[] args) {
		Circle c1=new Circle(5.5);
		System.out.println(c1);
		System.out.println("넓이: "+c1.circleCal(10.5));
		System.out.println("넓이: "+c1.circleCal(10.5,3.14));

	}

}
