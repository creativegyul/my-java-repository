#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//do ~while
	//int a=-1;
	//do {
	//	printf("%d\n",a); //�ּ� �ѹ��� ����
	//} while (a>0);

	//����ڿ��� �Է��� �޾Ƽ� y�̸� ��� �÷���
	//char answer;
	//do {
	//	printf("Now Playing...\n");
	//	printf("��� �÷����ұ��(y)? ");
	//	scanf("%c",&answer);
	//	getchar(); //���Ͱ� ó��
	//} while (answer == 'y');

	//�ǽ�) � ������ ��� �Է¹޾Ƽ� �հ踦 ���ϰ� 0�� �Է��� ��� ����
	int a, sum=0;
	do {
		printf("������ �Է��ϼ���:");
		scanf("%d",&a);
		sum += a;
	} while (a!=0);
	printf("���ݱ��� ���� ���� %d\n",sum);
	
	return 0;
}