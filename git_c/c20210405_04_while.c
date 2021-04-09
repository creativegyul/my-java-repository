#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//반복문: while
	//while (1) { //무한반복
	//	printf("c!!\n");
	//}

	//break를 이용해서 반복문 탈출
	int cnt = 0;
	while (1) { // 1:true, 0:false
		printf("c!! %d번\n", cnt+1);
		cnt++; //cnt += 1; //cnt = cnt + 1;
		if (cnt>9) break;
	}
	//1~10까지의 합
	//int i=0, sum=0;
	//while (i<10) {
	//	//printf("%d\n", ++i);
	//	sum += ++i; //i=i+1; sum = sum + i;
	//}
	//printf("합계:%d\n",sum);

	//1부터의 총합이 2000을 넘는 정수와 그 합을 구하기
	//1+2+3+4.....+n
	//1,3,6,10.....2000<n
	int i = 0, sum = 0;
	while (1) {
		sum += ++i;
		if (sum > 2000) break;
	}
	printf("정수:%d, 합계:%d\n",i,sum);
	
	while (sum < 2000) {
		i++;
		sum += i;
	}
	printf("정수:%d, 합계:%d\n", i, sum);

	//실습) 1부터 20까지의 수 중 3의 배수만 출력하는 프로그램
	//3,6,9,12.....18
	//1)
	//int n=0;
	//while (n<20){
	//	n++;
	//	if (n % 3 == 0) printf("%d ",n);
	//}
	//2)
	//int n = 3;
	//while (n<20){
	//	printf("%d \n",n);
	//	n+=3;
	//}
	//3)
	//int n=0;
	//while (1) {
	//	n+=3;
	//	if (n > 20) break; printf("%d ",n);
	//}
	
	//continue: 계속
	//1~10까지 짝수만 출력
	int a = 0;
	while (a<10) {
		a++;
		if (a % 2 != 0) continue;
		printf("%d ",a);
	}

	return 0;
}