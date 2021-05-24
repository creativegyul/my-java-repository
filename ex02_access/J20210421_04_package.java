package ex02_access;

import ex01_class.Bank;

public class J20210421_04_package {

	public static void main(String[] args) {
		Test test=new Test();
		test.getA();
		System.out.println(test.getA());
		//ex01_class.Bank b1=new ex01_class.Bank("청년통장", "11-22-33");
		//접근제어자
		//public : 모든 클래스가 접근 가능
		//private : 자신의 클래스 내부에서만 접근 가능
		//default(접근제어자 없음) : 같은 패키지만 접근 가능
		Bank b1=new Bank("청년통장", "11-22-33");
		
	}

}
