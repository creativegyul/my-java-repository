package ex13_thread;
//스레드 만들기 2
//class MyRun implements Runnable{
//	@Override
//	public void run() {
//		for(int i=0; i<10; i++) {
//			System.out.println("runnable 스레드: "+i);
//		}
//	}
//}

public class J20210507_07_Runnable {

	public static void main(String[] args) {
//		MyRun myRun=new MyRun(); //실행 구현
//		Thread th=new Thread(myRun); //스레드 생성
//		th.start(); //스레드 시작
		
		//익명 클래스-Runnable 인터페이스 상속
//		Runnable myRun=new Runnable(){
//			@Override
//			public void run() {
//				for(int i=0; i<10; i++) {
//					System.out.println("runnable 스레드: "+i);
//				}
//			}
//		};
//		Thread th=new Thread(myRun); //스레드 생성
//		th.start();
		
		//스레드 1 생성
		Thread th1=new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("thread1 스레드: "+i);
				}
			}
		});
		//스레드 우선순위: 1~10 (클수록 높음)
		th1.setPriority(1); //우선순위 가장 낮음
		th1.start();
		
		//스레드 2
		Thread th2=new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=991;i<1000;i++) {
					System.out.println("thread2 스레드: "+i);
				}
			}
		});
		th2.setPriority(10); //우선순위 가장 높음
		th2.start();
		
		//main 스레드에서 동작
		for (int i=0;i<10;i++) {
			System.out.println("main 스레드: "+i);
		}
	}

}
