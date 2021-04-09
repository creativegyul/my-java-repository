#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//��������
//int sum;

//�Ű������� ������ �Է¹޾� �����ϴ� �Լ�, ���ϰ�: �����հ�
int usersum(int a) {
	//static����
	//�Լ��� ���ʷ� ��������� ����, ���α׷� ����� �Ҹ�
	//����� �Լ� �ȿ����� ���ٰ���
	static int sum=0;
	sum += a;
	return sum;
}

//�Ű�����: ����, ���ϰ�: �� �Լ��� ������ Ƚ��
//�Լ��̸�: countTest
int countTest() {
	static int cnt=0;
	cnt++;
	return cnt;
}

int main() {
	//��������, �������� ��� ��
	printf("����:%d\n",usersum(10));
	printf("����:%d\n",usersum(20));

	//�ݺ����� �̿��ؼ�
	for (int i = 0; i < 10; i++){
		printf("%d\n", countTest()); //countTest�� ������ �Լ��� �ּҰ� ��µ�
	}

	return 0;
}
//Stack �޸� ����-FILO: Last Input, First Out (������ ����) [��������, �Ű����� ��]
//Static �޸� ����-��������ó�� �޸𸮰� ���α׷� �����Ҷ����� �Ҹ���� ����
//Queue ����-FIFO: Ʃ��ó�� �� ���
//�� ����-malloc(): �� ������ �޸� ������ �Ҵ��ϴ� �Լ�(���� �Ҵ�)