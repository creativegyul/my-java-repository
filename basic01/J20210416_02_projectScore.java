package basic01;

import java.util.Scanner;

public class J20210416_02_projectScore {

	public static void main(String[] args) {
		//실습) 두 학생의 국영수 점수를 입력받아 배열에 저장
		Scanner sc=new Scanner(System.in);
		String[] sub= {"국어","영어","수학"};
		int[][] score=new int[2][3]; //점수배열
		while(true) {
			//타이틀
			System.out.println("=======================");
			System.out.println("성적관리프로그램 V1.0.0");
			System.out.println("=======================");
			System.out.println("1. 성적등록");
			System.out.println("2. 학생별 합계/평균");
			System.out.println("3. 과목별 합계/평균");
			System.out.println("4. 종료");
			System.out.println("-----------------------");
			System.out.print("번호입력: ");
			int no=sc.nextInt();
			System.out.println("-----------------------");
			switch(no) {
			case 1:
				//점수 입력받기
				for (int i=0;i<score.length;i++) {
					System.out.println("["+(i+1)+"번 학생]");
					for(int j=0;j<score[i].length;j++) {
						System.out.printf("%s 점수입력: ", sub[j]);
						score[i][j]=sc.nextInt();
					}
					System.out.println("-----------------------");
				}
				break;
			case 2:
				//학생별 합계와 평균 구하기
				for (int i=0;i<score.length;i++) {
					int sum=0;
					for (int j=0;j<score[i].length;j++) {
						sum+=score[i][j];
					}
					System.out.printf("[%d번] 합계: %d, 평균: %.2f\n",i+1,sum,(double)sum/score[i].length);
				}
				System.out.println("-----------------------");
				break;
			case 3:
				//과목별 합계, 평균 구하기
				for (int j=0;j<score[0].length;j++) {
					int sum=0;
					for (int i=0;i<score.length;i++) {
						sum+=score[i][j];
					}
					System.out.printf("%s 합계: %d, 평균: %.2f\n",sub[j],sum,(double)sum/score.length);
				}
				System.out.println("-----------------------");
				break;
			case 4:
				System.out.println("종료합니다.");
				System.exit(0); //프로그램 종료. 0==정상 종료
			default:
				System.out.println("잘못된 입력입니다.");
			}
			sc.nextLine(); //버퍼 비우기
			System.out.println("돌아가려면 Enter를 누르세요.");
			sc.nextLine(); //홀딩
		}
		
	}

}
