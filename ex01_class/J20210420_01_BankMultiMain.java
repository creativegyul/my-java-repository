package ex01_class;

import java.util.Scanner;

public class J20210420_01_BankMultiMain {
	public static void main(String[] args) {
		//여러개의 계좌 등록 가능
		Scanner sc=new Scanner(System.in);
		Bank[] banks= new Bank[3]; //Bank 객체의 주소를 저장할 수 있는 공간 3개
		int custno=0;
		while(true) {
			System.out.println("===================");
			System.out.println("----Hannah Bank----");
			System.out.println("===================");
			System.out.println("***현재 고객번호:"+custno);
			System.out.println("0.고객번호 로그인");
			System.out.println("1.계좌개설");
			System.out.println("2.입금");
			System.out.println("3.출금");
			System.out.println("4.계좌조회");			
			System.out.println("5.종료");
			System.out.println("-------------------");
			System.out.print("번호를 입력하세요: ");
			int no=sc.nextInt();
			System.out.println("-------------------");
			sc.nextLine();
			if(no==0) { //고객번호 선택
				System.out.println("**1~3번 계좌 개설 가능");
				System.out.print("로그인할 계좌번호: ");
				custno=sc.nextInt();
				if (custno>3 || custno<1) {
					System.out.println("잘못된 입력입니다.");
					continue;
				}
			} else if(no==1) { //계좌개설
				if (custno<=0) {
					System.out.println("고객번호 로그인을 해주세요.");
					continue;
				}
				System.out.print("계좌이름 입력: ");
				String bankname=sc.nextLine();
				System.out.print("계좌번호 입력: ");
				String bankno=sc.next();
				banks[custno-1]=new Bank(bankname, bankno);
				System.out.println("-------------------");
				System.out.println("계좌명: "+banks[custno-1].getBankname());
				System.out.println("계좌번호: "+banks[custno-1].getBankno());				
			} else if(no==2) { //입금
				if (custno<=0) {
					System.out.println("계좌를 먼저 개설하세요.");
					continue;
				} else if (banks[custno-1]==null) {
					System.out.println("계좌를 먼저 개설하세요.");
					continue;
				}
				System.out.print("입금할 금액: ");
				int money=sc.nextInt();
				banks[custno-1].deposit(money);
				System.out.println("잔액: "+banks[custno-1].getBalance());
			} else if(no==3) { //출금
				if (custno<=0) {
					System.out.println("계좌를 먼저 개설하세요.");
					continue;
				} else if (banks[custno-1]==null) {
					System.out.println("계좌를 먼저 개설하세요.");
					continue;
				}
				System.out.print("출금할 금액: ");
				int money=sc.nextInt();
				banks[custno-1].withdraw(money);
				System.out.println("잔액: "+banks[custno-1].getBalance());
			} else if(no==4) { //계좌조회
				if (custno<=0) {
					System.out.println("계좌를 먼저 개설하세요.");
					continue;
				} else if (banks[custno-1]==null) {
					System.out.println("계좌를 먼저 개설하세요.");
					continue;
				}
				System.out.println(custno+"번 계좌명: "+banks[custno-1].getBankname());
				System.out.println("계좌번호: "+banks[custno-1].getBankno());
				System.out.println("잔액: "+banks[custno-1].getBalance());
			} else if(no==5) { //종료
				System.out.println("종료합니다."); break;
			} else System.out.println("잘못된 입력입니다.");
		}

	}
}
