package ex12_inner;
//
class OuterClass{
	class InnerClass{
		public String toString() {
			return "인스턴스 클래스";
		}
	}
	
	InnerClass inner=new InnerClass(); //필드
	void method1() {
		InnerClass localInner=new InnerClass(); //변수
		System.out.println(localInner);
	}
	
	class InnerClassNew{
		public String toString() {
			return "새로운 인스턴스 클래스";
		}
	}
}

public class J20210507_01_inner {

	public static void main(String[] args) {
		OuterClass outer=new OuterClass();
		System.out.println(outer.inner);
		outer.method1();
		
		//inner클래스 생성
		OuterClass.InnerClassNew newInner=outer.new InnerClassNew();
		System.out.println(newInner);
	}

}
