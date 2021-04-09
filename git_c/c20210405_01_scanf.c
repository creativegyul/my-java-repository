#define _CRT_SECURE_NO_WARNINGS //scanf 함수를 사용하기 위해 씀
#include<stdio.h>
int main(void) { //void=없다.
	//입력 함수
	//정수형 입력받기
	//int a;
	//printf("정수는?\n");
	//scanf("%d", &a); //&는 변수 a의 주소연산자
	//printf("입력한 값: %d  주소: %p\n", a, &a); //p: a의 주소를 16진수로

	//실수형 입력받기
	//float b;
	//double c;
	//printf("float 실수는?\n");
	//scanf("%f", &b);
	//printf("더블 실수는?\n");
	//scanf("%lf", &c); //포맷문자 double 일 경우: %lf
	//printf("<입력한 값>\n float: %f %p\n double: %f %p\n", b,&b,c,&c);
	
	//문자형 입력받기
	//char d;
	//printf("문자는?\n");
	//scanf("%c", &d);
	//printf("입력한 문자는 %c\n", d);

	//실습) 두 정수를 입력받아서 합계를 출력
	//int a, b;
	//printf("첫번째 정수?\n");
	//scanf("%d", &a);
	//printf("두번째 정수?\n");
	//scanf("%d", &b);

	//printf("두 수는?");
	//scanf("%d %d", &a, &b);
	//printf("두 정수의 합계는 %d\n", a+b);

	//오늘의 날짜(년, 월, 일)를 입력받아 출력
	//int year, month, day;
	//printf("년월일을 순서대로 입력하세요\n");
	//scanf("%d %d %d", &year, &month, &day);
	//printf("오늘의 날짜는 %d년 %d월 %d일\n", year,month,day);

	//두 정수를 입력받아 산술연산 구하기
	//int c, d;
	/*printf("두 개의 정수를 입력하세요:");
	scanf("%d %d", &c,&d);
	printf("%d + %d = %d\n", c, d, c+d);
	printf("%d - %d = %d\n", c, d, c-d);
	printf("%d * %d = %d\n", c, d, c*d);
	printf("%d / %d = %.2f\n", c, d, (double)c/d);*/

	//엔터 처리하기 위한 예제
	//int a, b;
	//char sign;
	//printf("first? ");
	//scanf("%d", &a);
	//printf("second? ");
	//scanf("%d", &b);
	//한 문자를 읽어서 반환하는 함수
	//getchar(); //(숨겨진)엔터를 처리하기 위한 목적
	//printf("sign? ");
	//scanf("%c", &sign);
	//printf("%d %c %d\n",a,sign,b);

	//실습) 물건 구입 후 거스름돈을 계산하여 출력하는 프로그램
	//int amount, pay; //물건값, 낸돈
	//printf("물건값: ");
	//scanf("%d", &amount);
	//printf("지불한 돈: ");
	//scanf("%d", &pay);
	//pay > amount ?
	//	printf("거스름돈: %d\n", pay - amount) :
	//	pay < amount ? printf("부족한 금액: %d\n",amount-pay) : printf("정산완료\n");

	//실습) 국영수 점수를 입력받아 합계와 평균을 구하는 프로그램
	int ko, eng, math;
	printf("국어: ");
	scanf("%d", &ko);
	printf("영어: ");
	scanf("%d", &eng);
	printf("수학: ");
	scanf("%d", &math);
	int total = ko + eng + math;
	printf("점수총합: %d, 평균: %.2f\n", total, (double)total/3);

	//rgb 값 만들기
	int r, g, b;
	printf("red? "); scanf("%d",&r);
	printf("green? "); scanf("%d",&g);
	printf("blue? "); scanf("%d",&b);
	unsigned int rgb=r<<16|g<<8|b;
	printf("RGB: %0X\n", rgb); // %0X:색상값을 16진수로 출력

	return 0;
}