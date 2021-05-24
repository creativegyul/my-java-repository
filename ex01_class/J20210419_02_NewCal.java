package ex01_class;
//결과값이 저장되는 계산기
class NewCal{
	//필드:maker, result(결과값)
	String maker="AppleCaculator2";
	double result;
	//메소드: 결과값에 더하는 기능
	void add(double a) {
		result+=a;
	}
	//오버로딩: 매개변수의 갯수나 형이 다른 경우 메소드의 이름은 중복가능
	double add(double a, double b) {
		return a+b;
	}
	void add(int a) {
		result+=a;
	}
	//빼기
	void sub(double a) {
		result-=a;
	}
	//곱하기
	void mul(double a) {
		result*=a;
	}
	//나누기
	void div(double a) {
		result/=a;
	}
}

public class J20210419_02_NewCal {

	public static void main(String[] args) {
		NewCal c1=new NewCal();
//		System.out.println(c1.result);
//		c1.add(10);
//		System.out.println(c1.result);
//		c1.sub(5);
//		System.out.println(c1.result);
//		c1.mul(3.14);
//		System.out.println(c1.result);
//		c1.div(3);
//		System.out.println(c1.result);
		System.out.println(c1.add(20, 10));
		c1.add(100);
		System.out.println(c1.result);
		
	}

}
