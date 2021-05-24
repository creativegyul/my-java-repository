package basic01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J20210415_01_array {

	public static void main(String[] args) {
		//배열
		int cnt=5;
		int[] arr; //선언은 stack에
		//배열은 heap에 생성
		//자바는 동적배열
		arr=new int[cnt]; //객체생성해서 주소를 arr에 대입
		arr[0]=10;
		System.out.println(arr[0]);
		//arr[5]=100; //5번 index는 없다->에러
		
		//선언 후 객체 생성
//		int[] arr=new int[5];
//		//1~5값을 대입
//		//arr[0]=1; arr[1]=2; arr[2]=3; arr[3]=4; arr[4]=5;
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=(i+1)*10;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//선언과 초기화: 반드시 사이즈 생략
		//int[] arr=new int[] {10, 20, 30};
//		int[] arr = {10, 20, 30};
//		for (int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		//for~each문 : 단순히 값 확인
//		for(int a: arr) {
//			System.out.println(a);
//		}
//		//Arrays 클래스 이용 문자열 출력 : 단순 확인
//		System.out.println(Arrays.toString(arr)); //오버로딩
//		System.out.println(arr.toString()); //오버라이딩
//		//println 메소드는 toString() 자동으로 실행
//		System.out.println(arr); //-> 주소가 출력됨 (arr은 참조변수)
		
		//실습) 세 학생의 점수를 입력받아 배열에 대입하고 합계, 평균 구하기
		//int[] score= {88,98,77};
//		int[] score=new int[3];
//		int sum=0;
//		//score[0]=88; score[1]=98; score[2]=77;
//		Scanner sc=new Scanner(System.in);
//		for (int i=0;i<score.length;i++) {	
//			System.out.printf("%d번 학생 점수 입력: ",i+1);
//			score[i]=sc.nextInt();
//		}
//		for (int s:score) {
//			sum+=s;
//		}
//		System.out.println("=========================");
//		System.out.printf("합계: %d, 평균: %.2f점\n", sum, (double)sum/score.length);
		
		//문자열 배열
		//String[] arr=new String[] {"java","python","c"};
//		String[] arr= {"java","python","c"};
//		System.out.println(arr);
//		for(String s:arr) {
//			System.out.println(s);
//		}
		
		//실습) 좋아하는 컬러 3개를 입력받아 배열에 저장하고 출력
//		String[] colour=new String[3];
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<colour.length;i++) {
//			System.out.print(i+1 + "번 색 입력: ");
//			colour[i]=sc.nextLine();
//		}
//		System.out.println("===============");
//		for(String s:colour) {
//			System.out.println(s);
//		}
		
		//실습) 피보나치 수열 n개 구하기
//		Scanner sc=new Scanner(System.in);
//		System.out.print("피보나치 수열 갯수는? ");
//		int n=sc.nextInt();
//		int[] fibo=new int[n];
//		fibo[0]=0; fibo[1]=1;
//		for (int i=2; i<n; i++) {
//			fibo[i]=fibo[i-2]+fibo[i-1];
//		}
//		for(int f:fibo) {
//			System.out.print(f+" ");
//		}
		
		//실습) 시험 채점 프로그램
		//정답 배열과 제출한 배열 비교
//		int[] right= {1,3,5,4,2};
//		int[] answer= {2,3,5,4,1};
//		int score=0;
//		for(int i=0;i<right.length;i++) {
//			System.out.println(i+1+"번 정답: "+right[i]+", 대답: "+answer[i]);
//			if(right[i]==answer[i])
//				score+=100/right.length;
//		}
//		System.out.print("점수: "+score);
		
		//실습) 최대값(최소값) 출력
//		int[] arr= {4,6,7,2,5};
		//1안)
//		int max=arr[0], min=arr[0];
//		for (int i=0;i<arr.length;i++) {
//			if (max<arr[i])
//				max=arr[i];
//			if (min>arr[i])
//				min=arr[i];
//		}
		//2안)
//		int max=0; //범위 안의 가장 작은값을 초기값으로
//		int min=10; //가장 큰값
//		for (int i=0;i<arr.length;i++) {
//			if (max<arr[i])
//				max=arr[i];
//			if (min>arr[i])
//				min=arr[i];
//		}
//		System.out.println("최대값: "+max+", 최소값: "+min);
		
		//실습) 선택정렬
		//{2,4,5,6,7}; 오름차순 정렬
		//{7,6,5,4,2}; 내림차순 정렬
		int[] sort={4,6,7,2,5};
		int max, min, temp;
//		for (int i=0;i<sort.length;i++) {
//			min=i;
//			for (int j=i+1;j<sort.length;j++) {
//				if (sort[j] < sort[min])
//					min=j;
//			}
//			temp=sort[min];
//			sort[min]=sort[i];
//			sort[i]=temp;
//		}
//		System.out.print("오름차순 정렬: ");
//		for (int a:sort) {
//			System.out.print(a+" ");
//		}
//		System.out.println();
//		for (int i=0;i<sort.length;i++) {
//			max=i;
//			for (int j=i+1;j<sort.length;j++) {
//				if (sort[j] > sort[max])
//					max=j;
//			}
//			temp=sort[max];
//			sort[max]=sort[i];
//			sort[i]=temp;
//		}
//		System.out.print("내림차순 정렬: ");
//		System.out.println(Arrays.toString(sort));
		
		//오름차순 2안)
//		for (int j=0; j<sort.length-1;j++) {
//			min=sort[j];
//			int minIndex=j; //가장 작은값의 index
//			for (int i=j+1;i<sort.length;i++) {
//				if (sort[i] < min) {
//					min=sort[i];
//					minIndex=i;
//				}
//			}
//			System.out.println(min);
//			System.out.println(minIndex);
//			//두 수를 바꾸기
//			sort[minIndex]=sort[j];
//			sort[j]=min;
//			System.out.println(Arrays.toString(sort));
//		}
		
		//실습) 로또번호 맞힌 갯수 출력
		//int의 범위
		System.out.println("Max: "+Integer.MAX_VALUE);
		System.out.println("Min: "+Integer.MIN_VALUE);
		//로또번호 6개 만들기
		//1)(int)(Math.random()*100+1);
		//2)Random()
		int[] no= {9,12,21,25,33,42};
		int[] lotto=new int[6];
		Random r=new Random();
		int correct=0;
		for (int i=0;i<lotto.length;i++) {
			boolean b=false; //기존 넘버가 없다는 가정 하에 시작
			int random=r.nextInt(45)+1;
			//기존에 번호가 등록되어 있다면
			for(int j=0;j<i;j++) {
				if (lotto[j]==random) {
					i--;
					b=true; //겹치는 숫자가 존재
					break;
				}
			}
			//if (b) continue; //기존에 존재한다면 계속
			if (!b) lotto[i]=random; //존재하지 않는다면 값을 대입
//			System.out.println(i+1+"번째 로또번호: "+lotto[i]);
//			if (lotto[i]==no[i])
//				correct++;
		}
//		System.out.println("맞힌 갯수: "+correct);
		Arrays.sort(lotto); //오름차순 정렬
		System.out.println(Arrays.toString(lotto));
		
		//배열의 복사
		//얕은 복사: 주소가 복사됨
//		int[] src= {1,2,3,4,5};
//		int[] dest=src;
//		System.out.println(src);
//		System.out.println(dest);
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		System.out.println("----------------");
//		src[1]=20; dest[3]=40;
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
		
		//깊은 복사: 값을 복사
//		int[] src= {1,2,3,4,5};
//		int[] dest=new int[6];
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		for (int i=0;i<src.length;i++) {
//			dest[i]=src[i];
//		}
//		dest[5]=6;
//		System.out.println("src:"+Arrays.toString(src));
//		System.out.println("dest:"+Arrays.toString(dest));
//		src=dest;
//		System.out.println("src:"+Arrays.toString(src));
//		System.out.println("dest:"+Arrays.toString(dest));
		
		//프레임워크를 이용한 데이터 추가
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		System.out.println(arr);
		
		//배열의 깊은 복사
		int[] src= {1,2,3,4,5}; //원본(복사할 배열)
		int[] dest= {0,0,0,0,0}; //카피본(덮어쓸 배열)
		System.arraycopy(src, 2, dest, 0, 3);
		System.out.println("src:"+Arrays.toString(src));
		System.out.println("dest:"+Arrays.toString(dest));
		
	}

}
