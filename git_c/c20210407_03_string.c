#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h> //���ڿ� ���� �Լ����� �����ϴ� �������
int main() {
	//����
	//char c;
	//scanf("%c", &c); //���˿� ���� ���� ������Ÿ���� �Է¹����� ����
	//printf("����:%c\n", c);

	//���ڱ���� ����
	//int c = getchar(); //���� �Է� �����Լ�
	//printf("�Է¹���: %c %d\n",c,c);
	//putchar(c); //���� ��� �����Լ�
	
	//getch()�Լ�: ���ڱ���� ���� Enter�� ������ �ʾƵ� �ٷ� ���
	//char c = getch(); 
	//printf("�Է¹���:\n");
	//putchar(c);

	//�ǽ�) ��й�ȣ 4�ڸ��� �Է��ϸ� *�� ���
	//char pw[5];
	//printf("password?");
	//for (int i = 0; i < 4; i++){
	//	pw[i] = getch();
	//	putchar('*');
	//}
	//pw[4] = '\0';
	//printf("\n��й�ȣ:%s\n", pw);

	//���ڿ�
	//char s[6]="hello"; //hello: 5���� + nul���� \0
	//char s[6]; //�迭�� �̸��� �ּ��̴�.
	//scanf("%s", s); //������ �ּ� ������ �ʿ� ����. 
	//printf("%s\n", s);

	//���ڿ� ���� ����� �Լ�: ������ ó�� ���� / �ݸ� scanf�� ����=�Է����� ����
	//char name[20];
	//printf("�̸���? ");
	//gets(name);
	//printf("Your name is "); puts(name);

	//���ڿ� �����Լ�
	char namey[10] = "hong";
	//namey = "kim"; �ȵ�
	strcpy(namey,"kim"); //�Լ��� �ּҸ� �ѱ�(call by reference)
	puts(namey);

	//�ǽ�) ���ڿ� call by reference�� �Է��ϰ� ��, ����, �ּ� ���
	//char a[20];
	//printf("���ڿ� �Է�: ");
	//gets(a);
	//printf("��: "); puts(a);
	//printf("����: %d\n", strlen(a));
	//printf("�ּ�: %p", a);

	//�Ǻ���ġ�� ���� ���ϱ�
	//0 1 1 2 3 5 8 13 .....
	int fibo[20];
	fibo[0] = 0; fibo[1] = 1;
	for (int i = 2; i < 20; i++) {
		fibo[i]=fibo[i-2]+fibo[i-1];
	}
	//0 1 2 3 4 5 6 7  8  9  10
	//0 1 1 2 3 5 8 13 21 34 55
	//[2]=[2-2=0]+[2-1=1]=1
	//[3]=[3-2=1]+[3-1=2]=2
	//[4]=[4-2=2]+[4-1=3]=3
	//[5]=[5-2=3]+[5-1=4]=5
	//[6]=[6-2=4]+[6-1=5]=8
	//[7]=[7-2=5]+[7-1=6]=13
	//[8]=[8-2=6]+[8-1=7]=21
	//[9]=[9-2=7]+[9-1=8]=34
	//[10]=[10-2=8]+[10-1=9]=55

	//���
	for (int i = 0; i < 20; i++){
		printf("%d ", fibo[i]);
	}

	return 0;
}