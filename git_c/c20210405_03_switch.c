#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//���ǹ�: switch ~ case
	int a=1;
	switch (a){
	case 0:
		printf("zero\n"); break;
	case 1:
		printf("one\n"); break;
	case 2:
		printf("two\n"); break;
	default:
		printf("�߸��� ����\n");
	}

	//���� ������ �� ���
	int mon;
	printf("���?(���ڸ�):");
	scanf("%d", &mon);
	switch (mon)
	{
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		printf("31��\n"); break;
	case 2:
		printf("28��\n"); break;
	case 4: case 6: case 9: case 11:
		printf("30��\n"); break;
	default:
		printf("�߸��� ����\n");
	}
	
	//�޴��� switch
	int menu;
	printf("1.����� 2.«�� 3.������ 4.����� 5.���� 6.���İ�Ƽ\n��ȣ�� �Է�:");
	scanf("%d", &menu);
	switch (menu)
	{
	case 1: case 2:
		printf("�߽��ڳ�\n"); break;
	case 3: case 4:
		printf("�ѽ��ڳ�\n"); break;
	case 5: case 6:
		printf("����ڳ�\n"); break;
	default:
		printf("�߸��� ��ȣ\n");
	}	

	return 0;
}