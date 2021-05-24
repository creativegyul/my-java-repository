package ex01_class;
//자동차 클래스
//속성: name, colour, power, speed
//기능: powerToggle, speedUp, speedDown
class Car {
	String name="포르쉐 카이엔";
	String colour="Black";
	boolean power;
	int speed;
	void powerToggle() {
		power=!power;
	}
	void speedUp() { //속도 Up : 100을 초과할 수 없다
		if (speed<100) speed++;
	}
	void speedDown() { //속도 Down : 50 미만이 될 수 없다
		if (speed>50) speed--;
	}
}

public class J20210416_04_Car {

	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println("파워: "+c1.power);
		System.out.println("속력: "+c1.speed);
		c1.powerToggle();
		System.out.println("파워: "+c1.power);
		for (int i=0;i<200;i++) {
			c1.speedUp();
		}
		System.out.println("속력: "+c1.speed);
		for(int i=0;i<100;i++) {
			c1.speedDown();
		}
		System.out.println("속력: "+c1.speed);
	}

}
