package ex13_thread;

public class J20210507_08_sleep {
	public static void main(String[] args) throws InterruptedException {
//		for(int i=1;i<6;i++) {
//			Thread.sleep(1000); //1000분의 1초
//			System.out.println(i);
//		}
		Thread th=new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					for (int i=5; i>0; i--) {
						//우선순위가 낮은 스레드가 기아상태에 빠지는 것을 방지
						Thread.sleep(1000);
						System.out.println(i+"초");
					}
					System.out.println("발사");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		th.start();
		
		System.out.println("메인 스레드 종료");
	}
}
