#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//������ �迭
	int arr[2][3];
	//arr[0][0] = 1; arr[0][1] = 2; arr[0][2] = 3;
	//arr[1][0] = 4; arr[1][1] = 5; arr[1][2] = 6;
	//arr == arr[0] == &arr[0][0]

	int rsize = sizeof(arr)/sizeof(arr[0]); // 24 / 12 = ���� ����
	int csize = sizeof(arr[0]) / sizeof(int); // 12 / 4 = ���� ����
	//int csize = sizeof(arr) / rsize / sizeof(int);
	printf("������:%d\n", rsize);
	printf("������:%d\n", csize);

	for (int i = 0; i < 2; i++) { //��
		for (int j = 0; j < 3; j++) { //��
			arr[i][j] = (i*3)+(j+1);
			printf("%d\n",arr[i][j]);
		}
	}

	//�ǽ�) �� �л��� ������ ������ �Է¹޾� ������� �迭�� �����ϰ�
	//��ȣ ������� ������ ����� ����ϴ� ���α׷�
	//�߰� 1) ��/��/�� ��� ���ϱ�
	int bae[2][3];
	//int row = sizeof(bae) / sizeof(bae[0]);
	//int cullum = sizeof(bae[0]) / sizeof(int);
	//for (int i = 0; i < row; i++) {
	//	printf("%d�� ���� ���� ����:",i+1);
	//	for (int j=0;j<cullum;j++) {
	//		scanf("%d",&bae[i][j]);
	//	}
	//	
	//}
	//printf("--------------------------\n");
	//�հ�, ��� ���
	for (int i = 0; i < row; i++) {
		int total = 0;
		for (int j=0;j<cullum;j++) {
			total += bae[i][j];
		}
		//�հ�, ���
		printf("%d�� �հ�: %d, ���: %.2f\n", i+1,total,(double)total/cullum);
	}
	//������ ��� ���ϱ�
	//bae[0][0]+bae[1][0] = ������ �հ�

	for (int j = 0; j < 3;j++) {
		for (int i = 0; i < 2; i++) {
			printf("%d", bae[i][j]);
		}

	}
	
	return 0;
}