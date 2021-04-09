#include<stdio.h>
int main() {
	//연산자(+,-,*,/,%)
	//정수와 정수=>정수
	//실수와 정수=>실수
	//int a = 20, b = 3;
	//printf("%d + %d = %d\n", a, b, a + b);
	//printf("%d - %d = %d\n", a, b, a - b);
	//printf("%d * %d = %d\n", a, b, a * b);
	//printf("%d / %d = %d\n", a, b, a / b); //몫
	//printf("%d / %d = %f\n", a, b, (double)a/b);
	//printf("%d %% %d = %d\n", a, b, a % b); //나머지

	//실습)
	//int c = 50, d = 3;
	//printf("몫: %d\n",c/d);
	//printf("나머지: %d\n",c%d);
	//printf("나눈 실수값: %f\n",(double)c/d);

	//단항연산자
	//++,--
	//앞에 붙이면 전위, 뒤에 붙이면 후위
	//int a = 10;
	//++a; //a += 1; //a = a + 1;
	//printf("%d\n", a);
	//a--; //a -= 1;//a = a - 1;
	//printf("%d\n", a);
	//int a1 = 20;
	//printf("%d\n", a1++); //출력을 하고 증가해라
	//printf("%d\n", a1);
	//printf("%d\n", ++a1); //증가하고 출력해라

	//실습)
	//int a2 = 10;
	//int b = --a2;
	//int c = b++;
	//b = ++a2;
	//printf("%d %d %d\n", a2, b, c);

	//관계연산자
	int n = 10, m = 20;
	printf("%d\n", n < m); //1:True
	printf("%d\n", n > m); //0:False
	printf("%d\n", n == m); //0:False
	printf("%d\n", n != m); //1:True

	//논리연산자: &&=and, ||=or, !=not
	int e = 10, f = 20;
	printf("%d\n", e > 0 && f > 0);
	printf("%d\n", e > 0 && f < 0);
	printf("%d\n", e > 0 || f < 0);
	printf("%d\n", !(e > 0)); //1->0, 0->1

	//비트연산자:&,|,~,^
	//printf("%d\n", 4 & 3);
	//printf("%d\n", 4 | 3);
	//시프트 연산자
	//printf("%d\n", 4>>2); //오른쪽으로 두비트 밀기
	//printf("%d\n", 4<<1); //왼쪽으로 한비트 밀기

	//삼항 연산자
	int x = 10;
	x > 0 ? printf("양수\n") : printf("음수\n");

	//두 수중 큰수를 출력
	int x1 = 10, x2 = 20;
	x1 > x2 ? printf("%d\n", x1) : printf("%d\n", x2);
	int x3 = x1 > x2 ? x1:x2;
	printf("%d\n", x3);

	//실습) 20, 10, 30의 3개의 정수가 주어졌을때 가장 큰 값을 구하는 프로그램
	int a = 20, b = 10, c = 30;
	//int max = a > b ? a : b;
	//max = max > c ? max : c;
	//printf("가장 큰 값은 %d 입니다.\n", max);

	int max=a > b ? (a > c ? a : c) : (b > c ? b : c);
	printf("가장 큰 값: %d\n", max);

	//실습) 어떤 정수가 주어졌을때 짝/홀수를 판별하여 출력
	int d=12;
	d % 2 == 0 ? printf("%d:짝수\n", d) : printf("%d:홀수\n", d);
	//포인터 변수를 이용해서 출력
	char*p = d % 2 == 0 ? "짝수" : "홀수"; //p는 변수
	printf("%d는 %s\n", d, p);

	return 0;
}