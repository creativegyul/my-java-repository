package basic01;

import java.util.Scanner;

public class J20210414_03_for {

	public static void main(String[] args) {
		//반복문 (for)
//		for (int i=0;i<10;i++) {
//			System.out.println(i);
//		}
		//1~10까지의 합 구하기
//		int sum=0;
//		for (int a=1;a<11;a++) {
//			sum+=a;
//		}
//		System.out.println("합계: "+sum);
		
		//실습) 업다운 게임 만들기
		//1) 1~100 사이의 수 중 하나를 랜덤추출
		//2) 사용자에게 정수 입력받기
		//3) 랜덤 수와 비교해서 업 또는 다운을 출력
		//4) 2~3을 5번 반복
		//5) 5번 안에 정답을 입력하면 사용자 승리, 입력 못하면 컴퓨터 승리
//		int x=(int)(Math.random()*100+1), y=0;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("<1~100 사이의 정수 맞추기>");
//		boolean win=false; //성공여부
//		for (int i=0;i<5;i++) {
//			System.out.print(i+1+"번째 숫자입력: ");
//			y=sc.nextInt();
//			if (x>y)
//				System.out.println("업~");
//			else if (x<y)
//				System.out.println("다운~");
//			else {
//				System.out.println("당신의 승리!");
//				win=true;
//				break;
//			}
//		}
		//While문 사용)
//		int cnt=0; //반복횟수
//		while (true) {
//			System.out.print(cnt+1+"번째 숫자입력: ");
//			y=sc.nextInt();
//			cnt++;
//			if (x>y)
//				System.out.println("업~");
//			else if (x<y)
//				System.out.println("다운~");
//			else {
//				System.out.println("당신의 승리!");
//				win=true;
//				break;
//			}
//			if (cnt>4) break;
//		}
//		if (!win) System.out.println("컴퓨터가 이겼습니다.");
//		if (x!=y) System.out.println("컴퓨터가 이겼습니다.");
		
		//실습) 양의 정수를 입력받아 정수가 소수인지 검사
		//1안)
//		int a=9;
//		boolean b=true; //소수 여부
//		for (int i=2;i<a;i++) {
//			if (a%i==0) {
//				System.out.println("소수가 아닙니다.");
//				b=false;
//				break;
//			}
//		}
//		if (b) {
//			System.out.println("소수입니다.");
//		}
		//2안)
//		int a=9, i;
//		for (i=2;i<a;i++) {
//			if (a%i==0) {
//				System.out.println("소수가 아닙니다."); break;
//			}
//		}
//		if (i==a) { //i가 a와 같다: 반복문이 break 되지 않고 모두 넘어갔다는 뜻
//			System.out.println("소수입니다.");
//		}
		
		//실습) 1~n 사이의 소수 구하기
		//n을 입력받아 1부터 n 사이의 모든 소수 출력
//		Scanner sc=new Scanner(System.in);
//		System.out.print("양의 정수 입력: ");
//		int n=sc.nextInt();
//		for(int i=2;i<n;i++) {
//			boolean prime=true; //새로운 수 i++이 생성됐을 때 소수라고 가정하고 시작
//			for (int j=2;j<i;j++) {
//				if(i%j==0) { //i를 다른 수 j로 나누었을때 나누어 떨어지면
//					prime=false; //소수가 아님
//					break;
//				}
//			}
//			if (prime) {
//			System.out.print(i+" ");
//			}
//		}
		
		//실습) 백준 설탕배달
		int N, count5, count3, rest;
		System.out.print("설탕의 무게는? ");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		count5=N/5; //만약 1kg라면 => 0
		while (true) {
			rest=N-(5*count5);
			if (rest%3==0) { //나누어 떨어지면
				count3=rest/3;
				System.out.printf("5kg 봉지: %d개, 3kg 봉지: %d개",count5,count3);
				break;
			} else if (count5==0) { //5kg이 0이면 더 이상 진행불가
				System.out.printf("%d\n",-1);
				break;
			} count5-=1; //5kg짜리 봉지수를 1 줄인다
		}
		
	}

}
