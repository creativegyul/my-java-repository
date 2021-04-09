#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//함수: call by reference
//주소를 매개변수로 받는다
//main함수의 a의 값을 변경 가능
void change(int*p) { //매개변수 p(주소)
	*p = 20; //p(주소)의 값(=a값, *p)에 20을 더함
}
void change2(int*a, int*b) {
	int temp = *a;
	*a = *b;
	*b = temp;
}
void sumCal(int* a, int* b) {
	*b += *a;
}
int main() {
	int a=10;
	//함수에 포인터 넘기기
	//int* p=&a;
	//change(p);
	change(&a);
	//scanf("%d",&a); //scanf또한 call by reference 방식이다.
	printf("a:%d\n", a);

	//두 수 바꾸기
	int x = 10, y = 20;
	change2(&x,&y);
	printf("x:%d y:%d\n", x, y);

	//반복문을 이용해서 입력받은 값을 함수를 이용해 누적
	int n, sum=0;
	printf("정수입력(0은 종료):");
	while (1) {
		scanf("%d",&n);
		sumCal(&n,&sum);
		if (n == 0) break;
	}
	printf("누적합계:%d\n", sum);

	return 0;
}