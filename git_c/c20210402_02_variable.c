#include <stdio.h>
int main() {
	//정수형 변수명 선언
	int a; //4byte
	a = 10; //초기화: 변수 a의 값=10
	printf("%d\n",a);
	//실수형 변수선언
	float b; //4byte
	double c; //8byte
	b = 3.14123456789; //초기화
	c = 3.14123456789;
	printf("%.12f, %.12f\n", b,c);
	
	//문자형
	//선언과 동시에 초기화
	char d = 'A';
	printf("문자는 %c %d\n",d,d); //%d=문자의 ASCII 코드값

	//자료형의 바이트수
	int e = 100;
	printf("정수형:%d\n",sizeof(e)); //sizeof 연산자
	float f = 3.14;
	double g = 3.14;
	printf("플로트형:%d, 더블형:%d\n",sizeof(f),sizeof(g));
	char h = 'a';
	printf("캐릭터형:%d\n",sizeof(h));

	//문자열
	//배열의 이름(i)은 주소를 가지고 있다: 상수
	//배열의 크기는 문자열의 크기+1
	//선언과 동시에 초기화 시에는 배열의 크기 생략가능
	//char i[6]="hello"; //선언:hello[1byte*(5 + nul문자 \0)]
	//i = "hello"; //상수이기 때문에 불가
	char i[] = "hello";
	printf("문자열:%s 크기:%d\n", i,sizeof(i));
	printf("5번:%c\n", i[5]);

	return 0;
}