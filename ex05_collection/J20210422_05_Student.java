package ex05_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//학생클래스
//필드: 번호, 이름, 전화번호
class Student{
	private int no;
	private String name;
	private String tell;
	public Student() {}
	public Student(int no, String name, String tell) {
		this.no = no;
		this.name = name;
		this.tell = tell;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", tell=" + tell + "]";
	}
}

public class J20210422_05_Student {

	public static void main(String[] args) {
		Student st1=new Student(1, "쿠키","010-1234-5678");
		Student st2=new Student(2, "몽실","010-1111-2323");
		Student st3=new Student(3, "꽃님","010-3434-3434");
		//ArrayList에 저장
//		List<Student> sarr=new ArrayList<>();
//		sarr.add(st1);
//		sarr.add(st2);
//		sarr.add(st3);
//		System.out.println(sarr);
//		for (int i=0; i<sarr.size();i++) {
//			Student s=sarr.get(i);
//			System.out.println(s.getNo()+"번 "+s.getName()+" "+s.getTell());
//		}
//		for(Student i:sarr) {
//			System.out.println(i.getNo()+"번 "+i.getName()+i.getTell());
//		}
		//Map에 저장(Key: no, Value:Student)
		Scanner sc=new Scanner(System.in);
		Map<Integer, Student> m1=new HashMap<>();
		m1.put(st1.getNo(),st1);
		m1.put(st2.getNo(),st2);
		m1.put(st3.getNo(),st3);
//		System.out.print("어느 번호를 출력? ");
//		int no=sc.nextInt();
//		Student s=m1.get(no);
//		System.out.println(s.getNo()+"번 "+s.getName()+" "+s.getTell());
//		System.out.println(m1);
//		System.out.println("----------------------");
		Set<Integer> a=m1.keySet();
//		System.out.println(a);
//		for (int k:a) {
//			System.out.println(k);
//		}
		Iterator<Integer> i=a.iterator();
		while(i.hasNext()) {
			int key=i.next();
			System.out.println(key);
			Student st=m1.get(key);
			System.out.println(st.getNo()+"번 "+st.getName()+" "+st.getTell());
		}
		
		//실습)
		//result : "success"
		//data : ArrayList<Student> st1~3
		Map<String, Object> hmap=new HashMap<>();
		hmap.put("result","success");
		List<Student> slist=new ArrayList<>();
		slist.add(st1);
		slist.add(st2);
		slist.add(st3);
		hmap.put("data",slist);
		System.out.println(hmap);
		System.out.println("----------------------");
		//만약 result가 success라면 학생정보를 출력
		//아니면 error를 출력
		String result = (String)hmap.get("result"); //다운캐스팅(부모형->자식형)
		if (result.equals("success")) {
			System.out.println("성공");
			List<Student> stlist=(List<Student>)hmap.get("data");
			//System.out.println(stlist);
			for(Student s:stlist) {
				//System.out.println(s);
				System.out.println(s.getNo()+"번 "+s.getName()+" "+s.getTell());
			}
		} else System.out.println("에러 발생");
		
	}

}
