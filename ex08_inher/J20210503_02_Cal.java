package ex08_inher;
//부모클래스
//사칙연산계산
class Cal{
	private String colour;
	//protected-같은 패키지 클래스와 자식클래스 접근 가능
	protected int result;
	//부모클래스의 생성자를 자식클래스에서 실행
	Cal(String colour){
		this.colour=colour;
	}
	public String getColour() {
		return colour;
	}
	public int getResult() {
		return result;
	}
	int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int multi(int a, int b) {
		return a*b;
	}
	double div(int a, int b) {
		return a/b;
	}
}
//자식클래스
//나머지, 제곱
class NewCal extends Cal{
	//private int result;
	NewCal(String colour) {
		super(colour); //super-부모클래스의 생성자를 실행
	}
	int add(int a) {
		result+=a;
		return result;
	}
	int remainder(int a, int b) {
		return a%b;
	}
	double square(int a, int b) {
		return Math.pow(a, b);
	}
}

public class J20210503_02_Cal {
	public static void main(String[] args) {
		NewCal nc=new NewCal("빨강");
		System.out.println(nc.getColour()+"계산기");
		System.out.println("더하기:"+nc.add(100, 50));
		System.out.println("나머지:"+nc.remainder(10, 3));
		System.out.println("5의 3승:"+nc.square(5, 3));
		System.out.println(nc.add(10));
		System.out.println(nc.add(20));
		System.out.println(nc.getResult());
		//object의 메소드 사용 가능
		System.out.println(nc.hashCode());
	}
}
