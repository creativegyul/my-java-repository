#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

void arrayPrint(int argc,char*argv[]) { //char*argv[](�迭�� ������)==char**argv(�������� ������)
	for (int i = 0; i < argc; i++){
		printf("%s\n", argv[i]);
	}
}
int main(int argc, char*argv[]) {
	//���� ���ڿ� �迭�� �Ű�����
	//char str[][7] = {"python","c","java"};
	//char* p[3] = str;
	char* p[3] = {"python", "c", "java"}; //�������� �迭
	//printf("%d %d %d\n", p[0],p[1],p[2]); //�ּ� ���

	//�Լ��� ó��
	//for (int i = 0; i < 3; i++) { //i�� �������� index�� ����
	//	printf("%s\n",p[i]);
	//}
	arrayPrint(3, p);

	//������ �迭�� ������
	//char arr[][7] = { "python", "c", "java" };
	//char(*p)[7] = arr;
	//printf("%d %d %d\n", p, p+1, p+2);
	
	return 0;
}