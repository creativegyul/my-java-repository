package ex11_guest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class JunitTest {

//	@Test
//	void testInsert() {
//		GuestDAO gdao=new GuestDAOImple();
//		GuestDTO gdto=new GuestDTO("이효리","hyolee@gmail.com","2222","가입인사");
//		int cnt=gdao.insert(gdto);
//		System.out.println(cnt+"건 추가");
//		assertNotEquals(0, cnt);
//	}

	@Test
	void testUpdate() {
		GuestDAO gdao=new GuestDAOImple();
		GuestDTO gdto=new GuestDTO("이효리","hyolee@gmail.com","2222","가입인사");
		gdto.setSeq(2);
		int cnt=gdao.update(gdto);
		System.out.println(cnt+"건 수정");
		assertNotEquals(0, cnt);
	}

	@Test
	void testDelete() {
		GuestDAO gdao=new GuestDAOImple();
		int cnt=gdao.delete(1);
		System.out.println(cnt+"건 삭제");
		assertNotEquals(0, cnt);
	}

	@Test
	void testSelectOne() {
		GuestDAO gdao=new GuestDAOImple();
		GuestDTO gdto=new GuestDTO();
		gdto=gdao.selectOne(2);
		System.out.println(gdto.getSeq()+" "+gdto.getName()+" "+gdto.getEmail()+" "
				+gdto.getPasswd()+" "+gdto.getContent()+" "+gdto.getRegidate());
		assertNotNull(gdto);
	}

	@Test
	void testSelectList() {
		GuestDAO gdao=new GuestDAOImple();
		List<GuestDTO> glist=gdao.selectList();
		for (GuestDTO g:glist) {
			System.out.println(g.getSeq()+" "+g.getName()+" "+g.getEmail()+" "
					+g.getPasswd()+" "+g.getContent()+" "+g.getRegidate());
		}
		assertNotEquals(0, glist.size());
	}

}
