#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//이차배열의 포인터
	//int arr[][3] = { {1,2,3},{4,5,6} }; //행 표기는 생략가능
	//int* p = arr;
	//for (int i = 0; i < 6; i++) {
	//	printf("%d ", *p++);
	//}

	//두명의 학생의 국영수 점수를 저장
	int score[][3] = { {90,89,77}, {89,99,88} };
	int sum = 0; double avg;
	int(*p)[3] = score; //3씩 건너뛰는 int형 포인터의 첫 주소-score
	//int*p[3]; 괄호 주의-포인터의 배열됨
	//printf("%d %d\n", p, p+1); //주소 10진수로 출력

	for (int i=0;i<2;i++) {
		sum = (*p)[0] + (*p)[1] + (*p)[2];
		avg = sum / 3.;
		printf("합계:%d, 평균:%.2f\n",sum,avg);
		p++;
	}

	return 0;
}