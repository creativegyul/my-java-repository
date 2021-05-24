package ex12_inner;
//인터페이스-객체 생성 안됨
interface School{
	void namePrint();
}
//class HighSchool implements School{
//	@Override
//	public void namePrint() {
//		System.out.println("국제고등학교");
//	}
//}

public class J20210507_03_interface_anony {

	public static void main(String[] args) {
//		HighSchool high=new HighSchool();
//		high.namePrint();
		
		//익명클래스 생성
		//인터페이스 School을 상속받은 객체 생성
		School high=new School() {
			@Override
			public void namePrint() {
				System.out.println("국제고등학교");
			}
		};
		high.namePrint();
	}

}
