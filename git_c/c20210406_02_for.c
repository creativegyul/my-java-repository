#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//�ݺ���: for
	//int i; //�ݺ��� ����
	//for (i = 0; i < 10; i++) {
	//	printf("%d\n",i);
	//}

	//�ǽ�) ������ ���
	//int a;
	//printf("�ܼ�? ");
	//scanf("%d",&a);
	//for (int b=1;b<10;b++) {
	//	printf("%d * %d = %d\n",a,b,a*b);
	//}

	//����ڰ� 0�� �Է��ϸ� �����ϴ� ������
	//int dan;
	//while (1) {
	//	printf("�ܼ�? ");
	//	scanf("%d", &dan);
	//	if (dan == 0) break;
	//	for (int no = 1; no < 10; no++) {
	//		printf("%d * %d = %d\n", dan, no, dan * no);
	//	}
	//}
	//do {
	//	printf("�ܼ�? ");
	//	scanf("%d", &dan);
	//	if (dan != 0)
	//		for (int no = 1; no < 10; no++) {
	//			printf("%d * %d = %d\n", dan, no, dan * no);
	//		}
	//} while (dan!=0);

	//���� for ����) ������ 1~9��
	//for (int i = 2;i<10;i++) {
	//	printf("-------------\n");
	//	printf("[%d��]\n",i);
	//	for (int j=1;j<10;j++) {
	//		printf("%d * %d = %d\n",i,j,i*j);
	//	}
	//}

	//3�� for
	//for (int i = 0; i < 10; i++)
	//	for (int j=0; j < 10; j++)
	//		for (int k=0; k < 10; k++)
	//			printf("%d %d %d\n",i,j,k);

	//�ǽ�) 1���� 100������ ��
	//int sum = 0;
	//for (int i=1;i<101;i++) {
	//	sum += i;
	//}
	//printf("1���� 100������ ���� %d\n", sum);

	//1���� �Է� ���� �������� ��
	//int n, total = 0;
	//printf("n����?:");
	//scanf("%d", &n);
	//for (int i = 1; i < n + 1; i++) { //i�� for�� ��������
	//	total += i;
	//}
	//printf("1���� %d������ ���� %d\n", n, total);

	//�� ������ �Է¹޾� ū ������ �������� �� ���� ���ϴ� ���α׷�
	//0�� �Է��ϸ� ���α׷� ����
	//�ִ� �ݺ�Ƚ���� 10��
	//int x, y;
	//for (int i=0;i<10;i++) {
	//	printf("�� ����? ");
	//	scanf("%d",&x);
	//	if (x == 0) {
	//		printf("�����մϴ�\n"); break;
	//	}
	//	scanf("%d",&y);
	//	if (x > y) printf("%d - %d = %d\n", x, y, x - y);
	//	else printf("%d - %d = %d\n", y, x, y - x);
	//}
	
	//����� 1)
	for (int i = 0; i < 7; i++) {
		for (int j=0; j < i+1; j++) {
			printf("*");
		}
		printf("\n");
	}
	//����� 2)
	for (int i = 0; i < 7; i++) {
		for (int j = 0; j < 7-i; j++) {
			printf("��");
		}
		printf("\n");
	}
	//for (int i = 7; i > 0; i--) {
	//	for (int j = 0; j < i; j++) {
	//		printf("��");
	//	}
	//	printf("\n");
	//}
	//����� 3)
	for (int i = 0; i < 7; i++) {
		for (int j = 0; j < 6-i; j++) {
			printf("��");
		}
		for (int j = 0; j < i+1; j++) {
			printf("��");
		}
		printf("\n");
	}
	//����� 4)
	for (int i = 0; i < 6; i++) {
		for (int j = 0 ; j < 6-i; j++) {
			printf(" ");
		}
		for (int j = 0; j < i*2+1; j++) {
			printf("��");
		}
		for (int j = 0; j < 6-i; j++) {
			printf(" ");
		}
		printf("\n");
	}
	//�ǽ�) n! ���丮��(1*2*3...*n) ���ϱ�
	int n = 5;
	int total = 1; //���� �� ��������
	for (int i = 1; i < n+1; i++) {
		total *= i;
	}
	printf("1���� %d���� ���� ���� %d\n",n,total);

	//1���� 10������ �������� ���� 10�� �Ǵ� �� ���� ���ϴ� ���α׷�
	for (int i=1;i<10;i++) {
		for (int j = i; j < 10; j++) {
			if (i+j==10) printf("(%d, %d)\n",i,j);
		}
	}

	//�ǽ�) ���ɸ޴� ����
	//�޴��� ���� ���ݰ� �ش� �ڳʸ� ����ϴ� ���α׷�
	//�� �޴��� �߸� �Է��ϸ� �ٽ� �޴�����, q�� �Է��ϸ� ����
	char menu;
	do {
		printf("-----------------------------------------\n");
		printf("1.«�� 2.����� 3.�Ұ�� 4.�ܹ��� q:���� \n");
		printf("-----------------------------------------\n");
		scanf("%c", &menu);
		getchar();
		if (menu == '1') {
			printf("����: 6000��\nA�ڳʷ� ������\n"); break;
		}
		else if (menu == '2') {
			printf("����: 4500��\nB�ڳʷ� ������\n"); break;
		}
		else if (menu == '3') {
			printf("����: 6500��\nC�ڳʷ� ������\n"); break;
		}
		else if (menu == '4') {
			printf("����: 5500��\nD�ڳʷ� ������\n"); break;
		}
		else if (menu == 'q') { printf("����\n"); break; }
		else printf("�߸��� �Է�\n");
	} while (menu != 'q');

	return 0;
}