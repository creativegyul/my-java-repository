package ex09_abstract;
//부모클래스 포켓몬:추상클래스
abstract class Pokemon{
	void gameName() {
		System.out.println("<포켓몬게임>");
	}
	abstract void attack();
	abstract void sound();
}
//피카츄
class Pikachu extends Pokemon{
	void attack() {
		System.out.println("전기공격");
	}
	void sound() {
		System.out.println("피카피카");
	}
}
//꼬부기
class Squirtle extends Pokemon{
	void attack() {
		System.out.println("물대포");
	}
	void sound() {
		System.out.println("꼬북꼬북");
	}
}
//게임클래스
class GamePlay{
	void attackPlay(Pokemon p) {
		p.gameName();
		p.attack();
	}
	void soundPlay(Pokemon p) {
		p.sound();
	}
}

public class J20210504_06_Pokemon {

	public static void main(String[] args) {
		GamePlay gp=new GamePlay();
		Pikachu pika=new Pikachu();
		Squirtle kkobuk=new Squirtle();
		gp.attackPlay(pika);
		gp.soundPlay(pika);
		gp.attackPlay(kkobuk);
		gp.soundPlay(kkobuk);
	}

}
