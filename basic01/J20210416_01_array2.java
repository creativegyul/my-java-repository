package basic01;

import java.util.Scanner;

public class J20210416_01_array2 {

	public static void main(String[] args) {
		//2차원 배열
		//int[][] arr2=new int[3][4];
		//int[][] arr2=new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//		int[][] arr2= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		//System.out.println(arr2[1][2]);
//		for (int i=0;i<arr2.length;i++) {
//			for (int j=0;j<arr2[i].length;j++) {
//				System.out.printf("%3d", arr2[i][j]);
//			}
//			System.out.println();
//		}
		//for each 
//		for(int[] a:arr2) {
//			for (int b:a) {
//				System.out.print(b+" ");
//			}
//		}
		
		//1~12 대입: 반복문 이용
//		int[][] arr=new int[3][4];
//		//int no=0;
//		for (int i=0;i<arr.length;i++) {
//			for (int j=0;j<arr[i].length;j++) {
//				//arr[i][j]=++no;
//				arr[i][j]=i*4+j+1;
//				System.out.print(arr[i][j]+" ");
//			}
//		}
		
		//실습) 두 학생의 국영수 점수를 입력받아 배열에 저장하고 각자의 합계, 평균 출력
		Scanner sc=new Scanner(System.in);
		String[] sub= {"국어","영어","수학"};
		int[][] score=new int[2][3]; //점수배열
		//점수 입력받기
		for (int i=0;i<score.length;i++) {
			System.out.println("["+(i+1)+"번 학생]");
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%s 점수입력: ", sub[j]);
				score[i][j]=sc.nextInt();
			}
			System.out.println("-----------------------");
		}
		//학생별 합계와 평균 구하기
		for (int i=0;i<score.length;i++) {
			int sum=0;
			for (int j=0;j<score[i].length;j++) {
				sum+=score[i][j];
			}
			System.out.printf("[%d번] 합계: %d, 평균: %.2f\n",i+1,sum,(double)sum/score[i].length);
		}
		System.out.println("-----------------------");
		//과목별 합계, 평균 구하기
		for (int j=0;j<score[0].length;j++) {
			int sum=0;
			for (int i=0;i<score.length;i++) {
				sum+=score[i][j];
			}
			System.out.printf("%s 합계: %d, 평균: %.2f\n",sub[j],sum,(double)sum/score.length);
		}
		
	}

}
