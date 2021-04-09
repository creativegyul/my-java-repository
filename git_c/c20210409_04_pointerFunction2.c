#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

void arrayPrint(int argc,char*argv[]) { //char*argv[](배열의 포인터)==char**argv(포인터의 포인터)
	for (int i = 0; i < argc; i++){
		printf("%s\n", argv[i]);
	}
}
int main(int argc, char*argv[]) {
	//이차 문자열 배열의 매개변수
	//char str[][7] = {"python","c","java"};
	//char* p[3] = str;
	char* p[3] = {"python", "c", "java"}; //포인터의 배열
	//printf("%d %d %d\n", p[0],p[1],p[2]); //주소 출력

	//함수로 처리
	//for (int i = 0; i < 3; i++) { //i는 포인터의 index의 갯수
	//	printf("%s\n",p[i]);
	//}
	arrayPrint(3, p);

	//다차원 배열의 포인터
	//char arr[][7] = { "python", "c", "java" };
	//char(*p)[7] = arr;
	//printf("%d %d %d\n", p, p+1, p+2);
	
	return 0;
}