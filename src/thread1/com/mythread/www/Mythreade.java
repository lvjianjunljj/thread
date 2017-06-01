package thread1.com.mythread.www;

public class Mythreade extends Thread {
	@Override
	public void run() {
		super.run();
		while(true){
			if(this.isInterrupted()){
				System.out.println("停止了！！！");
				return;
			}
			System.out.println("time is "+System.currentTimeMillis());
		}
	}
}
