package basic01;

public class J20210412_03_operator {

	public static void main(String[] args) {
		//삼항연산자
		//양수 또는 음수 출력
//		int a=10;
//		String s1=(a>0)? "양수":"음수";
//		System.out.println(s1);
		
		//실습) 두 수 중에서 큰 수를 출력
		int a=100, b=50;
		int c=(a>b)? a:b;
		System.out.println("큰 값: "+c);
		
		//실습) 세 수 중에서 가장 큰 수 출력
		int x=20, y=10, z=30;
		int max = x>y? (x>z)?x:z:(y>z)?y:z;
		System.out.println("큰 값: "+max);
		
		//실습) 짝홀수 출력하기
		int odd=10;
		String s1 = (odd%2==0)? "짝수":"홀수";
		System.out.println(s1);
		
		//실습) 세 과목이 모두 60점이 넘으면 합격 아니면 불합격
		int kor=90, eng=85, math=50;
		System.out.println((kor>=60 && eng>=60 && math>=60)?"합격":"불합격");
		
	}

}
