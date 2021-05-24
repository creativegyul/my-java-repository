package ex04_generics;
//사각형 클래스
//필드: 가로(int), 세로(int), 넓이(int)
//제네릭타입: 인스턴스생성시 형을 결정
//T-Type, K-Key, V-Value, E-Element
class Rectangle<T>{
	private T width;
	private T height;
	private double square;
	public Rectangle(T width, T height) {
		this.width = width;
		this.height = height;
		square=getSquare(width, height);
		//square=width*height; //넓이 계산
	}
	public T getWidth() {
		return width;
	}
	public void setWidth(T width) {
		this.width = width;
	}
	public T getHeight() {
		return height;
	}
	public void setHeight(T height) {
		this.height = height;
	}
	public double getSquare(T width, T height) {
		double result=0;
		if (width instanceof Integer) { //width가 Integer형이라면
			result=(int)width*(int)height;
		} else if(width instanceof Double)
			result=(double)width*(double)height;
		return result;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", square=" + square + "]";
	}
}	

public class J20210422_01_generics {
	public static void main(String[] args) {
		Rectangle<Integer> r1=new Rectangle<Integer>(10,25);
		System.out.println(r1);
		Rectangle<Double> r2=new Rectangle<>(5.5,6.5);
		System.out.println(r2);
	}
}
