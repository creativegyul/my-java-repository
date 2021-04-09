#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//다차원 배열
	int arr[2][3];
	//arr[0][0] = 1; arr[0][1] = 2; arr[0][2] = 3;
	//arr[1][0] = 4; arr[1][1] = 5; arr[1][2] = 6;
	//arr == arr[0] == &arr[0][0]

	int rsize = sizeof(arr)/sizeof(arr[0]); // 24 / 12 = 행의 갯수
	int csize = sizeof(arr[0]) / sizeof(int); // 12 / 4 = 열의 갯수
	//int csize = sizeof(arr) / rsize / sizeof(int);
	printf("사이즈:%d\n", rsize);
	printf("사이즈:%d\n", csize);

	for (int i = 0; i < 2; i++) { //행
		for (int j = 0; j < 3; j++) { //열
			arr[i][j] = (i*3)+(j+1);
			printf("%d\n",arr[i][j]);
		}
	}

	//실습) 반 학생의 국영수 점수를 입력받아 순서대로 배열에 저장하고
	//번호 순서대로 총점과 평균을 출력하는 프로그램
	//추가 1) 국/영/수 평균 구하기
	int bae[2][3];
	//int row = sizeof(bae) / sizeof(bae[0]);
	//int cullum = sizeof(bae[0]) / sizeof(int);
	//for (int i = 0; i < row; i++) {
	//	printf("%d번 국어 영어 수학:",i+1);
	//	for (int j=0;j<cullum;j++) {
	//		scanf("%d",&bae[i][j]);
	//	}
	//	
	//}
	//printf("--------------------------\n");
	//합계, 평균 출력
	for (int i = 0; i < row; i++) {
		int total = 0;
		for (int j=0;j<cullum;j++) {
			total += bae[i][j];
		}
		//합계, 평균
		printf("%d번 합계: %d, 평균: %.2f\n", i+1,total,(double)total/cullum);
	}
	//국영수 평균 구하기
	//bae[0][0]+bae[1][0] = 국어의 합계

	for (int j = 0; j < 3;j++) {
		for (int i = 0; i < 2; i++) {
			printf("%d", bae[i][j]);
		}

	}
	
	return 0;
}