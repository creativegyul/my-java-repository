#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//�Ű�����: ����, ��ȯ��: ����
void voidTest() {
	printf("void �Լ�\n");
}
//�Ű�����: 1��, ��ȯ��: ����
void voidTest2(int a) {
	printf("�Ű�����:%d\n",a);
}
//�Ű�����: 2��, ��ȯ��: ����
void voidTest3(int a, int b){
	printf("�� ���� ��:%d\n",a+b);
}
//���� ���̸� ������ִ� ���
//�Ű�����: ������
//�Լ��� �̸�: area, �Ű����� �̸�: r(double) //���� �Ѿ�� �Լ�: call by value ���
void area(double r2) { //�������� r2: �Լ������ �� ����, �Լ������ �Ҹ�
	printf("���� ����:%.2f", r2 * r2 * 3.14);
}
//���� ���̸� ���ؼ� ��ȯ�ϴ� �Լ�
//�Ű�����: ������(double), ��ȯ��: ���� ����(double)
double areaReturn(double r) {
	double area = r * r * 3.14;
	return area; //��ȯ���� ������ 1��
}
//�� ������ �Ű������� �޾� ���� ��ȯ�ϴ� �Լ�
int sum(int x, int y, int z) {
	return x + y + z;
}
//�� ���� ������ �Ű������� �޾Ƽ� ���� �Ǽ����� ��ȯ�ϴ� �Լ�
float divide(int a, int b) {
	return (float)a / b;
}
//�ǽ�) �� ���� �Ű������� �޾Ƽ� �� ���� ū ���� ��ȯ�ϴ� �Լ�
int bigR(int x, int y) {
	if (x > y) return x;
	else if (x < y) return y;
	else return 0; //�� ���� ���� ���� 0�� ����
}

//������ �Լ�
int main() {
	//�Լ�
	//voidTest();
	//voidTest2(10);
	//voidTest3(20,30); //���� ���� ��ġ
	//
	//double r; //�������� r
	//printf("��������? ");
	//scanf("%lf",&r); //scanf()�Լ��� �ּҸ� �ѱ�(call by reference)
	//area(r);
	//printf("%d\n", r2); (��ºҰ�) //r2=>�Լ��� ������ ������ �����
	//
	//double r = 3.6;
	//double rValue = areaReturn(r); //double�� ���Ͻ� double������ ����
	//printf("���� ����:%.2f\n",rValue);
	//
	//printf("�հ�:%d\n", sum(2,3,5));
	////int a=sum(2,3,5);
	////printf("�հ�:%d\n",a);
	//
	//int a = 3, b = 5;
	//float d = divide(a, b);
	//printf("���� ��:%.2f\n", d);

	int a = 5, b = 5;
	int m = bigR(a,b);
	if (m != 0) printf("ū ��:%d\n", m);
	else printf("%d�� %d�� ����\n",a,b);

	return 0;
}