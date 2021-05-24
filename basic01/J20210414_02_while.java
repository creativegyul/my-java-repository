package basic01;

import java.util.Scanner;

public class J20210414_02_while {

	public static void main(String[] args) {
		//반복문: while
		//원의 넓이 구하기
		//0을 입력하면 종료
		Scanner sc=new Scanner(System.in);
		//1안)
//		double r; //반지름
//		while (true) {
//			System.out.print("반지름은? ");
//			r=sc.nextDouble();
//			if (r==0) {
//				System.out.println("종료합니다."); break;
//			}
//			System.out.println("넓이는 "+r*r*3.14);
//		}
		//2안)
//		double r=1; //반지름
//		while(r!=0) {
//			System.out.print("반지름은? ");
//			r=sc.nextDouble();
//			System.out.println("넓이는 "+r*r*3.14);
//		}
		//3안)
//		double r; //반지름
//		do {
//			System.out.print("반지름은? ");
//			r=sc.nextDouble();
//			System.out.println("넓이는 "+r*r*3.14);
//		} while(r!=0);
		
		//참고) 1~10까지의 합계를 출력
//		int a=0, s=0;
//		while(true) {
//			a++;
//			if (a>10) break; //true일때 if로 break
//			s+=a;
//		}
//		System.out.println("합계: "+s);
		
		//실습) 1부터 n까지의 수 더하기
		int i=0, sum=0;
		System.out.print("마지막 수는? ");
		int n=sc.nextInt();
		while(i<n) {
			i++; //i=i+1;
			sum+=i; //sum=sum+i;
//			sum+=++i;
		}
		System.out.println("합계: "+sum);
		
	}

}
