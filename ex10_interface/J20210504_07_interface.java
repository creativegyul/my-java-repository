package ex10_interface;
//클래스는 다중상속 불가
//인터페이스: 구현부가 없다, 다중상속이 가능, 객체생성불가
interface Attack{
	String name="포켓몬 공격"; //public static final 생략됨
	void attack(); //public abstract 생략됨
	//default : 추상메소드가 아닌 일반 메소드라는 의미
	default void gameTime() {
		System.out.println("24시간");
	}
}
interface Sound{
	String name="포켓몬 소리";
	abstract void sound();
}
//자식클래스
class Pikachu implements Attack, Sound{
	@Override
	public void attack() {
		System.out.println("전기공격");
	}
	@Override
	public void sound() {
		System.out.println("피카피카");
	}
}
class Squirtle implements Attack, Sound{
	@Override
	public void attack() {
		System.out.println("물대포");
	}
	@Override
	public void sound() {
		System.out.println("꼬북x2");
	}
}
//게임
class GamePlay {
	void attack(Attack a) {
		a.attack();
	}
	void sound(Sound s) {
		s.sound();
	}
}

public class J20210504_07_interface {

	public static void main(String[] args) {
//		Attack a=new Pikachu();
//		Sound s=new Pikachu();
//		a.attack();
//		s.sound();
		Pikachu pika=new Pikachu();
//		pika.attack(); pika.sound();
		Squirtle sq=new Squirtle();
//		sq.attack(); sq.sound();
		GamePlay gp=new GamePlay();
		gp.attack(pika); gp.sound(pika);
		gp.attack(sq); gp.sound(sq);
		System.out.println(Attack.name);
		pika.gameTime();
	}

}
