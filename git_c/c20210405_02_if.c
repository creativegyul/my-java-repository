#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//���ǽ��� ���϶� ������ ����, �����϶� ������ ������ ����
	int num1 = 10, num2 = 20;
	if (num1 > num2) {
		printf("%d�� %d���� �� ũ��\n", num1, num2);
	}
	else {
		printf("%d�� %d���� ũ�� �ʴ�\n", num1,num2);
	}

	//ǥ���� �����ϰ�
	int a = 0;
	if (a > 0)
		printf("���\n");
	else if (a < 0) //��øif��
		printf("����\n");
	else
		printf("����� ������ �ƴ�\n");

	//�ǽ�) �� ������ �Է¹޾� ū ���� ���(�� ���� �������� �ִ�)
	//int a1, a2;
	//printf("�� ������ �Է�>\n");
	//scanf("%d %d", &a1, &a2); //*call by reference
	//if (a1 > a2)
	//	printf("�� ū��: %d\n", a1);
	//else if (a1 < a2)
	//	printf("�� ū��: %d\n", a2);
	//else
	//	printf("�� ���� ����\n");

	//������ �Է¹޾� ������ ����ϴ� ���α׷�
	//(90�̻� A, 80�̻� B, 70�̻� C, 60�̻� D, 60�̸� F)
	//int score;
	//printf("����: ");
	//scanf("%d", &score);
	//if (score > 100 || score < 0)
	//	printf("�߸��� �����Դϴ�\n");
	//else if (score >= 90)
	//	printf("A\n");
	//else if (score >=80)
	//	printf("B\n");
	//else if (score >=70)
	//	printf("C\n");
	//else if (score >=60)
	//	printf("D\n");
	//else
	//	printf("F\n");

	//������ ������ �Է¹޾� ������ ����� ���
	//(�� 60�� �̸��� �Ѱ����̶� ������ ����)
	/*int ko, eng, math;
	printf("����/����/����? ");
	scanf("%d/%d/%d", &ko, &eng, &math);
	int total = ko + eng + math;
	if (ko < 60||eng < 60||math < 60)
		printf("����\n");
	else printf("����: %d, ���: %.2f\n", total, (double)total / 3);*/

	//�⵵�� �Է¹޾� ���⿩�θ� ���
	int yoon;
	printf("����: ");
	scanf("%d", &yoon);
	if (yoon % 4 == 0 && yoon % 100 != 0 || yoon % 400 == 0)
		printf("%d���� ����\n", yoon);
	else printf("%d���� ������ �ƴմϴ�\n", yoon);

	//�޴���: 1.����� 2.«�� 3.������ 4.����� 5.���� 6.���İ�Ƽ
	int menu;
	printf("1.����� 2.«�� 3.������ 4.����� 5.���� 6.���İ�Ƽ\n��ȣ�� �Է�:");
	scanf("%d", &menu);
	if (menu == 1 || menu == 2)
		printf("�߽��ڳ�\n");
	else if (menu == 3 || menu == 4)
		printf("�ѽ��ڳ�\n");
	else if (menu == 5 || menu == 6)
		printf("����ڳ�\n");
	else
		printf("�߸��� ��ȣ\n");

	return 0;
}