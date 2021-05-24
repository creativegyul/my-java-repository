package ex08_inher;
//부모
class Animal{
}
//치타
class Cheetah extends Animal{
	private String name="치타";
	@Override
	public String toString() {
		return name ;
	}
}
//랫서팬더
class Panda extends Animal{
	private String name="랫서팬더";
	@Override
	public String toString() {
		return name ;
	}
}

class AnimalCare{
	//먹이주기 메소드
	void eating(Animal a){
		System.out.println(a+"에게 먹이주기");
	}
	//목욕시키기 메소드
	void washing(Animal a) {
		System.out.println(a+" 목욕시키기");
	}
}

public class J20210504_03_Animal {

	public static void main(String[] args) {
		Cheetah cheetah=new Cheetah();
		Panda panda=new Panda();
		Animal ani=new Cheetah();
		AnimalCare ac=new AnimalCare();
		ac.eating(cheetah);
		ac.washing(ani);
		ac.eating(panda);
		ac.washing(new Panda());
		ani=new Panda();
		ac.washing(ani);
	}

}
