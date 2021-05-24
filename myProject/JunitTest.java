package myProject;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class JunitTest {
	MyProjectDAO mdao=new MyProjectDAO();
	Scanner sc=new Scanner(System.in);
	
	@Test
	void testInsertUser() { //1. 회원등록(insertUser)
		System.out.print("새 아이디: ");
		String userid = sc.next();
		System.out.print("새 패스워드: ");
		String passwd = sc.next();
		sc.nextLine();
		System.out.print("닉네임: ");
		String nickname = sc.nextLine();
		System.out.println("----------------------");
		UserinfoDTO udto=new UserinfoDTO(userid, passwd, nickname);
		int cnt=mdao.insertUser(udto);
		if (cnt==0) System.out.println("등록할 수 없습니다.");
		assertNotEquals(0, cnt); //cnt가 0이 아니면 성공
	}
	
	void testDeleteUser() { //2. 회원탈퇴(deleteUser)
		System.out.println("탈퇴할 아이디를 입력하시면 삭제됩니다.");
		System.out.println("----------------------");
		System.out.print("아이디: ");
		String userid=sc.next();
		System.out.println("----------------------");
		int cnt=mdao.deleteUser(userid);
		if (cnt==0) System.out.println("삭제할 수 없습니다.");
		assertNotEquals(0, cnt);
	}
	
	void testUpdateUser() { //3. 닉네임 변경(updateUser)
		System.out.println("닉네임을 변경할 아이디를 입력하세요.");
		System.out.println("----------------------");
		System.out.print("아이디: ");
		String userid=sc.next();
		sc.nextLine();
		System.out.print("새 닉네임: ");
		String nickname=sc.nextLine();
		System.out.println("----------------------");
		UserinfoDTO udto=new UserinfoDTO(userid, nickname);
		int cnt=mdao.updateUser(udto);
		if (cnt==0) System.out.println("수정할 수 없습니다.");
		assertNotEquals(0, cnt);
	}
	
	void testInsertContent() { //4. 한마디 작성(insertContent)
		String userid = null;
		sc.nextLine();
		System.out.print("한마디: ");
		String comments=sc.nextLine();
		System.out.println("----------------------");
		ContentDTO cdto=new ContentDTO(comments);
		cdto.setUserid(userid);
		int cnt=mdao.insertContent(cdto);
		if (cnt==0) System.out.println("추가할 수 없습니다.");
		assertNotEquals(0, cnt);
	}
	
	void testSelectOneId() { //7-1. 아이디로 조회(selectOneId)
		System.out.println("조회할 아이디를 입력하세요.");
		System.out.println("----------------------");
		System.out.print("아이디: ");
		String userid=sc.next();
		System.out.println("----------------------");
		List<Map<String, Object>> list=mdao.selectOneId(userid);
		for(Map<String, Object> map:list) {
			System.out.println(map.get("nickname")+" | "+map.get("comments")+" | "+map.get("regidate"));
		}
		assertNotEquals(0, list.size());
	}
	
	void testSelectOneDate() { //7-2. 일자별 조회(selectOneDate)
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
		assertNotEquals(0, list.size());
	}
	
	void testSelectList() { //7-3. 전체조회(selectList)
		List<Map<String, Object>> list=mdao.selectList();
		for(Map<String, Object> map:list) {
			System.out.println(map.get("seq")+" | "+map.get("nickname")+" | "+map.get("comments")+" | "+map.get("regidate"));
		}
		assertNotEquals(0, list.size());
	}
	
	void testUpdateContent() { //5. 한마디 수정(updateContent)
		String userid=null;
		List<Map<String, Object>> list=mdao.selectOneContent(userid);
		for(Map<String, Object> map:list) {
			System.out.println(map.get("seq")+" | "+map.get("nickname")+" | "+map.get("comments")+" | "+map.get("regidate"));
		}
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
		assertNotEquals(0, cnt);
	}
	
	void testDeleteContent() { //6. 한마디 삭제(deleteContent)
		String userid=null;
		List<Map<String, Object>> list=mdao.selectOneContent(userid);
		for(Map<String, Object> map:list) {
			System.out.println(map.get("seq")+" | "+map.get("nickname")+" | "+map.get("comments")+" | "+map.get("regidate"));
		}
		System.out.println("삭제할 한마디 번호를 입력하세요.");
		System.out.println("----------------------");
		System.out.print("번호: ");
		int seq=sc.nextInt();
		System.out.println("----------------------");
		int cnt=mdao.deleteContent(seq);
		if (cnt==0) System.out.println("삭제할 수 없습니다.");
		assertNotEquals(0, cnt);
	}
}
