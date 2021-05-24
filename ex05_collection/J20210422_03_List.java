package ex05_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//자료구조: 데이터 저장 및 사용하는 논리적인 구조. 프로그램의 성능이 좌우된다
//컬렉션 프레임워크-클래스들의 집합
//					자료구조를 클래스로 제공
//프로그래머는 잘 정의된 클래스들을 가져다 쓰면 된다.

public class J20210422_03_List {

	public static void main(String[] args) {
		//List<E>
		//저장순서가 있다(index가 있다)
		//데이터 중복 허용
		//1) ArrayList : 배열구조
		//				 검색 시 유리, 추가/삭제 어려움
//		ArrayList<Integer> arrlist=new ArrayList<>();
//		arrlist.add(10); arrlist.add(20); arrlist.add(30);
//		//for문
//		for(int i=0;i<3;i++) {
//			arrlist.add((i+1)*10);
//		}
//		System.out.println(arrlist);
//		//for문
//		for(int i=0;i<arrlist.size();i++) { //배열의 length, 리스트의 size
//			System.out.println(arrlist.get(i)+100);
//		}
//		//for each문
//		for(Integer i:arrlist) {
//			System.out.println(i+100);
//		}
		
//		arrlist.remove(1);
//		System.out.println(arrlist);
//		arrlist.add(1, 50);
//		System.out.println(arrlist);
		
		//실습) 이름을 입력받아 ArrayList만들기
//		Scanner sc=new Scanner(System.in);
//		ArrayList<String> arrName=new ArrayList<>();
//		while (true) {
//			System.out.print("이름: ");
//			String n=sc.next();
//			if (n.equals("q")) break;
//			arrName.add(n);
//		}
//		System.out.println(arrName);
//		for(int i=0; i<arrName.size(); i++) {
//			System.out.println(i+1+". "+arrName.get(i));
//		}
//		//삭제
//		//1안)
////		System.out.print("삭제할 이름: ");
////		String name=sc.next();
////		for (int i=0; i<arrName.size(); i++) {
////			if (arrName.get(i).equals(name)) {
////				arrName.remove(i);
////				i--;
////			}
////		}
////		System.out.println(arrName);
//		//2안: 추천)
//		System.out.print("삭제할 이름: ");
//		String name=sc.next();
//		//반복자 생성
//		Iterator<String> it = arrName.iterator();
//		while(it.hasNext()) { //다음 자료가 있다면
//			String a=it.next(); //다음 자료 가져오기
//			if(name.equals(a)) it.remove(); //다음 자료 지우기
//		}
//		System.out.println(arrName);
		
		//실습) Iterator를 이용해서 출력
		//선언과 동시에 초기화
//		List<String> ls= Arrays.asList("김","이","박");
//		System.out.println(ls);
//		Iterator<String> it=ls.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//실습) 반 학생들의 키를 입력받아 평균 구하기
//		Scanner sc=new Scanner(System.in);
//		ArrayList<Double> height=new ArrayList<>();
//		double sum=0;
//		while (true) {
//			System.out.print("키 입력: ");
//			double d=sc.nextDouble();
//			if (d==0) break;
//			height.add(d);
//			sum+=d;
//		}
//		System.out.println("평균: "+sum/height.size());
		
		//System.out.println(100.0/0); //무한
		//System.out.println(100/0); //예외
		
		//2) LinkedList : 리스트 기반
		//각 요소가 자신의 이전 요소의 주소와 다음 요소의 주소를 가지고 있다.
		//추가/삭제 쉬움, 검색시 성능 저하
		List<String> llist=new LinkedList<>(); //맨앞 Linked 삭제가능(Array도 마찬가지)-호환성
		llist.add("java");
		llist.add("python");
		llist.add("c");
		System.out.println(llist);
		for (int i=0;i<llist.size();i++) {
			System.out.println(llist.get(i));
		}
		
	}

}
