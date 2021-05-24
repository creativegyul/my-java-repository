package ex04_generics;
//일반 멤버 클래스
//필드: 아이디, 비밀번호
class Member{
	private String userid;
	private String userpw;
	Member(){}
	public Member(String userid, String userpw) {
		this.userid = userid;
		this.userpw = userpw;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	@Override
	public String toString() {
		return "Member [userid=" + userid + ", userpw=" + userpw + "]";
	}
	
}
//VIP
//필드: 아이디, 비밀번호, 할인율
class Vip{
	private String userid;
	private String userpw;
	private double rate;
	Vip(){}
	public Vip(String userid, String userpw, double rate) {
		this.userid = userid;
		this.userpw = userpw;
		this.rate = rate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Vip [userid=" + userid + ", userpw=" + userpw + ", rate=" + rate + "]";
	}
	
}
//로그인 관리 클래스
class LoginManager<T>{
	//로그인 메소드
	void memLogin(T mem) {
		System.out.println(mem);
		if (mem instanceof Member) {
			System.out.println(((Member)mem).getUserid()+"님 로그인 성공");
		} else if (mem instanceof Vip)
			System.out.println(((Vip)mem).getUserid()+"님 로그인 성공");
	}
	
}
public class J20210422_02_Member {
	public static void main(String[] args) {
		Member m1=new Member("java1004","1234");
//		System.out.println(m1);
		Vip vip=new Vip("python","1111",0.2);
//		System.out.println(vip);
		//로그인
		LoginManager<Member> lo1=new LoginManager<>();
		lo1.memLogin(m1);
		LoginManager<Vip> lo2=new LoginManager<>();
		lo2.memLogin(vip);
	}
}
