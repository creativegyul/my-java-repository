#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//전역변수
//int sum;

//매개변수로 정수를 입력받아 누적하는 함수, 리턴값: 누적합계
int usersum(int a) {
	//static변수
	//함수가 최초로 실행됐을때 생성, 프로그램 종료시 소멸
	//선언된 함수 안에서만 접근가능
	static int sum=0;
	sum += a;
	return sum;
}

//매개변수: 없음, 리턴값: 이 함수를 실행한 횟수
//함수이름: countTest
int countTest() {
	static int cnt=0;
	cnt++;
	return cnt;
}

int main() {
	//전역변수, 지역변수 사용 예
	printf("누적:%d\n",usersum(10));
	printf("누적:%d\n",usersum(20));

	//반복문을 이용해서
	for (int i = 0; i < 10; i++){
		printf("%d\n", countTest()); //countTest만 찍으면 함수의 주소가 출력됨
	}

	return 0;
}
//Stack 메모리 구조-FILO: Last Input, First Out (나오는 기준) [지역변수, 매개변수 등]
//Static 메모리 구조-전역변수처럼 메모리가 프로그램 종료할때까지 소멸되지 않음
//Queue 구조-FIFO: 튜브처럼 긴 통로
//힙 영역-malloc(): 힙 영역에 메모리 공간을 할당하는 함수(동적 할당)