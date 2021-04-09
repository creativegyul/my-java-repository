#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//조건식이 참일때 수행할 문장, 거짓일때 수행할 문장을 구별
	int num1 = 10, num2 = 20;
	if (num1 > num2) {
		printf("%d이 %d보다 더 크다\n", num1, num2);
	}
	else {
		printf("%d이 %d보다 크지 않다\n", num1,num2);
	}

	//표현을 간단하게
	int a = 0;
	if (a > 0)
		printf("양수\n");
	else if (a < 0) //중첩if문
		printf("음수\n");
	else
		printf("양수도 음수도 아님\n");

	//실습) 두 정수를 입력받아 큰 수를 출력(두 수는 같을수도 있다)
	//int a1, a2;
	//printf("두 정수를 입력>\n");
	//scanf("%d %d", &a1, &a2); //*call by reference
	//if (a1 > a2)
	//	printf("더 큰수: %d\n", a1);
	//else if (a1 < a2)
	//	printf("더 큰수: %d\n", a2);
	//else
	//	printf("두 수는 같다\n");

	//점수를 입력받아 학점을 출력하는 프로그램
	//(90이상 A, 80이상 B, 70이상 C, 60이상 D, 60미만 F)
	//int score;
	//printf("점수: ");
	//scanf("%d", &score);
	//if (score > 100 || score < 0)
	//	printf("잘못된 점수입니다\n");
	//else if (score >= 90)
	//	printf("A\n");
	//else if (score >=80)
	//	printf("B\n");
	//else if (score >=70)
	//	printf("C\n");
	//else if (score >=60)
	//	printf("D\n");
	//else
	//	printf("F\n");

	//국영수 점수를 입력받아 총점과 평균을 출력
	//(단 60점 미만이 한과목이라도 있으면 과락)
	/*int ko, eng, math;
	printf("국어/영어/수학? ");
	scanf("%d/%d/%d", &ko, &eng, &math);
	int total = ko + eng + math;
	if (ko < 60||eng < 60||math < 60)
		printf("과락\n");
	else printf("총점: %d, 평균: %.2f\n", total, (double)total / 3);*/

	//년도를 입력받아 윤년여부를 출력
	int yoon;
	printf("연도: ");
	scanf("%d", &yoon);
	if (yoon % 4 == 0 && yoon % 100 != 0 || yoon % 400 == 0)
		printf("%d년은 윤년\n", yoon);
	else printf("%d년은 윤년이 아닙니다\n", yoon);

	//메뉴판: 1.자장면 2.짬뽕 3.설렁탕 4.비빔밥 5.피자 6.스파게티
	int menu;
	printf("1.자장면 2.짬뽕 3.설렁탕 4.비빔밥 5.피자 6.스파게티\n번호를 입력:");
	scanf("%d", &menu);
	if (menu == 1 || menu == 2)
		printf("중식코너\n");
	else if (menu == 3 || menu == 4)
		printf("한식코너\n");
	else if (menu == 5 || menu == 6)
		printf("양식코너\n");
	else
		printf("잘못된 번호\n");

	return 0;
}