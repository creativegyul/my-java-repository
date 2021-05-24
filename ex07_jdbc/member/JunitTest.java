package ex07_jdbc.member;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

//단위테스트
class JunitTest {
	MemberDAO mdao=new MemberDAO();
	Scanner sc=new Scanner(System.in);

	@Test
	void testSelectList() {
		List<MemberDTO> mlist=mdao.selectList();
		for(MemberDTO m:mlist) {
			System.out.println("--------------");
			System.out.println("회원 ID: "+m.getUserid());
			System.out.println("비밀번호: "+m.getPasswd());
			System.out.println("출생년도: "+m.getBirthyear());
			System.out.println("등록날짜: "+m.getRegidate());
		}
		assertNotEquals(0, mlist.size()); //mlist안에 데이터가 없지 않으면 성공
	}

	@Test
	void testSelectOne() {
		System.out.print("조회할 회원의 ID 입력:");
		String userid=sc.next();
		System.out.println("--------------");
		MemberDTO mdto=mdao.selectOne(userid);
		System.out.println("회원 ID: "+mdto.getUserid());
		System.out.println("비밀번호: "+mdto.getPasswd());
		System.out.println("출생년도: "+mdto.getBirthyear());
		System.out.println("등록날짜: "+mdto.getRegidate());
		assertNotNull(mdto); //mdto가 null이 아닐 때 성공
	}

	@Test
	void testInsert() {
		System.out.print("새 ID 입력:");
		String userid = sc.next();
		System.out.print("새 비밀번호 입력:");
		String passwd = sc.next();
		System.out.print("출생년도 입력:");
		int birthyear = sc.nextInt();
		System.out.println("--------------");
		MemberDTO mdto=new MemberDTO(userid, passwd, birthyear);
		int cnt=mdao.insert(mdto);
		if (cnt==0) System.out.println("추가할 수 없습니다.");
		assertNotEquals(0, cnt); //cnt가 0이 아니면 성공
	}

	@Test
	void testUpdate() {
		System.out.println("비밀번호를 변경합니다.");
		System.out.print("ID:");
		String userid=sc.next();
		System.out.print("새 비밀번호:");
		String passwd=sc.next();
		System.out.println("--------------");
		MemberDTO mdto=new MemberDTO(userid, passwd);
		int cnt=mdao.update(mdto);
		if (cnt==0) System.out.println("수정할 수 없습니다.");
		assertNotEquals(0, cnt);
	}

	@Test
	void testDelete() {
		System.out.print("삭제할 ID 입력:");
		String userid=sc.next();
		int cnt=mdao.delete(userid);
		if (cnt==0) System.out.println("삭제할 수 없습니다.");
		assertNotEquals(0, cnt);
	}

}
