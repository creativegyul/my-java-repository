package ex10_interface;

import java.util.InputMismatchException;
import java.util.Scanner;

interface Call{
	void call();
}
interface Photo{
	void photo();
}
interface Memo{
	void memo();
}
//전화, 사진찍기
class Phone implements Call, Photo{
	String name="iPhone 6s";
	@Override
	public void photo() {
		System.out.println("1200만 화소 사진촬영");
	}
	@Override
	public void call() {
		System.out.println(name+" 통화");
	}
}
//전화, 사진찍기, 메모
class NewPhone implements Call, Photo, Memo{
	String name="iPhone 12";
	@Override
	public void memo() {
		System.out.println(name+" 메모");
	}
	@Override
	public void photo() {
		System.out.println("6400만 화소 사진촬영");
	}
	@Override
	public void call() {
		System.out.println(name+" 통화");
	}
}
//폰테스트
class PhoneUse{
	void call(Call c) {
		c.call();
	}
	void photo(Photo p) {
		p.photo();
	}
	void memo(Memo m) {
		m.memo();
	}
}

public class J20210504_08_Phone {
	public static void main(String[] args) {
		//입력받기
		Scanner sc=new Scanner(System.in);
		Phone ph=new Phone();
		NewPhone newPh=new NewPhone();
		PhoneUse pu=new PhoneUse();
		Boolean b=false;
		int no;
		while(true) {
			System.out.println("----------");
			System.out.println("0.기종선택");
			System.out.println("1.통화하기");
			System.out.println("2.사진찍기");
			System.out.println("3.메모하기");
			System.out.println("4.종료");
			System.out.println("----------");
			System.out.print("번호입력:");
			try {
				no=sc.nextInt();
				System.out.println("----------");
			} catch(InputMismatchException e) {
				sc=new Scanner(System.in);
				System.out.println("----------");
				System.out.println("숫자를 입력하세요."); continue;
			}
			if (no==4) {
				System.out.println("종료합니다."); break;
			} else if(no==0) {
				System.out.println("기종을 선택하세요.");
				System.out.println("1.iPhone 6s");
				System.out.println("2.iPhone 12");
				System.out.println("----------");
				System.out.print("번호입력:");
				int a=sc.nextInt();
				if (a==2) b=true;
			} else if(no==1) {
				if (b) pu.call(newPh);
				else pu.call(ph);
			} else if(no==2) {
				if (b) pu.photo(newPh);
				else pu.photo(ph);
			} else if(no==3) {
				if (b) pu.memo(newPh);
				else System.out.println("메모할 수 없는 기종입니다.");
			} else System.out.println("잘못된 번호입니다.");
		}
	}
}
