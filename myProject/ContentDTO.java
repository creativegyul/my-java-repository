package myProject;

import java.util.Date;

public class ContentDTO {
	private int seq;
	private String userid;
	private String comments;
	private Date regidate;
	public ContentDTO() {}
	public ContentDTO(String comments) {
		this.comments = comments;
	}
	public ContentDTO(int seq, String userid, String comments, Date regidate) {
		this.seq = seq;
		this.userid = userid;
		this.comments = comments;
		this.regidate = regidate;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getRegidate() {
		return regidate;
	}
	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}
	@Override
	public String toString() {
		return "ContentDTO [seq=" + seq + ", userid=" + userid + ", comments=" + comments + ", regidate=" + regidate
				+ "]";
	}
}