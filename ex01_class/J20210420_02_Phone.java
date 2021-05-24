package ex01_class;
//핸드폰 클래스
//필드: 이름(name), 용량(capa), 화소(pixel)
//생성자, getter, setter, toString
class Phone{
	private String name;
	private int capa;
	private int pixel;
	//생성자
	public Phone() {}
	public Phone(String name, int capa, int pixel) {
//		super();
		//나 자신의 생성자 호출, 반드시 순서 가장 먼저
		this(name, capa);
		this.pixel = pixel;
	}
	public Phone(String name, int capa) {
		this.name = name;
		this.capa = capa;
	}
	public Phone(String name) {
		this.name = name;
	}
	//게터/세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapa() {
		return capa;
	}
	public void setCapa(int capa) {
		this.capa = capa;
	}
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", capa=" + capa + ", pixel=" + pixel + "]";
	}
	
}
public class J20210420_02_Phone {
	public static void main(String[] args) {
		Phone p1=new Phone("iPhone 12 mini",512,1200);
		System.out.println(p1);
		p1.setCapa(256);
		System.out.println(p1);

	}
}
