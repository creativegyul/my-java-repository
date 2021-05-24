package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210423_01_exception {

	public static void main(String[] args) {
		//예외 처리(Exception)
		//try catch문
		//JVM이 해당하는 객체를 생성
//		Scanner sc=new Scanner(System.in);
//		int a=10, b=0;
//		while (true) {
//			System.out.print("나눌 수 입력:");
//			try { //예외발생 가능성이 있는 문장
//				b=sc.nextInt();
//				System.out.println(a/b);
//				break;
//			} catch(InputMismatchException e) { //예외가 발생했을때
//				System.out.println("숫자를 입력하세요.");
//				sc.nextLine(); //버퍼 비우기
//				e.printStackTrace(); //예외발생된 지점 추적 출력
//			} catch(ArithmeticException e) {
//				System.out.println("0으로 나눌 수 없습니다.");
//				e.printStackTrace();
//			} catch(Exception e) { //모든 예외 처리. 부모형이 가장 나중에
//				System.out.println("예외 발생");
//				e.printStackTrace();
//			}
//		}
//		System.out.println("프로그램 정상 종료");
		
		//실습) index값을 입력받아 출력
//		int[] arr= {10,20,30};
//		System.out.print("보고싶은 인덱스 번호는?");
//		Scanner sc=new Scanner(System.in);
//		try {
//			int a=sc.nextInt();
//			System.out.println(arr[a-1]);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("정수 1~3을 입력하세요.");
//		} catch(InputMismatchException e) {
//			System.out.println("숫자 1~3을 입력하세요.");
//		} catch(Exception e) {
//			System.out.println("예외 발생");
//		}
		
		//예외의 종류
		//1) 체크예외: RuntimeException을 상속하지 않은 예외
		//			   네트워크나 DB나 파일 등 외부와 연결되는 것들
		//2) 언체크 예외: RuntimeException을 상속한 예외
		File f=new File("test.txt");
		System.out.println(f);
		try {
			//Scanner sc=new Scanner(f, "utf-8"); //한글 안나올때
			Scanner sc=new Scanner(f);
			System.out.println("파일 읽기 성공");
			while(sc.hasNextLine()) {
				String s=sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) { //체크예외
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}

	}

}
