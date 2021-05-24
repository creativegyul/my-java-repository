package ex11_guest;

import java.util.List;
import java.util.Scanner;

public class J20210506_guest {

	public static void main(String[] args) {
		//1. 방명록 작성
		//2. 방명록 수정
		//3. 방명록 삭제
		//4. 방명록 조회
		//9. 종료
		GuestDAO gdao=new GuestDAOImple();
		Scanner sc=new Scanner(System.in);
		int no=0;
		while (true) {
			System.out.println("==============");
			System.out.println("방명록 v1.0.0");
			System.out.println("==============");
			System.out.println("1. 방명록 작성");
			System.out.println("2. 방명록 수정");
			System.out.println("3. 방명록 삭제");
			System.out.println("4. 방명록 조회");
			System.out.println("5. 전체조회");			
			System.out.println("6. 종료");
			System.out.println("--------------");
			System.out.print("번호선택:");
			no=sc.nextInt();
			System.out.println("--------------");
			if (no==6) {
				System.out.println("종료합니다."); DBConn.dbClose(); break;
			} else if (no==1) {
				System.out.println("새 방명록을 작성합니다.");
				System.out.print("작성자 이름:");
				String name=sc.next();
				System.out.print("작성자 이메일:");
				String email=sc.next();
				System.out.print("새 비밀번호:");
				String passwd=sc.next();
				sc.nextLine();
				System.out.print("내용 입력:");
				String content=sc.nextLine();
				GuestDTO gdto=new GuestDTO(name,email,passwd,content);
				int cnt=gdao.insert(gdto);
				System.out.println("--------------");
				System.out.println(cnt+"건 추가완료.");
			} else if (no==2) {
				System.out.print("수정할 게시물 번호:");
				int seq=sc.nextInt();
				System.out.print("작성자 이름:");
				String name=sc.next();
				System.out.print("새 이메일:");
				String email=sc.next();
				System.out.print("새 비밀번호:");
				String passwd=sc.next();
				sc.nextLine();
				System.out.print("내용 입력:");
				String content=sc.nextLine();
				GuestDTO gdto=new GuestDTO(name,email,passwd,content);
				gdto.setSeq(seq);
				int cnt=gdao.update(gdto);
				System.out.println("--------------");
				System.out.println(cnt+"건 수정완료.");
			} else if (no==3) {
				System.out.print("삭제할 번호 입력:");
				int seq=sc.nextInt();
				int cnt=gdao.delete(seq);
				System.out.println("--------------");
				System.out.println(cnt+"건 삭제완료.");
			} else if (no==4) {
				GuestDTO gdto=new GuestDTO();
				System.out.print("조회할 게시물 번호:");
				int seq=sc.nextInt();
				gdto=gdao.selectOne(seq);
				System.out.println("--------------");
				System.out.println(gdto.getSeq()+" "+gdto.getName()+" "+gdto.getEmail()+" "
						+gdto.getPasswd()+" "+gdto.getContent()+" "+gdto.getRegidate());
			} else if (no==5){
				List<GuestDTO> glist=gdao.selectList();
				for (GuestDTO g:glist) {
					System.out.println(g.getSeq()+" "+g.getName()+" "+g.getEmail()+" "
							+g.getPasswd()+" "+g.getContent()+" "+g.getRegidate());
				}
			} else System.out.println("잘못된 번호입니다.");
		}
	}

}
