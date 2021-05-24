package ex14_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class J20210507_10_character {

	public static void main(String[] args) {
		//문자 기반: 문자데이터의 입출력을 다루는 스트림
		//char형 변수: 2byte
		//자바는 모든 문자를 유니코드 기준으로 표현
//		char c='홍';
//		System.out.println(c);
		//문자단위로 쓰기
		//try-with 문
//		try(FileWriter fw = new FileWriter("./data/charSample.txt")) {
//			fw.write('A');
//			fw.write("자바");
//			fw.write("good");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//파일 읽기
//		int ch;
//		try(FileReader fr = new FileReader("./data/charSample.txt")) {
//			while((ch=fr.read())!=-1) { //while(ch!=-1)
//				//ch=fr.read();
//				System.out.print((char)ch);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//실습) 좋아하는 칼라를 입력받아 파일을 만들고
		//파일을 읽어서 리스트를 출력
//		Scanner sc=new Scanner(System.in);
//		System.out.print("좋아하는 색은? ");
//		String colour=sc.next();
//		System.out.print("두번째 좋아하는 색은? ");
//		String colour2=sc.next();
//		System.out.print("세번째 좋아하는 색은? ");
//		String colour3=sc.next();
//		try(FileWriter fw=new FileWriter("./data/colour.txt")) {
//			fw.write(colour);
//			fw.write(",");
//			fw.write(colour2);
//			fw.write(",");
//			fw.write(colour3);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//한줄씩 읽기
//		String s;
//		try(BufferedReader br=new BufferedReader(new FileReader("./data/colour.txt"))) {
//			while((s=br.readLine())!=null) {
//				String[] co=s.split(",");
//				System.out.println("좋아하는 컬러: ");
//				for(String i:co) {
//					System.out.println(i);
//				}
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//실습) 이름과 점수를 입력받아 파일에 저장하고
		//파일을 읽어서 합계와 평균 구하기
		//문자를 숫자로 바꾸기
		Scanner sc=new Scanner(System.in);
		//BufferedWriter: 문자단위 버퍼 보조
		//FileWriter: 파일에 문자단위로 출력
		//try~with문: 파일 close 자동
//		try(BufferedWriter bw=new BufferedWriter(new FileWriter("./data/score.txt"))) {
//			while(true) {
//				System.out.println("종료하려면 q 입력");
//				System.out.print("학생이름: ");
//				String name=sc.next();
//				if (name.equals("q")) {
//					System.out.println("종료합니다."); break;
//				}
//				System.out.print("국어점수는? ");
//				String kor=sc.next();
//				System.out.print("영어점수는? ");
//				String eng=sc.next();
//				System.out.print("수학점수는? ");
//				String math=sc.next();
//				bw.write(name);
//				bw.write(",");
//				bw.write(kor);
//				bw.write(",");
//				bw.write(eng);
//				bw.write(",");
//				bw.write(math);
//				bw.newLine(); //개행
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//한줄씩 읽기
		try(BufferedReader br=new BufferedReader(new FileReader("./data/score.txt"))) {
			String s=null;
			while((s=br.readLine())!=null) {
				String[] data=s.split(",");
				int sum=0; //과목의 합계
				for (int i=1;i<4;i++) {
					sum+=Integer.parseInt(data[i]);
				}
				System.out.println("이름: "+data[0]);
				System.out.println("합계: "+sum);
				System.out.printf("평균: %.2f\n",(double)sum/3);
				System.out.println("------------");
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(Integer.parseInt("100")+Integer.parseInt("80"));
	}

}
