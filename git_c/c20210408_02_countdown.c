#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <Windows.h>

//매개변수: 카운트다운 초
//반환값: 없음
//함수의 기능: 카운트다운을 출력
void countd(int a) {
	for (int i = a; i > -1; i--) {
		Sleep(1000);
		printf("%d\n", i);
	}
}

int main() {
	////카운트다운
	//printf("카운트 시작\n");
	//for (int i = 5; i>-1; i--){
	//	Sleep(1000); // 1/1000초 단위
	//	printf("%d\n", i);
	//}
	//printf("발사\n");
	
	printf("카운트 시작\n");
	countd(3);
	printf("발사\n");

	return 0;
}