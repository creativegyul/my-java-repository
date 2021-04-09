#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#define LEN 5 
int main() {
	////배열: array
	//int arr[3];
	////arr[0] = 10; arr[1] = 20; arr[2] = 30;
	////printf("%d %d %d\n", arr[0], arr[1], arr[2]);
	////printf("%p %d\n", &arr,sizeof(arr));
	////반복문을 이용해서 초기화
	//for (int i = 0; i < 3; i++) {
	//	arr[i]=(i+1)*10;
	//}
	////반복문을 이용해서 출력
	//for (int i = 0; i < 3; i++) {
	//	printf("%d ",arr[i]);
	//}
	
	////실습)
	////double arr[3] = {1.1,2.1,3.1}; //선언과 동시에 초기화
	//double arr[5];
	////배열의 크기 구하기
	//int size = sizeof(arr) / sizeof(double); // 40 / 8 = 배열의 갯수
	//printf("사이즈:%d\n",size);
	////반복문을 이용해서 초기화
	//for (int i = 0; i < size; i++) {
	//	arr[i] = i + 1.1;
	//}
	////반복문을 이용해서 출력
	//for (int i=0;i<size;i++) {
	//	printf("%.1f\n",arr[i]);
	//}

	//문자형 배열
	//char arr[] = {'p','y','t','h','o','n'};
	//int size = sizeof(arr)/sizeof(char);
	//printf("사이즈:%d\n",size);
	//for (int i=0;i<size;i++) {
	//	printf("%c ",arr[i]);
	//}

	//배열값의 합
	//C는 "정적배열"
	//int a = 5; //a에 값이 할당되는 시점은 런타임시
	//const int a = 5; //const-> 상수: 변경이 불가능
	//#define에 정의된 매크로상수: 컴파일 되기 전에 대체
	//int arr[LEN], sum = 0; //sum=합계를 저장할 변수
	//int size = sizeof(arr) / sizeof(int);
	////입력받기
	//for (int i = 0; i < size; i++) {
	//	printf("%d번째 정수?:",i+1);
	//	scanf("%d",&arr[i]);
	//}
	////출력하기
	//for (int i = 0; i < size; i++){
	//	printf("%d %p\n" , arr[i],&arr[i]); //배열값과 각 값의 주소 확인
	//}
	////합계구하기;
	//for (int i = 0; i < size; i++){
	//	sum += arr[i];
	//}
	//printf("합계는 %d\n", sum);

	//실습) 반 학생의 점수를 입력 받아 순서대로 배열에 저장하고
	//번호 순서대로 출력하는 프로그램
	//추가 1) 합계와 평균 출력
	//추가 2) 원하는 학생번호를 입력하면 해당학생 점수 출력
	int bae[3], total=0;
	int size = sizeof(bae) / sizeof(int);
	for (int i=0;i<size;i++) {
		printf("%d번 점수:", i+1);
		scanf("%d", &bae[i]);
		
	}
	printf("---------------------\n");
	for (int i = 0; i < size; i++) {
		printf("%d번은 %d점\n", i + 1, bae[i]);
		total += bae[i];
	}
	printf("---------------------\n");
	printf("합계는 %d, 평균은 %.2f\n",total,(double)total/size);
	printf("---------------------\n");
	//검색
	//int bae[3] = { 20,50,30 };
	int no;
	char quit; //종료
	do {
		printf("학생번호:");
		scanf("%d", &no);
		getchar(); //엔터처리
		//잘못된 번호 처리
		if (no<1 || no>3) {
			printf("잘못된 번호\n");
			continue; //계속 진행
		}
		printf("%d번 점수:%d\n", no, bae[no-1]);
		printf("*****************\n");
		printf("종료(q)?");
		scanf("%c",&quit);
	} while (quit != 'q');

	return 0;
}