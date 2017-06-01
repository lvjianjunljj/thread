package thread1.com.mythread.www;

public class Mythread8 extends Thread{
	@Override
	public void run() {
		super.run();
		for(int i=0;i<95000;i++){
			System.out.println("i="+i);
		}
	}
}
