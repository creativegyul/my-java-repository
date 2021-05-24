package ex01_class;
//회원 클래스
//필드:id,password,출생연도(int),키(double)
class Member{
	//은닉화: private
	private String id;
	private String pw; //읽기(getter) 불가
	private int birth;
	private double height;
	//생성자: 객체가 생성될때 실행되는 메소드
	//		  반드시 객체가 생성될때 생성자가 실행이 되어야 한다.
	//클래스의 이름과 같다
	//반환형이 없다
	
	//기본생성자
	//만약 생성자가 없으면 컴파일러가 기본생성자를 만들어줌
	//만약 생성자를 만들면 컴파일러가 기본생성자를 생성하지 않음
	//생성자의 오버로딩
	Member(){}
	Member(String id, String pw, int birth, double height){
		this.id=id;
		this.pw=pw;
		this.birth=birth;
		this.height=height;
	}
	//setter:쓰기
	void setId(String id) {
		this.id=id;
	}
	void setPw(String pw) {
		this.pw=pw;
	}
	void setBirth(int birth) {
		this.birth=birth;
	}
	void setHeight(double height) {
		this.height=height;
	}
	//getter:읽기
	String getId() {
		return id;
	}
	String getPw() { //비밀번호는 앞 두자리만 반환
		return pw.substring(0,2)+"**";
	}
	int getBirth() {
		return birth;
	}
	double getHeight() {
		return height;
	}
	
}

public class J20210419_05_Member {

	public static void main(String[] args) {
		Member m1=new Member(); //기본생성자를 이용해서 객체를 생성
		m1.setId("java1004");
		m1.setPw("1234");
		m1.setBirth(1997);
		m1.setHeight(166.4);
		System.out.println("아이디: "+m1.getId());
		System.out.println("패스워드: "+m1.getPw());
		
		Member m2=new Member("python1004","2222",1991,188.9);
		System.out.println("아이디: "+m2.getId());
		System.out.println("패스워드: "+m2.getPw());

	}

}
