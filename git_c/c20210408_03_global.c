#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//전역변수: 프로그램 시작시 생성, 프로그램 종료시 소멸
//어디서든 사용 가능
//자동 초기화: int-0, float-0.0, char-공백 등
//전역변수의 무분별한 선언은 주의, 프로그램의 복잡도, 메모리 사용 증가
int g;
int r; //원의 반지름

void test() {
	//printf("a:%d\n", a);
	printf("g:%d\n", g);
	//사각형의 반지름
	r = 20;
	printf("사각형 넓이:%d\n",r*r);
}
int main() {
	//전역변수와 지역변수
	int a=10; //지역변수: 함수가 시작될때 생성, 함수가 종료되면 소멸
	//선언된 {}안에서만 사용가능
	printf("a:%d\n", a);
	printf("g:%d\n", g);

	return 0;
}