package ex01_class;
//계산기
class Cal{
	//속성:필드
	String maker="AppleCalculator";
	//기능:메소드
	int add(int a, int b) { //더한 값을 리턴
		int r=a+b; //r은 지역변수
		return r;
	}
	int minus(int a, int b) {
		return a-b;
	}
	int multi(int a, int b) {
		return a*b;
	}
	double div(int a, int b) {
		return (double)a/b;
	}
}

public class J20210419_01_Cal {

	public static void main(String[] args) {
		Cal c1=new Cal();
		System.out.println(c1.maker);
		int a=20, b=3;
		int r=c1.add(a, b);
		System.out.println("더하기: "+r);
		System.out.println("빼기: "+c1.minus(a, b));
		System.out.println("곱하기: "+c1.multi(a, b));
		System.out.printf("나누기: %.2f\n", c1.div(a, b));
		
	}

}
