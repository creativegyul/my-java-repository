#include <stdio.h>
int main() {
	//������ ������ ����
	int a; //4byte
	a = 10; //�ʱ�ȭ: ���� a�� ��=10
	printf("%d\n",a);
	//�Ǽ��� ��������
	float b; //4byte
	double c; //8byte
	b = 3.14123456789; //�ʱ�ȭ
	c = 3.14123456789;
	printf("%.12f, %.12f\n", b,c);
	
	//������
	//����� ���ÿ� �ʱ�ȭ
	char d = 'A';
	printf("���ڴ� %c %d\n",d,d); //%d=������ ASCII �ڵ尪

	//�ڷ����� ����Ʈ��
	int e = 100;
	printf("������:%d\n",sizeof(e)); //sizeof ������
	float f = 3.14;
	double g = 3.14;
	printf("�÷�Ʈ��:%d, ������:%d\n",sizeof(f),sizeof(g));
	char h = 'a';
	printf("ĳ������:%d\n",sizeof(h));

	//���ڿ�
	//�迭�� �̸�(i)�� �ּҸ� ������ �ִ�: ���
	//�迭�� ũ��� ���ڿ��� ũ��+1
	//����� ���ÿ� �ʱ�ȭ �ÿ��� �迭�� ũ�� ��������
	//char i[6]="hello"; //����:hello[1byte*(5 + nul���� \0)]
	//i = "hello"; //����̱� ������ �Ұ�
	char i[] = "hello";
	printf("���ڿ�:%s ũ��:%d\n", i,sizeof(i));
	printf("5��:%c\n", i[5]);

	return 0;
}