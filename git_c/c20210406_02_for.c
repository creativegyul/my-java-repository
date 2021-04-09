#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//반복문: for
	//int i; //반복할 변수
	//for (i = 0; i < 10; i++) {
	//	printf("%d\n",i);
	//}

	//실습) 구구단 출력
	//int a;
	//printf("단수? ");
	//scanf("%d",&a);
	//for (int b=1;b<10;b++) {
	//	printf("%d * %d = %d\n",a,b,a*b);
	//}

	//사용자가 0을 입력하면 종료하는 구구단
	//int dan;
	//while (1) {
	//	printf("단수? ");
	//	scanf("%d", &dan);
	//	if (dan == 0) break;
	//	for (int no = 1; no < 10; no++) {
	//		printf("%d * %d = %d\n", dan, no, dan * no);
	//	}
	//}
	//do {
	//	printf("단수? ");
	//	scanf("%d", &dan);
	//	if (dan != 0)
	//		for (int no = 1; no < 10; no++) {
	//			printf("%d * %d = %d\n", dan, no, dan * no);
	//		}
	//} while (dan!=0);

	//이중 for 예제) 구구단 1~9단
	//for (int i = 2;i<10;i++) {
	//	printf("-------------\n");
	//	printf("[%d단]\n",i);
	//	for (int j=1;j<10;j++) {
	//		printf("%d * %d = %d\n",i,j,i*j);
	//	}
	//}

	//3중 for
	//for (int i = 0; i < 10; i++)
	//	for (int j=0; j < 10; j++)
	//		for (int k=0; k < 10; k++)
	//			printf("%d %d %d\n",i,j,k);

	//실습) 1부터 100까지의 합
	//int sum = 0;
	//for (int i=1;i<101;i++) {
	//	sum += i;
	//}
	//printf("1부터 100까지의 합은 %d\n", sum);

	//1부터 입력 받은 수까지의 합
	//int n, total = 0;
	//printf("n값은?:");
	//scanf("%d", &n);
	//for (int i = 1; i < n + 1; i++) { //i는 for의 지역변수
	//	total += i;
	//}
	//printf("1부터 %d까지의 합은 %d\n", n, total);

	//두 정수를 입력받아 큰 수에서 작은수를 뺀 값을 구하는 프로그램
	//0을 입력하면 프로그램 종료
	//최대 반복횟수는 10번
	//int x, y;
	//for (int i=0;i<10;i++) {
	//	printf("두 수는? ");
	//	scanf("%d",&x);
	//	if (x == 0) {
	//		printf("종료합니다\n"); break;
	//	}
	//	scanf("%d",&y);
	//	if (x > y) printf("%d - %d = %d\n", x, y, x - y);
	//	else printf("%d - %d = %d\n", y, x, y - x);
	//}
	
	//별찍기 1)
	for (int i = 0; i < 7; i++) {
		for (int j=0; j < i+1; j++) {
			printf("*");
		}
		printf("\n");
	}
	//별찍기 2)
	for (int i = 0; i < 7; i++) {
		for (int j = 0; j < 7-i; j++) {
			printf("♥");
		}
		printf("\n");
	}
	//for (int i = 7; i > 0; i--) {
	//	for (int j = 0; j < i; j++) {
	//		printf("♥");
	//	}
	//	printf("\n");
	//}
	//별찍기 3)
	for (int i = 0; i < 7; i++) {
		for (int j = 0; j < 6-i; j++) {
			printf("☆");
		}
		for (int j = 0; j < i+1; j++) {
			printf("★");
		}
		printf("\n");
	}
	//별찍기 4)
	for (int i = 0; i < 6; i++) {
		for (int j = 0 ; j < 6-i; j++) {
			printf(" ");
		}
		for (int j = 0; j < i*2+1; j++) {
			printf("★");
		}
		for (int j = 0; j < 6-i; j++) {
			printf(" ");
		}
		printf("\n");
	}
	//실습) n! 팩토리얼(1*2*3...*n) 구하기
	int n = 5;
	int total = 1; //곱한 값 누적변수
	for (int i = 1; i < n+1; i++) {
		total *= i;
	}
	printf("1부터 %d까지 곱한 값은 %d\n",n,total);

	//1부터 10까지의 정수에서 합이 10이 되는 두 수를 구하는 프로그램
	for (int i=1;i<10;i++) {
		for (int j = i; j < 10; j++) {
			if (i+j==10) printf("(%d, %d)\n",i,j);
		}
	}

	//실습) 점심메뉴 고르기
	//메뉴를 고르면 가격과 해당 코너를 출력하는 프로그램
	//단 메뉴를 잘못 입력하면 다시 메뉴선택, q를 입력하면 종료
	char menu;
	do {
		printf("-----------------------------------------\n");
		printf("1.짬뽕 2.자장면 3.불고기 4.햄버거 q:종료 \n");
		printf("-----------------------------------------\n");
		scanf("%c", &menu);
		getchar();
		if (menu == '1') {
			printf("가격: 6000원\nA코너로 가세요\n"); break;
		}
		else if (menu == '2') {
			printf("가격: 4500원\nB코너로 가세요\n"); break;
		}
		else if (menu == '3') {
			printf("가격: 6500원\nC코너로 가세요\n"); break;
		}
		else if (menu == '4') {
			printf("가격: 5500원\nD코너로 가세요\n"); break;
		}
		else if (menu == 'q') { printf("종료\n"); break; }
		else printf("잘못된 입력\n");
	} while (menu != 'q');

	return 0;
}