package ex05_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class J20210422_04_Map {

	public static void main(String[] args) {
		//맵: Key, Value
		//순서가 없다(index 없음)
		//key 중복 x, value 중복 허용
//		HashMap<Integer, String> hm=new HashMap<>();
//		hm.put(1, "one");
//		hm.put(2, "two");
//		hm.put(3, "three");
//		System.out.println(hm);
//		System.out.println(hm.get(2));
		
		//실습) 반 학생들의 나이(key:이름, value:나이)를 Map에 저장
		Scanner sc=new Scanner(System.in);
		Map<String, Integer> amap=new TreeMap<>(); //HashMap도 TreeMap도 Map의 자식
		Map<String, Integer> amap2=new HashMap<>();
		System.out.print("학생은 총 몇명? ");
		int a=sc.nextInt();
		for (int i=0; i<a; i++) {
			System.out.print("이름: ");
			String s=sc.next();
			System.out.print("나이: ");
			int age=sc.nextInt();
			amap.put(s, age);
			System.out.println("------------");
		}
		System.out.println(amap);
	}

}
