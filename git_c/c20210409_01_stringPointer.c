#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//문자열의 포인터
	char str[]="happy";
	//str="angry"; //str은 상수-변경불가
	char* p = str;
	printf("%s\n", p); 
	p = "python"; //p는 변수, str의 주소-변경가능
	puts(p); //문자열 전용함수

	//이름을 입력받고 저장, 출력 (포인터 사용)
	char s[20];
	char* po = s;
	while (1) {
		printf("Name?:");
		gets_s(po,10);
		if (s[0] == 'q') break;
		printf("Your name is %s\n",po);
	}

	return 0;
}