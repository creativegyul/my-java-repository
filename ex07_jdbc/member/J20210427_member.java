package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import ex07_jdbc.DBConn;

public class J20210427_member {
	
	public static void main(String[] args) {
		//Member 데이터 추가
		MemberDAO mdao=new MemberDAO(); //객체생성
		Scanner sc=new Scanner(System.in);
		//boolean logincheck=false; //로그인 여부
		String login_id="unknown"; //로그인된 아이디
		while (true) {
			System.out.println("==============");
			System.out.println("회원관리V1.0.0");
			System.out.println("Logged in as "+login_id);
			System.out.println("==============");
			System.out.println("0.회원로그인");
			System.out.println("1.회원추가");
			System.out.println("2.회원수정");
			System.out.println("3.회원탈퇴");
			System.out.println("4.회원조회");
			System.out.println("5.회원전체조회");
			System.out.println("6.종료");
			System.out.println("==============");
			System.out.print("번호선택: ");
			int n=sc.nextInt();
			System.out.println("--------------");
			if (n==6) {
				System.out.println("종료합니다."); break;
			} else if(n==0) { //로그인
				//ID,PW 입력받기
				System.out.print("ID:");
				String userid = sc.next();
				MemberDTO mdto=mdao.selectOne(userid); //아이디 중복체크
				if (mdto==null) { //데이터가 없다면
					System.out.println("<로그인 실패>");
					System.out.println("존재하지 않는 ID입니다.");
					//logincheck=false;
				} else {
					System.out.print("비밀번호:");
					String passwd=sc.next();
					if (passwd.equals(mdto.getPasswd())) { //PW 불일치 체크
						System.out.println("<로그인 성공>");
						//logincheck=true;
						login_id=userid;
					} else {
						System.out.println("<로그인 실패>");
						System.out.println("비밀번호가 일치하지 않습니다.");
						//logincheck=false;
					}
				}
			} else if(n==5) { //전체조회
				if(login_id.equals("unknown")) {
					System.out.println("로그인 후 사용 가능."); continue;
				}
				List<MemberDTO> mlist=mdao.selectList();
				System.out.println("<전체회원 "+mlist.size()+"명>");
				for(MemberDTO m:mlist) {
					System.out.println("--------------");
					System.out.println("회원 ID: "+m.getUserid());
					System.out.println("비밀번호: "+m.getPasswd());
					System.out.println("출생년도: "+m.getBirthyear());
					System.out.println("등록날짜: "+m.getRegidate());
				}
			} else if(n==4) { //한건조회
				if(login_id.equals("unknown")) {
					System.out.println("로그인 후 사용 가능."); continue;
				}
				System.out.print("조회할 회원의 ID 입력:");
				try {
					String userid=sc.next();
					System.out.println("--------------");
					MemberDTO mdto=mdao.selectOne(userid);
					System.out.println("회원 ID: "+mdto.getUserid());
					System.out.println("비밀번호: "+mdto.getPasswd());
					System.out.println("출생년도: "+mdto.getBirthyear());
					System.out.println("등록날짜: "+mdto.getRegidate());
				} catch(NullPointerException e) {
					System.out.println("존재하지 않는 ID입니다.");
				}
			} else if(n==1) { //추가(insert)
				String userid;
				while (true) {
					System.out.print("새 ID 입력:");
					userid = sc.next();
					MemberDTO mdto=mdao.selectOne(userid); //아이디 중복체크
					if (mdto!=null) //데이터가 있다면
						System.out.println("이미 존재하는 ID입니다.");
					else break;
				}
				System.out.print("새 비밀번호 입력:");
				String passwd = sc.next();
				System.out.print("출생년도 입력:");
				int birthyear = sc.nextInt();
				System.out.println("--------------");
				MemberDTO mdto=new MemberDTO(userid, passwd, birthyear);
				int cnt=mdao.insert(mdto);
				if (cnt==0) System.out.println("추가할 수 없습니다.");
			} else if(n==2) { //수정(update)
				//로그인된 아이디 정보만 수정 가능
				//기존 정보 조회 후 수정 정보와 같이 전달?
				if(login_id.equals("unknown")) {
					System.out.println("로그인 후 사용 가능."); continue;
				}
				System.out.println("비밀번호를 변경합니다.");
				System.out.print("ID:");
				String userid=sc.next();
				if (!login_id.equals(userid)) {
					System.out.println("수정 권한이 없습니다."); continue;
				}
				System.out.print("새 비밀번호:");
				String passwd=sc.next();
				System.out.println("--------------");
				MemberDTO mdto=new MemberDTO(userid, passwd);
				int cnt=mdao.update(mdto);
				if (cnt==0) System.out.println("수정할 수 없습니다.");
			} else if (n==3) { //삭제(delete)
				if(login_id.equals("unknown")) {
					System.out.println("로그인 후 사용 가능."); continue;
				}
				System.out.print("삭제할 ID 입력:");
				String userid=sc.next();
				if (!login_id.equals(userid)) {
					System.out.println("삭제 권한이 없습니다."); continue;
				}
				int cnt=mdao.delete(userid); login_id="unknown";
				if (cnt==0) System.out.println("삭제할 수 없습니다.");
			} else System.out.println("잘못된 입력입니다.");
			System.out.println("--------------");
			sc.nextLine(); //버퍼 비우기
			System.out.println("돌아가려면 Enter를 누르세요.");
			sc.nextLine(); //홀딩
		}
		
	}
}
