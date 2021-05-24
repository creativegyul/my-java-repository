package ex01_class;

public class J20210421_03_Cal {
	private static final String maker="Apple Calculator";
	private int result;
	private boolean light;
	
	public static String getMaker() {
		return "["+maker+"]";
	}
	//두 수를 매개변수로 받아서 합을 리턴하는 메소드
	//static 메소드 안에서는 static 필드만 사용 가능
	static int add(int a, int b) {
		return a+b;
	}
	int add(int a) {
		this.result+=a;
		return result;
	}
	//라이트 켜기/끄기
	void onoff() {
		light=!light;
	}

	public static void main(String[] args) {
		J20210421_03_Cal cal=new J20210421_03_Cal();
		System.out.println(cal.add(20));
		System.out.println(cal.add(5));
		System.out.println("합계:"+J20210421_03_Cal.add(20, 10));
		cal.onoff();

	}

}
