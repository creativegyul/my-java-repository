package ex12_inner;
interface Cal{
	int add(int a, int b);
//	int sub(int a, int b);
}

public class J20210507_05_Cal {
	public static void main(String[] args) {
		//익명클래스
		Cal cal=new Cal() {
			
			@Override
			public int add(int a, int b) {
				return a+b;
			}

//			@Override
//			public int sub(int a, int b) {
//				return a-b;
//			}
		};
		System.out.println("더하기: "+cal.add(20, 7));
//		System.out.println("빼기: "+cal.sub(30, 10));
		
		//람다식
		//한개의 추상메소드만 가지고 있어야 한다.(함수적 인터페이스)
		Cal cal2=(a,b)->a+b; //(a,b)->{return a+b;};
		System.out.println(cal2.add(10, 20));
	}
}
