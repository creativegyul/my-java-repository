#include <stdio.h> //standard input output-함수의 헤더파일
int main() { //main 함수-진입점 함수, Only 1
	//printf함수: 콘솔화면에 출력
	//printf("Hello C");
	//printf("\n안녕 C\n");
	//printf("%d+%d=%d\n", 10,20,10+20);
	printf("원주율은 %.2f\n", 3.14);
	printf("%c1000\n",'$'); //문자 하나=작은따옴표, 문자열(여러 문자)=큰따옴표
	printf("나의 이름은 %s\n", "킴"); //%c=문자, %s=문자열
	return 0;
}