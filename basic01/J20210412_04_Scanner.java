package basic01;

import java.util.Scanner;

public class J20210412_04_Scanner {

	public static void main(String[] args) {
		//사용자에게 입력받기
//		Scanner sc=new Scanner(System.in);
//		System.out.print("정수는? ");
//		int a=sc.nextInt();
//		System.out.println("입력받은 값: "+a);
		
		//반지름을 입력받아 원의 넓이 구하기
//		Scanner sc=new Scanner(System.in);
//		System.out.print("반지름 입력: ");
//		double d=sc.nextDouble();
//		System.out.printf("원의 넓이는 %.2f\n", d*d*3.14);
//		System.out.println("원의 넓이는 "+ d*d*Math.PI); //원주율
		
		//문자열을 입력받을 때
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름은? ");
//		String name=sc.next();
//		System.out.println("당신의 이름은 "+name);
		
		//엔터를 기준으로 한 줄을 읽어들이는 메소드(like getchar)
//		Scanner sc=new Scanner(System.in); //System.in=키보드(Standard input)
//		System.out.print("이름은? ");
//		String name=sc.nextLine();
//		System.out.println("당신의 이름은 "+name);
		
		//나이와 이메일, 이름을 입력받아 출력
//		Scanner sc=new Scanner(System.in);
//		System.out.print("나이와 이메일 입력: ");
//		int age=sc.nextInt(); String email=sc.next();
//		sc.nextLine(); //엔터처리(버퍼를 비우기 위해서)
//		System.out.print("이름은? ");
//		String name=sc.nextLine();
//		System.out.println("나이: "+age);
//		System.out.println("이메일: "+email+", "+"이름: "+name);
		
		//실습) 반, 이름, 파이썬/C/자바 점수를 입력받아
		//반, 이름, 총점과 평균을 구하여 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("반과 이름 입력: ");
		String ban=sc.next(); String name=sc.next();
		System.out.print("파이썬, C, 자바 점수입력: ");
		int p=sc.nextInt(),c=sc.nextInt(),j=sc.nextInt();
		int total=p+c+j;
		double avg=(double)total/3;
		System.out.println("------------------------");
		System.out.println(ban+" "+name);
		System.out.printf("총점: %d, 평균: %.2f\n", total, total/3.);
		//Math.round 이용
		System.out.printf("평균: " + (double)Math.round(avg*100)/100+"\n");
		//format 메소드 이용
		System.out.println("포맷 메소드: "+String.format("%.2f", avg));

	}

}
