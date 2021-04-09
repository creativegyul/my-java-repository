#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//do ~while
	//int a=-1;
	//do {
	//	printf("%d\n",a); //최소 한번은 실행
	//} while (a>0);

	//사용자에게 입력을 받아서 y이면 계속 플레이
	//char answer;
	//do {
	//	printf("Now Playing...\n");
	//	printf("계속 플레이할까요(y)? ");
	//	scanf("%c",&answer);
	//	getchar(); //엔터값 처리
	//} while (answer == 'y');

	//실습) 어떤 정수를 계속 입력받아서 합계를 더하고 0을 입력할 경우 종료
	int a, sum=0;
	do {
		printf("정수를 입력하세요:");
		scanf("%d",&a);
		sum += a;
	} while (a!=0);
	printf("지금까지 더한 수는 %d\n",sum);
	
	return 0;
}