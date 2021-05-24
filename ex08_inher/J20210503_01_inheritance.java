package ex08_inher;

//부모클래스
class Person{
	//protected-같은 패키지 클래스와 자식클래스 접근 가능
	protected String name;
	void setName(String name) {
		this.name=name;
	}
	void breath() {
		System.out.println(name+" 숨쉬기");
	}
	void eat() {
		System.out.println(name+" 먹기");
	}
	
}
//자식클래스-학생
class Student extends Person {
	private String name="학생";
	Student(){
		super.name=this.name;
		//super.setName(name); //부모클래스 name이 private(은닉화)일 경우
	}
	void learn() {
		System.out.println(name+"은 배운다.");
	}
}
//자식클래스-선생
class Teacher extends Person{
	Teacher(){
		super.name=this.name;
		//super.setName(name); //private일 경우
	}
	private String name="선생님";
	void teach() {
		System.out.println(name+"은 가르친다.");
	}
}

public class J20210503_01_inheritance {

	public static void main(String[] args) {
		Student st=new Student(); //참조변수 st
		st.breath();
		st.eat();
		st.learn();
		Teacher t1=new Teacher();
		t1.breath();
		t1.eat();
		t1.teach();
	}

}
