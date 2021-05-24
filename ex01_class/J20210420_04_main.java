package ex01_class;

import java.util.Scanner;

public class J20210420_04_main {

	public static void main(String[] args) {
		for (String a:args) {
			System.out.println(a);
		}
		//실습) id와 pw를 아규먼트로 받아서
		//만약 id가 java이고 pw가 1111이면 '관리자 모드', 아니면 '일반사용자 모드' 출력
		if (args.length > 1 && args[0].equals("java") && args[1].equals("1111"))
			System.out.println("관리자 모드");
		else System.out.println("일반사용자 모드");

	}

}
