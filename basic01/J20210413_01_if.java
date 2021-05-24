package basic01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210413_01_if {

	public static void main(String[] args) {
		//조건문: if
		//두 수를 입력받아 큰 수를 출
//		Scanner sc=new Scanner(System.in);
//		System.out.print("두 수 입력: ");
//		int num1=sc.nextInt(), num2=sc.nextInt();
//		if(num1>num2) System.out.println("더 큰 수는 "+num1);
//		else System.out.println("더 큰 수는 "+num2);
		
		//점수를 입력받고 입력받은 점수에 따라 등급을 출력 <절대평가>
		//90점이상 A, 80점이상 B, 70점이상 C, 60점이상 D, 60점미만 F
//		Scanner sc=new Scanner(System.in);
//		System.out.print("점수는? ");
//		int score=sc.nextInt();
//		if (score>=90) System.out.println("A등급");
//		else if (score>=80) System.out.println("B등급");
//		else if (score>=70) System.out.println("C등급");
//		else if (score>=60) System.out.println("D등급");
//		else System.out.println("F입니다");
		
		//전체인원수와 등수를 입력받아 학점을 출력 <상대평가>
		//상위 15%는 A학점, 35%는 B학점, 50%는 C학점
//		Scanner sc=new Scanner(System.in);
//		System.out.print("전체인원수? ");
//		int total=sc.nextInt();
//		System.out.print("등수는? ");
//		int grade=sc.nextInt();
//		if (grade<=total*0.15) System.out.println("A학점");
//		else if (grade<total*0.35) System.out.println("B학점");
//		else if (grade<total*0.5) System.out.println("C학점");
//		else System.out.println("D학점");
		
		//실습) 화씨(F)<=>섭씨(C)로 바꾸기
		//공식 1) 화씨온도 -> 섭씨온도 : 섭씨온도=(화씨온도-32)*5/9
		//공식 2) 섭씨온도 -> 화씨온도 : 화씨온도=섭씨온도*9/5+32
		//온도: 10 C 또는 100 F
//		Scanner sc=new Scanner(System.in);
//		System.out.print("온도와 단위(C/F) 입력: ");
//		int ondo=sc.nextInt(); String dan=sc.next();
//		System.out.println(ondo+" "+dan);
//		//자바에서 문자열 비교시 equals 메소드를 이용하여 비교!
//		if (dan.equals("C")) //섭씨온도라면
//			System.out.println("화씨 " + (ondo*9/5.+32) + " F 입니다.");
//		else if (dan.equals("F")) //화씨온도라면
//			System.out.println("섭씨 "+ (ondo-32)*(double)5/9 + " C 입니다.");
//		else System.out.println("잘못된 입력입니다."); //그 외
		
		//실습) 계산기
		//10 + 20
//		Scanner sc=new Scanner(System.in);
//		System.out.print("계산식 입력: ");
//		try {
//			int a=sc.nextInt(); String giho=sc.next(); int b=sc.nextInt();
//			if (giho.equals("+"))
//				System.out.printf("%d + %d = %d\n", a, b, a+b);
//			else if (giho.equals("-"))
//				System.out.printf("%d - %d = %d\n", a, b, a-b);
//			else if (giho.equals("*"))
//				System.out.printf("%d * %d = %d\n", a, b, a*b);
//			else if (giho.equals("/"))
//				System.out.printf("%d / %d = %.2f\n", a, b, (double)a/b);
//			else System.out.println("잘못된 입력입니다.");
//		} catch (InputMismatchException e) {
//			System.out.println("숫자를 입력하세요.");
//		}
		
		//2) 계산기(입력값 확인)
//		Scanner sc=new Scanner(System.in);
//		System.out.print("숫자는? ");
//		System.out.println("숫자? "+sc.hasNextInt());
//		//코드인스펙션: 규율 ==true,false <-이런 거 하지 말자
//		if (!sc.hasNextInt()) { //숫자(true)가 아니라면
//			System.out.println("잘못된 입력입니다.");
//		}else {
//			int a=sc.nextInt();
//			System.out.println(a);
//		}
		
		//실습) 아이디와 패스워드를 입력받아 로그인 성공을 결정짓는 프로그램
//		String myid="java", mypw="1111";
//		Scanner sc=new Scanner(System.in);
//		System.out.print("ID 입력: "); String id=sc.next();
//		if (id.equals(myid)) {
//			System.out.print("PW 입력: "); String pw=sc.next();
//			if (pw.equals(mypw))
//				System.out.println("로그인 성공");
//			else
//				System.out.println("비밀번호 불일치");
//		}else System.out.println("아이디 불일치");
		
		//실습) 년을 입력받아 윤년 체크하기
//		Scanner sc=new Scanner(System.in);
//		System.out.print("연도 입력: ");
//		int year=sc.nextInt();
//		if (year%4==0 && year%100!=0 || year%400==0)
//			System.out.println(year+"년은 윤년");
//		else System.out.println(year+"년은 윤년이 아닙니다.");
		
		//실습) 월 사용량을 입력받아 전기 요금 계산
//		Scanner sc=new Scanner(System.in);
//		System.out.print("월 사용량: ");
//		int el=sc.nextInt();
//		int base; //기본요금
//		double base1=88.3; //사용량 200이하 요금
//		double base2=182.9; //사용량 400이하 요금
//		double base3=275.6; //사용량 400이상 요금
//		double won;
//		if (el<=200) {
//			base=910;
//			won=base+el*base1;
//		}
//		else if (el<=400) {
//			base=1600;
//			won=base+200*base1+(el-200)*base2;
//		}
//		else {
//			base=7300;
//			won=base+200*base1+200*base2+(el-400)*base3;
//		}
//		System.out.println("전기세: "+ won +"원" );
//		System.out.println(Math.floor(won)); //버림
//		System.out.println(Math.ceil(won)); //올림
//		System.out.println(Math.round(won)); //반올림
//		System.out.println(String.format("%.0f", won)); //반올림
		
		//무작위의 수 추출
		// 0<= 랜덤값 <1
		// r * (end-start+1) + start
//		double r=Math.random();
//		System.out.println(r);
//		System.out.println((int)(r*6+1)); //1~6
//		System.out.println((int)(r*6+5)); //5~10
//		System.out.println((int)(r*10+11)); //11~20
		
		//주사위 게임
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 이름 입력: "); String a=sc.next();
		System.out.print("두번째 이름 입력: "); String b=sc.next();
		int x=(int)(Math.random()*6+1), y=(int)(Math.random()*6+1);
		System.out.println(a+": "+x+", "+b+": "+y);
		if (x>y) System.out.println("<"+a+" 승!>");
		else if (x<y) System.out.println("<"+b+" 승!>");
		else System.out.println("<무승부>");

	}

}
