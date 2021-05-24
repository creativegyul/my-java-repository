package ex07_jdbc.member;

import java.util.Date;

//DTO
public class MemberDTO {
	private String userid;
	private String passwd;
	private int birthyear;
	private Date regidate;
	public MemberDTO() {}
	public MemberDTO(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}
	public MemberDTO(String userid, String passwd, int birthyear) {
		this.userid = userid;
		this.passwd = passwd;
		this.birthyear = birthyear;
	}
	public MemberDTO(String userid, String passwd, int birthyear, Date regidate) {
		this.userid = userid;
		this.passwd = passwd;
		this.birthyear = birthyear;
		this.regidate = regidate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public Date getRegidate() {
		return regidate;
	}
	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}
	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", passwd=" + passwd + ", birthyear=" + birthyear + ", regidate="
				+ regidate + "]";
	}
	
}
