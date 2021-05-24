package ex08_inher;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//물건 입고시 물건 목록을 출력하는 클래스
//부모클래스: 물건클래스
class Thing{	
}
//자식클래스: 노트클래스, 펜클래스 등
class Note extends Thing{
	@Override
	public String toString() {
		return "노트";
	}
}
class Pen extends Thing{
	@Override
	public String toString() {
		return "펜";
	}
}
//입고클래스
class Enter{
	//재고관리 저장할 맵
	Map<String, Integer> stock=new HashMap<>();
	//입고목록 프린트 메소드
	void enterPrint(Thing t, int qty) {
		System.out.println(t+" "+qty+"개 입고");
		Integer stockQty=stock.get(t.toString()); //기존 재고 조회, Integer형에 값 대입
		if (stockQty==null) stockQty=0; //재고가 없을 경우 null을 0으로 초기화
		stock.put(t.toString(), stockQty + qty); //재고 누적
	}
	//재고 프린트 메소드
	void stockPrint(Thing t) {
		System.out.println(t+"의 재고는 "+stock.get(t.toString())+"개");
	}
}

public class J20210504_04_Thing {

	public static void main(String[] args) {
		Enter ent=new Enter();
		Pen pen=new Pen();
		Note note=new Note();
		ent.enterPrint(new Pen(),10);
		ent.enterPrint(new Pen(),20);
		ent.stockPrint(pen);
		ent.enterPrint(note, 50);
		ent.stockPrint(note);
	}

}
