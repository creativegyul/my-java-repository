package ex01_class;

import java.util.Arrays;
//학생 클래스
//필드:반(group), 이름(name), 점수(score 배열)(자바,파이썬,c), 합계(sum)
//메소드:합계 계산(sumCal), 평균을 계산해서 반환(avgCal)
class Student {
	String group="A반";
	String name="윤미나";
	int score[]=new int[3];
	int sum;
	//메소드의 오버로딩
	//call by value
	void sumCal(int a, int b, int c) { //합계
		sum=0;
		score[0]=a; score[1]=b; score[2]=c;
		sum=a+b+c;
	}
	//call by reference
	void sumCal(int[] score) { //합계
		sum=0;
		this.score=score; //얕은 copy
		for (int i=0;i<score.length;i++) {
			sum+=score[i];
		}
	}
	//평균 구해서 반환
	double avgCal() {
		double avg=(double)sum/score.length;
		return (double)Math.round(avg*100) / 100;
	}
}
public class J20210419_03_Student {

	public static void main(String[] args) {
		Student st=new Student();
		st.sumCal(79,89,88);
		System.out.println(Arrays.toString(st.score));
		System.out.println("합계: "+st.sum);
		st.sumCal(new int[] {89,90,99});
		System.out.println(Arrays.toString(st.score));
		System.out.println("합계: "+st.sum);
		System.out.println("평균: "+st.avgCal());

	}

}
