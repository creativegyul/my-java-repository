#define _CRT_SECURE_NO_WARNINGS //scanf �Լ��� ����ϱ� ���� ��
#include<stdio.h>
int main(void) { //void=����.
	//�Է� �Լ�
	//������ �Է¹ޱ�
	//int a;
	//printf("������?\n");
	//scanf("%d", &a); //&�� ���� a�� �ּҿ�����
	//printf("�Է��� ��: %d  �ּ�: %p\n", a, &a); //p: a�� �ּҸ� 16������

	//�Ǽ��� �Է¹ޱ�
	//float b;
	//double c;
	//printf("float �Ǽ���?\n");
	//scanf("%f", &b);
	//printf("���� �Ǽ���?\n");
	//scanf("%lf", &c); //���˹��� double �� ���: %lf
	//printf("<�Է��� ��>\n float: %f %p\n double: %f %p\n", b,&b,c,&c);
	
	//������ �Է¹ޱ�
	//char d;
	//printf("���ڴ�?\n");
	//scanf("%c", &d);
	//printf("�Է��� ���ڴ� %c\n", d);

	//�ǽ�) �� ������ �Է¹޾Ƽ� �հ踦 ���
	//int a, b;
	//printf("ù��° ����?\n");
	//scanf("%d", &a);
	//printf("�ι�° ����?\n");
	//scanf("%d", &b);

	//printf("�� ����?");
	//scanf("%d %d", &a, &b);
	//printf("�� ������ �հ�� %d\n", a+b);

	//������ ��¥(��, ��, ��)�� �Է¹޾� ���
	//int year, month, day;
	//printf("������� ������� �Է��ϼ���\n");
	//scanf("%d %d %d", &year, &month, &day);
	//printf("������ ��¥�� %d�� %d�� %d��\n", year,month,day);

	//�� ������ �Է¹޾� ������� ���ϱ�
	//int c, d;
	/*printf("�� ���� ������ �Է��ϼ���:");
	scanf("%d %d", &c,&d);
	printf("%d + %d = %d\n", c, d, c+d);
	printf("%d - %d = %d\n", c, d, c-d);
	printf("%d * %d = %d\n", c, d, c*d);
	printf("%d / %d = %.2f\n", c, d, (double)c/d);*/

	//���� ó���ϱ� ���� ����
	//int a, b;
	//char sign;
	//printf("first? ");
	//scanf("%d", &a);
	//printf("second? ");
	//scanf("%d", &b);
	//�� ���ڸ� �о ��ȯ�ϴ� �Լ�
	//getchar(); //(������)���͸� ó���ϱ� ���� ����
	//printf("sign? ");
	//scanf("%c", &sign);
	//printf("%d %c %d\n",a,sign,b);

	//�ǽ�) ���� ���� �� �Ž������� ����Ͽ� ����ϴ� ���α׷�
	//int amount, pay; //���ǰ�, ����
	//printf("���ǰ�: ");
	//scanf("%d", &amount);
	//printf("������ ��: ");
	//scanf("%d", &pay);
	//pay > amount ?
	//	printf("�Ž�����: %d\n", pay - amount) :
	//	pay < amount ? printf("������ �ݾ�: %d\n",amount-pay) : printf("����Ϸ�\n");

	//�ǽ�) ������ ������ �Է¹޾� �հ�� ����� ���ϴ� ���α׷�
	int ko, eng, math;
	printf("����: ");
	scanf("%d", &ko);
	printf("����: ");
	scanf("%d", &eng);
	printf("����: ");
	scanf("%d", &math);
	int total = ko + eng + math;
	printf("��������: %d, ���: %.2f\n", total, (double)total/3);

	//rgb �� �����
	int r, g, b;
	printf("red? "); scanf("%d",&r);
	printf("green? "); scanf("%d",&g);
	printf("blue? "); scanf("%d",&b);
	unsigned int rgb=r<<16|g<<8|b;
	printf("RGB: %0X\n", rgb); // %0X:������ 16������ ���

	return 0;
}