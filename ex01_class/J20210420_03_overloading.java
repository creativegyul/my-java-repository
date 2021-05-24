package ex01_class;

import java.util.Arrays;

class Sum{
	//두 정수를 매개변수로 받아 합을 리턴하는 메소드
	int add(int a, int b) {
		return a+b;
	}
	//세 정수를 매개변수로 받아 합을 리턴하는 메소드
	int add(int a, int b, int c) {
		return a+b+c;
	}
	//배열을 매개변수로 받아 합을 마지막 index에 집어넣고 리턴하는 메소드
	int add(int[] a) {
		System.out.println(Arrays.toString(a));
		int sum=0;
		for(int i=0;i<a.length-1;i++) {
			sum+=a[i];
		}
		a[a.length-1]=sum; //마지막 index에 합계 넣기
		return sum;
	}
	//가변인자
	int add1(int...num) { //int형의 배열
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		return sum;
	}
	//문자열을 가변인자로 받아서 출력
	void varString(String...s) { //String형의 배열
		for(String a:s) {
			System.out.println(a);
		}
	}
}

public class J20210420_03_overloading {

	public static void main(String[] args) {
		Sum s1=new Sum();
		System.out.println(s1.add(10, 20));
		System.out.println(s1.add(10, 20, 30));
		//배열
		int[] arr= {10,20,30,40,0};
		System.out.println("합계: "+s1.add(arr));
		System.out.println(Arrays.toString(arr));
		//가인인자
		System.out.println(s1.add1(10,20,30,40,50));
		s1.varString("애벌레","번데기","나비");

	}

}
