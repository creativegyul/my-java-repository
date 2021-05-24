package ex01_class;

import java.util.Scanner;
//은행
//필드: 은행명(bankname),계좌번호(bankno),잔액(balance)
//생성자, getter, setter
public class J20210420_01_BankMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank b1=null;
		//Bank[] banks= new Bank[3];
		while(true) {
			System.out.println("===================");
			System.out.println("----Hannah Bank----");
			System.out.println("===================");
			System.out.println("1.계좌개설");
			System.out.println("2.입금");
			System.out.println("3.출금");
			System.out.println("4.종료");
			System.out.println("-------------------");
			System.out.print("번호를 입력하세요: ");
			int no=sc.nextInt();
			System.out.println("-------------------");
			sc.nextLine();
			if(no==1) { //계좌개설
				System.out.print("계좌이름 입력: ");
				String bankname=sc.nextLine();
				System.out.print("계좌번호 입력: ");
				String bankno=sc.next();
				b1=new Bank(bankname, bankno);
				System.out.println("-------------------");
				System.out.println("계좌명: "+b1.getBankname());
				System.out.println("계좌번호: "+b1.getBankno());				
			} else if(no==2) { //입금
				if (b1==null) {
					System.out.println("계좌를 먼저 개설하세요.");
					continue;
				}
				System.out.print("입금할 금액: ");
				int money=sc.nextInt();
				b1.deposit(money);
				System.out.println("잔액: "+b1.getBalance());
			} else if(no==3) { //출금
				if (b1==null) {
					System.out.println("계좌를 먼저 개설하세요.");
					continue;
				}
				System.out.print("출금할 금액: ");
				int money=sc.nextInt();
				b1.withdraw(money);
				System.out.println("잔액: "+b1.getBalance());
			} else if(no==4) { //종료
				System.out.println("종료합니다."); break;
			} else System.out.println("잘못된 입력입니다.");
		}
		
//		Bank b1=new Bank("Hana Bank","381-21-0149");
//		System.out.println("은행명: "+b1.getBankname());
//		System.out.println("계좌번호: "+b1.getBankno());
//		System.out.println("잔액: "+b1.getBalance());
//		b1.deposit(1000);
//		System.out.println("잔액: " + b1.getBalance());
//		b1.withdraw(500);
//		System.out.println("잔액: " + b1.getBalance());
//		System.out.println(b1);

//		Bank b2=new Bank("KB 예금","999-99-99",10000);
//		b2.setBankname("주택청약");
//		System.out.println("계좌명: "+b2.getBankname());
//		System.out.println("계좌번호: "+b2.getBankno());
//		System.out.println("잔액: "+b2.getBalance());
//		System.out.println(b2);

	}
}
