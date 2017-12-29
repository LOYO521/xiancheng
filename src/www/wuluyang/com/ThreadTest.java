package www.wuluyang.com;
//Ïß³Ì
public class ThreadTest {
	class Threads extends Thread{
		@Override
		public void run() {
			for (int i = 0; i < 30; i++) {
				System.out.println("i:"+i);
				try {
					Threads.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public void a(){
		new Threads().start();
	}
	public static void main(String[] args) {
		new  ThreadTest().a();
	}
}
