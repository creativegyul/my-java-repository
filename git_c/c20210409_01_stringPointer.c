#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//���ڿ��� ������
	char str[]="happy";
	//str="angry"; //str�� ���-����Ұ�
	char* p = str;
	printf("%s\n", p); 
	p = "python"; //p�� ����, str�� �ּ�-���氡��
	puts(p); //���ڿ� �����Լ�

	//�̸��� �Է¹ް� ����, ��� (������ ���)
	char s[20];
	char* po = s;
	while (1) {
		printf("Name?:");
		gets_s(po,10);
		if (s[0] == 'q') break;
		printf("Your name is %s\n",po);
	}

	return 0;
}