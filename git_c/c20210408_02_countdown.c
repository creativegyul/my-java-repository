#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <Windows.h>

//�Ű�����: ī��Ʈ�ٿ� ��
//��ȯ��: ����
//�Լ��� ���: ī��Ʈ�ٿ��� ���
void countd(int a) {
	for (int i = a; i > -1; i--) {
		Sleep(1000);
		printf("%d\n", i);
	}
}

int main() {
	////ī��Ʈ�ٿ�
	//printf("ī��Ʈ ����\n");
	//for (int i = 5; i>-1; i--){
	//	Sleep(1000); // 1/1000�� ����
	//	printf("%d\n", i);
	//}
	//printf("�߻�\n");
	
	printf("ī��Ʈ ����\n");
	countd(3);
	printf("�߻�\n");

	return 0;
}