#include<stdio.h>
int main() {
	//������(+,-,*,/,%)
	//������ ����=>����
	//�Ǽ��� ����=>�Ǽ�
	//int a = 20, b = 3;
	//printf("%d + %d = %d\n", a, b, a + b);
	//printf("%d - %d = %d\n", a, b, a - b);
	//printf("%d * %d = %d\n", a, b, a * b);
	//printf("%d / %d = %d\n", a, b, a / b); //��
	//printf("%d / %d = %f\n", a, b, (double)a/b);
	//printf("%d %% %d = %d\n", a, b, a % b); //������

	//�ǽ�)
	//int c = 50, d = 3;
	//printf("��: %d\n",c/d);
	//printf("������: %d\n",c%d);
	//printf("���� �Ǽ���: %f\n",(double)c/d);

	//���׿�����
	//++,--
	//�տ� ���̸� ����, �ڿ� ���̸� ����
	//int a = 10;
	//++a; //a += 1; //a = a + 1;
	//printf("%d\n", a);
	//a--; //a -= 1;//a = a - 1;
	//printf("%d\n", a);
	//int a1 = 20;
	//printf("%d\n", a1++); //����� �ϰ� �����ض�
	//printf("%d\n", a1);
	//printf("%d\n", ++a1); //�����ϰ� ����ض�

	//�ǽ�)
	//int a2 = 10;
	//int b = --a2;
	//int c = b++;
	//b = ++a2;
	//printf("%d %d %d\n", a2, b, c);

	//���迬����
	int n = 10, m = 20;
	printf("%d\n", n < m); //1:True
	printf("%d\n", n > m); //0:False
	printf("%d\n", n == m); //0:False
	printf("%d\n", n != m); //1:True

	//��������: &&=and, ||=or, !=not
	int e = 10, f = 20;
	printf("%d\n", e > 0 && f > 0);
	printf("%d\n", e > 0 && f < 0);
	printf("%d\n", e > 0 || f < 0);
	printf("%d\n", !(e > 0)); //1->0, 0->1

	//��Ʈ������:&,|,~,^
	//printf("%d\n", 4 & 3);
	//printf("%d\n", 4 | 3);
	//����Ʈ ������
	//printf("%d\n", 4>>2); //���������� �κ�Ʈ �б�
	//printf("%d\n", 4<<1); //�������� �Ѻ�Ʈ �б�

	//���� ������
	int x = 10;
	x > 0 ? printf("���\n") : printf("����\n");

	//�� ���� ū���� ���
	int x1 = 10, x2 = 20;
	x1 > x2 ? printf("%d\n", x1) : printf("%d\n", x2);
	int x3 = x1 > x2 ? x1:x2;
	printf("%d\n", x3);

	//�ǽ�) 20, 10, 30�� 3���� ������ �־������� ���� ū ���� ���ϴ� ���α׷�
	int a = 20, b = 10, c = 30;
	//int max = a > b ? a : b;
	//max = max > c ? max : c;
	//printf("���� ū ���� %d �Դϴ�.\n", max);

	int max=a > b ? (a > c ? a : c) : (b > c ? b : c);
	printf("���� ū ��: %d\n", max);

	//�ǽ�) � ������ �־������� ¦/Ȧ���� �Ǻ��Ͽ� ���
	int d=12;
	d % 2 == 0 ? printf("%d:¦��\n", d) : printf("%d:Ȧ��\n", d);
	//������ ������ �̿��ؼ� ���
	char*p = d % 2 == 0 ? "¦��" : "Ȧ��"; //p�� ����
	printf("%d�� %s\n", d, p);

	return 0;
}