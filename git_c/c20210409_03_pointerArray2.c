#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//�����迭�� ������
	//int arr[][3] = { {1,2,3},{4,5,6} }; //�� ǥ��� ��������
	//int* p = arr;
	//for (int i = 0; i < 6; i++) {
	//	printf("%d ", *p++);
	//}

	//�θ��� �л��� ������ ������ ����
	int score[][3] = { {90,89,77}, {89,99,88} };
	int sum = 0; double avg;
	int(*p)[3] = score; //3�� �ǳʶٴ� int�� �������� ù �ּ�-score
	//int*p[3]; ��ȣ ����-�������� �迭��
	//printf("%d %d\n", p, p+1); //�ּ� 10������ ���

	for (int i=0;i<2;i++) {
		sum = (*p)[0] + (*p)[1] + (*p)[2];
		avg = sum / 3.;
		printf("�հ�:%d, ���:%.2f\n",sum,avg);
		p++;
	}

	return 0;
}