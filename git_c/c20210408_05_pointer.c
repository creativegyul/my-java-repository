#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//������ ����
	//int a = 10;
	//int *p = &a;
	//printf("a:%d p:%p\n", a,&a);
	//printf("p:%p *p:%d\n", p,*p); //*p=������ ���� p�� ������ �ִ� �ּ��� '��'=�� int a
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
	//float f = 5.55f; //���� double�� �ƴ� float������ �Է��ϰڴٴ� �ǹ̷� f�� �ٿ���
	//float* p4 = &f;
	//printf("f:%.2f *p4:%.2f\n", f, *p4);
	
	////�����ͺ��� p�� �̿��Ͽ� a�� ���� b�� ���� ���
	//int a = 10, b = 20;
	//int* p;
	//p=&a; printf("a:%d\n", *p); //p�� '�ּ�'�� ����, *p�� �ּ� '��'�� �ҷ���
	//p=&b; printf("b:%d\n", *p);

	//�ǽ�) a=10,b=20,c=30�� �� base=100�� �� ������ ���غ��� (�����ͺ��� Ȱ��)
	//int a = 10, b = 20, c = 30, base=100;
	//int *p = &a;
	//*p = *p + base; printf("a:%d\n", *p);
	//p = &b;
	//*p += base; printf("b:%d\n", *p);
	//p = &c;
	//*p += base; printf("c:%d\n", *p);

	//�迭�� ������
	int arr[3] = { 10,20,30 };
	int size = sizeof(arr) / sizeof(int);
	int* p = arr;
	//int��:4byte-> *p���� 10(�ּ� 100), *(p+1)���� 20(�ּ� 104), *(p+2)���� 30(�ּ� 108)
	//printf("%d\n",*p);
	//printf("%d\n",*(p+1));
	//printf("%d\n",*(p+2));
	for (int i = 0; i < size; i++){
		printf("%d %d %d %d\n", *(p + i), *(arr+i), arr[i], p[i]);
	}
	for (int i = 0; i < size; i++) {
		printf("%d\n", *p);
		p++; //p = p + 1;
		//arr++; �Ұ�. arr�� �迭�� �̸�, �� ����̹Ƿ� ����Ұ�
	}

	//������ �迭�� 'p','y','t','h','o','n'�� �����ϰ� �����ͺ����� �̿��� �ѱ��ھ� ���
	//char c[] = { 'p','y','t','h','o','n' };
	//char* po = c;
	//for (int i = 0; i < 6; i++) {
	//	printf("%c\n", *(po+i));
	//}

	//�Ǻ���ġ ������ �����͸� �̿��ؼ� ���ϰ� ���
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
	p2 = fibo; //ó�� ��ġ��
	for (int i = 0; i < 20; i++) {
		//printf("%d ", *p2++);
		printf("%d ", *p2);
		p2++;
	}

	return 0;
}