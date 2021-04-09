#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//매개변수: 없음, 반환값: 없음
void voidTest() {
	printf("void 함수\n");
}
//매개변수: 1개, 반환값: 없음
void voidTest2(int a) {
	printf("매개변수:%d\n",a);
}
//매개변수: 2개, 반환값: 없음
void voidTest3(int a, int b){
	printf("두 수의 합:%d\n",a+b);
}
//원의 넓이를 출력해주는 기능
//매개변수: 반지름
//함수의 이름: area, 매개변수 이름: r(double) //값이 넘어가는 함수: call by value 방식
void area(double r2) { //지역변수 r2: 함수실행시 값 생성, 함수종료시 소멸
	printf("원의 넓이:%.2f", r2 * r2 * 3.14);
}
//원의 넓이를 구해서 반환하는 함수
//매개변수: 반지름(double), 반환값: 원의 넓이(double)
double areaReturn(double r) {
	double area = r * r * 3.14;
	return area; //반환값은 무조건 1개
}
//세 정수를 매개변수로 받아 합을 반환하는 함수
int sum(int x, int y, int z) {
	return x + y + z;
}
//두 개의 정수를 매개변수로 받아서 나눈 실수값을 반환하는 함수
float divide(int a, int b) {
	return (float)a / b;
}
//실습) 두 수를 매개변수로 받아서 두 수중 큰 수를 반환하는 함수
int bigR(int x, int y) {
	if (x > y) return x;
	else if (x < y) return y;
	else return 0; //두 수가 같을 때는 0을 리턴
}

//진입점 함수
int main() {
	//함수
	//voidTest();
	//voidTest2(10);
	//voidTest3(20,30); //형과 개수 일치
	//
	//double r; //지역변수 r
	//printf("반지름은? ");
	//scanf("%lf",&r); //scanf()함수에 주소를 넘김(call by reference)
	//area(r);
	//printf("%d\n", r2); (출력불가) //r2=>함수의 역할이 끝나면 사라짐
	//
	//double r = 3.6;
	//double rValue = areaReturn(r); //double형 리턴시 double형으로 선언
	//printf("원의 넓이:%.2f\n",rValue);
	//
	//printf("합계:%d\n", sum(2,3,5));
	////int a=sum(2,3,5);
	////printf("합계:%d\n",a);
	//
	//int a = 3, b = 5;
	//float d = divide(a, b);
	//printf("나눈 값:%.2f\n", d);

	int a = 5, b = 5;
	int m = bigR(a,b);
	if (m != 0) printf("큰 값:%d\n", m);
	else printf("%d와 %d는 동일\n",a,b);

	return 0;
}