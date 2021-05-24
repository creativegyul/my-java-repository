package ex01_class;

import java.text.SimpleDateFormat;
import java.util.Date;

//수강생클래스
//필드: 코드, 이름, 수강과목
class Attendee{
	private String code;
	private String name;
	private String subject;
	Attendee(){}
	public Attendee(String code, String name, String subject) {
		this.code = code;
		this.name = name;
		this.subject = subject;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Attendee [code=" + code + ", name=" + name + ", subject=" + subject + "]";
	}
}
//수강클래스
//메소드: 입실 출력, 퇴실 출력
class LManager{
	//클래스 필드(클래스 변수)-클래스가 메모리에 로딩될때 생성, 프로그램 종료시 소멸
	static final String collegeName="국제학원";
	//인스턴스 필드(객체변수)-인스턴스 생성시 생성, 객체소멸시 소멸
	int builtYear=2005;
	//static final: 상수-값을 바꾸지 못하기 때문에 반드시 선언과 동시에 초기화
	static final int day;
	static { //static 블럭을 이용해서 초기화
		Date now=new Date(); //현재날짜 가져오기
		SimpleDateFormat sf=new SimpleDateFormat("dd");
		day=Integer.parseInt(sf.format(now));
	}
	static void enter(Attendee a) { //a는 지역변수
		System.out.println(day+"일 "+a.getSubject()+"반 "+a.getName()+"님 입실완료");
	}
	static void leave(Attendee a) {
		System.out.println(a.getSubject()+"반 "+a.getName()+"님 퇴실완료");
	}
}
public class J20210421_02_Attend {

	public static void main(String[] args) {
		//LManager.collegeName="신림"; //static final은 상수-변경불가
		System.out.println(LManager.collegeName);
		Attendee a1=new Attendee("A001","김나리","Java");
//		System.out.println(a1);
		LManager lm=new LManager();
		System.out.println(lm.builtYear+" 개원");
		LManager.enter(a1);
		LManager.leave(a1);

	}

}
