#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#define LEN 5 
int main() {
	////�迭: array
	//int arr[3];
	////arr[0] = 10; arr[1] = 20; arr[2] = 30;
	////printf("%d %d %d\n", arr[0], arr[1], arr[2]);
	////printf("%p %d\n", &arr,sizeof(arr));
	////�ݺ����� �̿��ؼ� �ʱ�ȭ
	//for (int i = 0; i < 3; i++) {
	//	arr[i]=(i+1)*10;
	//}
	////�ݺ����� �̿��ؼ� ���
	//for (int i = 0; i < 3; i++) {
	//	printf("%d ",arr[i]);
	//}
	
	////�ǽ�)
	////double arr[3] = {1.1,2.1,3.1}; //����� ���ÿ� �ʱ�ȭ
	//double arr[5];
	////�迭�� ũ�� ���ϱ�
	//int size = sizeof(arr) / sizeof(double); // 40 / 8 = �迭�� ����
	//printf("������:%d\n",size);
	////�ݺ����� �̿��ؼ� �ʱ�ȭ
	//for (int i = 0; i < size; i++) {
	//	arr[i] = i + 1.1;
	//}
	////�ݺ����� �̿��ؼ� ���
	//for (int i=0;i<size;i++) {
	//	printf("%.1f\n",arr[i]);
	//}

	//������ �迭
	//char arr[] = {'p','y','t','h','o','n'};
	//int size = sizeof(arr)/sizeof(char);
	//printf("������:%d\n",size);
	//for (int i=0;i<size;i++) {
	//	printf("%c ",arr[i]);
	//}

	//�迭���� ��
	//C�� "�����迭"
	//int a = 5; //a�� ���� �Ҵ�Ǵ� ������ ��Ÿ�ӽ�
	//const int a = 5; //const-> ���: ������ �Ұ���
	//#define�� ���ǵ� ��ũ�λ��: ������ �Ǳ� ���� ��ü
	//int arr[LEN], sum = 0; //sum=�հ踦 ������ ����
	//int size = sizeof(arr) / sizeof(int);
	////�Է¹ޱ�
	//for (int i = 0; i < size; i++) {
	//	printf("%d��° ����?:",i+1);
	//	scanf("%d",&arr[i]);
	//}
	////����ϱ�
	//for (int i = 0; i < size; i++){
	//	printf("%d %p\n" , arr[i],&arr[i]); //�迭���� �� ���� �ּ� Ȯ��
	//}
	////�հ豸�ϱ�;
	//for (int i = 0; i < size; i++){
	//	sum += arr[i];
	//}
	//printf("�հ�� %d\n", sum);

	//�ǽ�) �� �л��� ������ �Է� �޾� ������� �迭�� �����ϰ�
	//��ȣ ������� ����ϴ� ���α׷�
	//�߰� 1) �հ�� ��� ���
	//�߰� 2) ���ϴ� �л���ȣ�� �Է��ϸ� �ش��л� ���� ���
	int bae[3], total=0;
	int size = sizeof(bae) / sizeof(int);
	for (int i=0;i<size;i++) {
		printf("%d�� ����:", i+1);
		scanf("%d", &bae[i]);
		
	}
	printf("---------------------\n");
	for (int i = 0; i < size; i++) {
		printf("%d���� %d��\n", i + 1, bae[i]);
		total += bae[i];
	}
	printf("---------------------\n");
	printf("�հ�� %d, ����� %.2f\n",total,(double)total/size);
	printf("---------------------\n");
	//�˻�
	//int bae[3] = { 20,50,30 };
	int no;
	char quit; //����
	do {
		printf("�л���ȣ:");
		scanf("%d", &no);
		getchar(); //����ó��
		//�߸��� ��ȣ ó��
		if (no<1 || no>3) {
			printf("�߸��� ��ȣ\n");
			continue; //��� ����
		}
		printf("%d�� ����:%d\n", no, bae[no-1]);
		printf("*****************\n");
		printf("����(q)?");
		scanf("%c",&quit);
	} while (quit != 'q');

	return 0;
}