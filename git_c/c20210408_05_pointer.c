#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//포인터 변수
	//int a = 10;
	//int *p = &a;
	//printf("a:%d p:%p\n", a,&a);
	//printf("p:%p *p:%d\n", p,*p); //*p=포인터 변수 p가 가지고 있는 주소의 '값'=즉 int a
	//
	//char c = '%';
	//char* p2 = &c;
	//printf("c:%c *p2:%c\n", c, *p2);
	//
	//double d = 3.14;
	//double* p3 = &d;
	//printf("d:%f p:%p\n", d,&d);
	//printf("*p3:%f\n", *p3);
	//
	//float f = 5.55f; //값을 double형 아닌 float형으로 입력하겠다는 의미로 f를 붙여줌
	//float* p4 = &f;
	//printf("f:%.2f *p4:%.2f\n", f, *p4);
	
	////포인터변수 p를 이용하여 a의 값과 b의 값을 출력
	//int a = 10, b = 20;
	//int* p;
	//p=&a; printf("a:%d\n", *p); //p는 '주소'를 보관, *p는 주소 '값'을 불러옴
	//p=&b; printf("b:%d\n", *p);

	//실습) a=10,b=20,c=30일 때 base=100을 각 변수에 더해보기 (포인터변수 활용)
	//int a = 10, b = 20, c = 30, base=100;
	//int *p = &a;
	//*p = *p + base; printf("a:%d\n", *p);
	//p = &b;
	//*p += base; printf("b:%d\n", *p);
	//p = &c;
	//*p += base; printf("c:%d\n", *p);

	//배열의 포인터
	int arr[3] = { 10,20,30 };
	int size = sizeof(arr) / sizeof(int);
	int* p = arr;
	//int형:4byte-> *p값은 10(주소 100), *(p+1)값은 20(주소 104), *(p+2)값은 30(주소 108)
	//printf("%d\n",*p);
	//printf("%d\n",*(p+1));
	//printf("%d\n",*(p+2));
	for (int i = 0; i < size; i++){
		printf("%d %d %d %d\n", *(p + i), *(arr+i), arr[i], p[i]);
	}
	for (int i = 0; i < size; i++) {
		printf("%d\n", *p);
		p++; //p = p + 1;
		//arr++; 불가. arr은 배열의 이름, 즉 상수이므로 변경불가
	}

	//문자형 배열에 'p','y','t','h','o','n'을 저장하고 포인터변수를 이용해 한글자씩 출력
	//char c[] = { 'p','y','t','h','o','n' };
	//char* po = c;
	//for (int i = 0; i < 6; i++) {
	//	printf("%c\n", *(po+i));
	//}

	//피보나치 수열을 포인터를 이용해서 구하고 출력
	int fibo[20];
	int* p2 = fibo;
	//*p2 = 0; *(p2 + 1) = 1;
	*p2 = 0; p2++;
	*p2 = 1; p2++;
	for (int i = 2; i < 20; i++) {
		//*(p2 + i) = *(p2 + (i-2)) + *(p2 + (i - 1));
		*p2 = *(p2 - 2) + *(p2 - 1);
		p2++;
	}
	p2 = fibo; //처음 위치로
	for (int i = 0; i < 20; i++) {
		//printf("%d ", *p2++);
		printf("%d ", *p2);
		p2++;
	}

	return 0;
}