package ex09_abstract;
//부모클래스
//추상메소드를 한개라도 가지고 있으면 추상 클래스로 만들어야 함
abstract class Education{
	static final String name="서울교육청";
	//구현부가 없는 추상메소드-상속받은 자식이 반드시 구현부를 작성.
	abstract void schoolName();
}
//초등학교
class Elementary extends Education{
	@Override
	void schoolName() {
		System.out.println("국제초등학교");
	}
}
//중학교
class Middle extends Education{
	@Override
	void schoolName() {
		System.out.println("국제중학교");
	}
}
//고등학교
class High extends Education{
	@Override
	void schoolName() {
		System.out.println("국제고등학교");
	}
}
//이력클래스
class EduInfo{
	//출신학교 출력
	void schoolNamePrint(Education e) {
		//다운캐스팅
//		if (e instanceof High) ((High)e).schoolName();
//		else if(e instanceof Middle) ((Middle)e).schoolName();
//		else if(e instanceof Elementary) ((Elementary)e).schoolName();
		
		//다형성을 이용해서 출력
		//실제로 출력은 자식클래스의 메소드를 실행
		e.schoolName();
	}
}

public class J20210504_05_abstract {

	public static void main(String[] args) {
		EduInfo ed=new EduInfo();
		High high=new High();
		Middle middle=new Middle();
		Elementary elem=new Elementary();
		ed.schoolNamePrint(high);
		ed.schoolNamePrint(middle);
		ed.schoolNamePrint(elem);
		
	}

}
