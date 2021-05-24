package ex08_inher;

class School{
	void schoolName() {
		System.out.println("국제컴퓨터아카데미");
	}
	void info(String name) {} //컴파일 에러를 피하기 위해
}
class Stud extends School{
	@Override
	void info(String name) {
		System.out.println(name+" 학생");
	}
}
class Teach extends School{
	@Override
	void info(String name) {
		System.out.println(name+" 선생님");
	}
}

public class J20210504_01_Student {

	public static void main(String[] args) {
		School st1=new Stud();
		st1.schoolName();
		//((Stud)st1).info("홍길동"); //다운캐스팅
		st1.info("홍길동");
		st1=new Teach();
		((Teach)st1).info("김");
		st1.info("김");
	}

}
