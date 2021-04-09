#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h> //문자열 관련 함수들을 포함하는 헤더파일
int main() {
	//문자
	//char c;
	//scanf("%c", &c); //포맷에 따라 여러 데이터타입을 입력받을수 있음
	//printf("문자:%c\n", c);

	//에코기능이 있음
	//int c = getchar(); //문자 입력 전용함수
	//printf("입력문자: %c %d\n",c,c);
	//putchar(c); //문자 출력 전용함수
	
	//getch()함수: 에코기능이 없고 Enter를 누르지 않아도 바로 출력
	//char c = getch(); 
	//printf("입력문자:\n");
	//putchar(c);

	//실습) 비밀번호 4자리를 입력하면 *가 출력
	//char pw[5];
	//printf("password?");
	//for (int i = 0; i < 4; i++){
	//	pw[i] = getch();
	//	putchar('*');
	//}
	//pw[4] = '\0';
	//printf("\n비밀번호:%s\n", pw);

	//문자열
	//char s[6]="hello"; //hello: 5글자 + nul문자 \0
	//char s[6]; //배열의 이름은 주소이다.
	//scanf("%s", s); //때문에 주소 연산자 필요 없음. 
	//printf("%s\n", s);

	//문자열 전용 입출력 함수: 공백을 처리 가능 / 반면 scanf는 공백=입력으로 여김
	//char name[20];
	//printf("이름은? ");
	//gets(name);
	//printf("Your name is "); puts(name);

	//문자열 전용함수
	char namey[10] = "hong";
	//namey = "kim"; 안됨
	strcpy(namey,"kim"); //함수에 주소를 넘김(call by reference)
	puts(namey);

	//실습) 문자열 call by reference를 입력하고 값, 길이, 주소 출력
	//char a[20];
	//printf("문자열 입력: ");
	//gets(a);
	//printf("값: "); puts(a);
	//printf("길이: %d\n", strlen(a));
	//printf("주소: %p", a);

	//피보나치의 수열 구하기
	//0 1 1 2 3 5 8 13 .....
	int fibo[20];
	fibo[0] = 0; fibo[1] = 1;
	for (int i = 2; i < 20; i++) {
		fibo[i]=fibo[i-2]+fibo[i-1];
	}
	//0 1 2 3 4 5 6 7  8  9  10
	//0 1 1 2 3 5 8 13 21 34 55
	//[2]=[2-2=0]+[2-1=1]=1
	//[3]=[3-2=1]+[3-1=2]=2
	//[4]=[4-2=2]+[4-1=3]=3
	//[5]=[5-2=3]+[5-1=4]=5
	//[6]=[6-2=4]+[6-1=5]=8
	//[7]=[7-2=5]+[7-1=6]=13
	//[8]=[8-2=6]+[8-1=7]=21
	//[9]=[9-2=7]+[9-1=8]=34
	//[10]=[10-2=8]+[10-1=9]=55

	//출력
	for (int i = 0; i < 20; i++){
		printf("%d ", fibo[i]);
	}

	return 0;
}