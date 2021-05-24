package basic01;

import java.util.Scanner;

public class J20210414_01_switch {

	public static void main(String[] args) {
		//조건문
		//숫자에 대한 영어단어 출력
//		int a=3;
//		switch (a) {
//		case 1:
//			System.out.println("One"); break;
//		case 2:
//			System.out.println("Two"); break;
//		case 3:
//			System.out.println("Three"); break;
//		default:
//			System.out.println("잘못된 숫자");
//		}
		
		//h: 고등학교, m: 중학교, e: 초등학교
//		char c='h';
//		Scanner sc=new Scanner(System.in);
//		System.out.print("학교? ");
//		String school=sc.next();
//		switch (school) {
//		case "h":
//			System.out.println("고등학교"); break;
//		case "m":
//			System.out.println("중학교"); break;
//		case "e":
//			System.out.println("초등학교"); break;
//		default:
//			System.out.println("잘못된 입력");
//		}
		
		//문자열의 비교
		String s1="java";
		String s2=new String("java"); //새로운 객체를 만들어 저장공간이 달라짐(Heap)
		String s3="java";
		if (s1==s3) //주소 비교
			System.out.println("같습니다.");
		else System.out.println("다릅니다.");
		s1.equals("java"); //True or False
		
		//실습) 짝수, 홀수 출력
		int a=10;
		switch(a%2) {
		case 0:
			System.out.println("짝수"); break;
		case 1:
			System.out.println("홀수"); break;
		}
		
		//학점출력
		//100~90:A, 89~80:B, ...
		int score=95;
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("A학점"); break;
		case 8:
			System.out.println("B학점"); break;
		case 7:
			System.out.println("C학점"); break;
		case 6:
			System.out.println("D학점"); break;
		default:
			System.out.println("F학점"); break;
		}
		
	}

}
