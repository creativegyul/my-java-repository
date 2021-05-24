package myProject;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MyProjectDAO mdao=new MyProjectDAO();
		Scanner sc=new Scanner(System.in);
		String login_id="unknown";
		while (true) {
			System.out.println("======================");
			System.out.println("영양사님께 한마디 V1.0");
			System.out.println("Logged in as "+login_id);
			System.out.println("======================");
			System.out.println("0. 로그인");
			System.out.println("1. 회원등록");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 닉네임 변경");
			System.out.println("----------------------");
			System.out.println("4. 한마디 작성");
			System.out.println("5. 한마디 수정");
			System.out.println("6. 한마디 삭제");
			System.out.println("7. 한마디 조회");
			System.out.println("8. 종료");
			System.out.println("======================");
			System.out.print("번호를 입력해주세요: ");
			int no=sc.nextInt();
			if (no==8) { //8. 종료
				System.out.println("----------------------");
				System.out.println("종료합니다."); DBConn.dbClose(); System.exit(0);
			} else if (no==7) { //7. 한마디 조회
				while (true) {
					System.out.println("======================");
					System.out.println("<한마디 조회>");
					System.out.println("1. 아이디로 조회");
					System.out.println("2. 일자별 조회");
					System.out.println("3. 전체조회");
					System.out.println("4. 돌아가기");
					System.out.println("======================");
					System.out.print("번호를 입력해주세요: ");
					int no2=sc.nextInt();
					if (no2==4) break; //7-4. 돌아가기
					else if (no2==1) { //7-1. 아이디로 조회(selectOneId)
						System.out.println("조회할 아이디를 입력하세요.");
						System.out.println("----------------------");
						System.out.print("아이디: ");
						String userid=sc.next();
						System.out.println("----------------------");
						List<Map<String, Object>> list=mdao.selectOneId(userid);
						for(Map<String, Object> map:list) {
							System.out.println(map.get("nickname")+" | "+map.get("comments")+" | "+map.get("regidate"));
						}
					} else if (no2==2) { //7-2. 일자별 조회(selectOneDate)
						System.out.println("조회할 일자를 입력하세요.");
						System.out.println("----------------------");
						System.out.print("일자(YYYYMMDD): ");
						String regidate=sc.next();
						regidate=regidate.substring(0, 4)+"-"+regidate.substring(4, 6)+"-"+regidate.substring(6);
						System.out.println("----------------------");
						List<Map<String, Object>> list=mdao.selectOneDate(regidate);
						for(Map<String, Object> map:list) {
							System.out.println(map.get("nickname")+" | "+map.get("comments")+" | "+map.get("regidate"));
						}
					} else if (no2==3) { //7-3. 전체조회(selectList)
						System.out.println("----------------------");
						List<Map<String, Object>> list=mdao.selectList();
						for(Map<String, Object> map:list) {
							System.out.println(map.get("seq")+" | "+map.get("nickname")+" | "+map.get("comments")+" | "+map.get("regidate"));
						}
					} else {
						System.out.println("잘못된 번호입니다.");
					}
				}
			} else if(no==0) { //0. 로그인
				System.out.println("----------------------");
				System.out.print("아이디: ");
				String userid = sc.next();
				UserinfoDTO udto=mdao.selectOne(userid); //아이디 중복체크
				if (udto==null) { //데이터가 없다면
					System.out.println("----------------------");
					System.out.println("<로그인 실패>");
					System.out.println("아이디가 존재하지 않습니다.");
				} else {
					System.out.print("패스워드: ");
					String passwd=sc.next();
					if (passwd.equals(udto.getPasswd())) { //PW 불일치 체크
						System.out.println("----------------------");
						System.out.println("로그인이 완료되었습니다.");
						login_id=userid;
					} else {
						System.out.println("----------------------");
						System.out.println("<로그인 실패>");
						System.out.println("패스워드가 일치하지 않습니다.");
					}
				}
			} else if (no==1) { //1. 회원등록(insertUser)
				String userid;
				String nickname;
				while (true) {
					System.out.println("----------------------");
					System.out.print("새 아이디: ");
					userid = sc.next();
					UserinfoDTO udto=mdao.selectOne(userid); //아이디 중복체크
					if (udto!=null) { //데이터가 있다면
						System.out.println("----------------------");
						System.out.println("이미 있는 아이디입니다.");
					}
					else break;
				}
				System.out.print("새 패스워드: ");
				String passwd = sc.next();
				sc.nextLine();
				System.out.print("닉네임: ");
				nickname = sc.nextLine();
				System.out.println("----------------------");
				UserinfoDTO udto=new UserinfoDTO(userid, passwd, nickname);
				int cnt=mdao.insertUser(udto);
				if (cnt==0) System.out.println("등록할 수 없습니다.");
			} else if (no==2) { //2. 회원탈퇴(deleteUser)
				if(login_id.equals("unknown")) {
					System.out.println("----------------------");
					System.out.println("로그인 후 이용가능합니다."); continue;
				}
				System.out.println("탈퇴할 아이디를 입력하시면 삭제됩니다.");
				System.out.println("----------------------");
				System.out.print("아이디: ");
				String userid=sc.next();
				System.out.println("----------------------");
				if (!login_id.equals(userid)) {
					System.out.println("삭제권한이 없습니다."); continue;
				}
				int cnt=mdao.deleteUser(userid);
				login_id="unknown";
				if (cnt==0) System.out.println("삭제할 수 없습니다.");
			} else if (no==3) { //3. 닉네임 변경(updateUser)
				if(login_id.equals("unknown")) {
					System.out.println("----------------------");
					System.out.println("로그인 후 이용가능합니다."); continue;
				}
				System.out.println("닉네임을 변경할 아이디를 입력하세요.");
				System.out.println("----------------------");
				System.out.print("아이디: ");
				String userid=sc.next();
				if (!login_id.equals(userid)) {
					System.out.println("----------------------");
					System.out.println("수정권한이 없습니다."); continue;
				}
				sc.nextLine();
				System.out.print("새 닉네임: ");
				String nickname=sc.nextLine();
				System.out.println("----------------------");
				UserinfoDTO udto=new UserinfoDTO(userid, nickname);
				int cnt=mdao.updateUser(udto);
				if (cnt==0) System.out.println("수정할 수 없습니다.");
			} else if (no==4) { //4. 한마디 작성(insertContent)
				System.out.println("----------------------");
				if(login_id.equals("unknown")) {
					System.out.println("로그인 후 이용가능합니다."); continue;
				}
				String userid=login_id;
				sc.nextLine();
				System.out.print("한마디: ");
				String comments=sc.nextLine();
				System.out.println("----------------------");
				ContentDTO cdto=new ContentDTO(comments);
				cdto.setUserid(userid);
				int cnt=mdao.insertContent(cdto);
				if (cnt==0) System.out.println("추가할 수 없습니다.");
			} else if (no==5) { //5. 한마디 수정(updateContent)
				System.out.println("----------------------");
				if(login_id.equals("unknown")) {
					System.out.println("로그인 후 이용가능합니다."); continue;
				}
				String userid=login_id;
				List<Map<String, Object>> list=mdao.selectOneContent(userid);
				for(Map<String, Object> map:list) {
					System.out.println(map.get("seq")+" | "+map.get("nickname")+" | "+map.get("comments")+" | "+map.get("regidate"));
				}
				System.out.println();
				System.out.println("수정할 한마디 번호를 입력하세요.");
				System.out.println("----------------------");
				System.out.print("번호: ");
				int seq=sc.nextInt();
				sc.nextLine();
				System.out.print("새 내용: ");
				String comments=sc.nextLine();
				System.out.println("----------------------");
				ContentDTO cdto=new ContentDTO(comments);
				cdto.setSeq(seq);
				int cnt=mdao.updateContent(cdto);
				if (cnt==0) System.out.println("수정할 수 없습니다.");
			} else if (no==6) { //6. 한마디 삭제(deleteContent)
				System.out.println("----------------------");
				if(login_id.equals("unknown")) {
					System.out.println("로그인 후 이용가능합니다."); continue;
				}
				String userid=login_id;
				List<Map<String, Object>> list=mdao.selectOneContent(userid);
				for(Map<String, Object> map:list) {
					System.out.println(map.get("seq")+" | "+map.get("nickname")+" | "+map.get("comments")+" | "+map.get("regidate"));
				}
				System.out.println();
				System.out.println("삭제할 한마디 번호를 입력하세요.");
				System.out.println("----------------------");
				System.out.print("번호: ");
				int seq=sc.nextInt();
				System.out.println("----------------------");
				int cnt=mdao.deleteContent(seq);
				if (cnt==0) System.out.println("삭제할 수 없습니다.");
			} else {
				System.out.println("----------------------");
				System.out.println("잘못된 번호입니다.");
			}
		}
	}

}