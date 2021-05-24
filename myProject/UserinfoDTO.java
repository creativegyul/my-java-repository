package myProject;

public class UserinfoDTO {
	private String userid;
	private String passwd;
	private String nickname;
	public UserinfoDTO() {}
	public UserinfoDTO(String userid, String nickname) {
		this.userid = userid;
		this.nickname = nickname;
	}
	public UserinfoDTO(String userid, String passwd, String nickname) {
		this.userid = userid;
		this.passwd = passwd;
		this.nickname = nickname;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@Override
	public String toString() {
		return "UserinfoDTO [userid=" + userid + ", passwd=" + passwd + ", nickname=" + nickname + "]";
	}
}