#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//�Լ�: call by reference
//�ּҸ� �Ű������� �޴´�
//main�Լ��� a�� ���� ���� ����
void change(int*p) { //�Ű����� p(�ּ�)
	*p = 20; //p(�ּ�)�� ��(=a��, *p)�� 20�� ����
}
void change2(int*a, int*b) {
	int temp = *a;
	*a = *b;
	*b = temp;
}
void sumCal(int* a, int* b) {
	*b += *a;
}
int main() {
	int a=10;
	//�Լ��� ������ �ѱ��
	//int* p=&a;
	//change(p);
	change(&a);
	//scanf("%d",&a); //scanf���� call by reference ����̴�.
	printf("a:%d\n", a);

	//�� �� �ٲٱ�
	int x = 10, y = 20;
	change2(&x,&y);
	printf("x:%d y:%d\n", x, y);

	//�ݺ����� �̿��ؼ� �Է¹��� ���� �Լ��� �̿��� ����
	int n, sum=0;
	printf("�����Է�(0�� ����):");
	while (1) {
		scanf("%d",&n);
		sumCal(&n,&sum);
		if (n == 0) break;
	}
	printf("�����հ�:%d\n", sum);

	return 0;
}