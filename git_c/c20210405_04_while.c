#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	//�ݺ���: while
	//while (1) { //���ѹݺ�
	//	printf("c!!\n");
	//}

	//break�� �̿��ؼ� �ݺ��� Ż��
	int cnt = 0;
	while (1) { // 1:true, 0:false
		printf("c!! %d��\n", cnt+1);
		cnt++; //cnt += 1; //cnt = cnt + 1;
		if (cnt>9) break;
	}
	//1~10������ ��
	//int i=0, sum=0;
	//while (i<10) {
	//	//printf("%d\n", ++i);
	//	sum += ++i; //i=i+1; sum = sum + i;
	//}
	//printf("�հ�:%d\n",sum);

	//1������ ������ 2000�� �Ѵ� ������ �� ���� ���ϱ�
	//1+2+3+4.....+n
	//1,3,6,10.....2000<n
	int i = 0, sum = 0;
	while (1) {
		sum += ++i;
		if (sum > 2000) break;
	}
	printf("����:%d, �հ�:%d\n",i,sum);
	
	while (sum < 2000) {
		i++;
		sum += i;
	}
	printf("����:%d, �հ�:%d\n", i, sum);

	//�ǽ�) 1���� 20������ �� �� 3�� ����� ����ϴ� ���α׷�
	//3,6,9,12.....18
	//1)
	//int n=0;
	//while (n<20){
	//	n++;
	//	if (n % 3 == 0) printf("%d ",n);
	//}
	//2)
	//int n = 3;
	//while (n<20){
	//	printf("%d \n",n);
	//	n+=3;
	//}
	//3)
	//int n=0;
	//while (1) {
	//	n+=3;
	//	if (n > 20) break; printf("%d ",n);
	//}
	
	//continue: ���
	//1~10���� ¦���� ���
	int a = 0;
	while (a<10) {
		a++;
		if (a % 2 != 0) continue;
		printf("%d ",a);
	}

	return 0;
}