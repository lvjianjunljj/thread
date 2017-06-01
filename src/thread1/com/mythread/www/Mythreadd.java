package thread1.com.mythread.www;

public class Mythreadd extends Thread {
	@Override
	public void run() {
		super.run();
		try{
			for(int i=0;i<100000;i++){
				System.out.println("i="+i);
			}
			System.out.println("run begin!!!");
			Thread.sleep(200000);
			System.out.println("run end!!!");
		}catch(InterruptedException e){
			System.out.println("先停止，再遇到sleep！进入catch！！！"+this.isInterrupted());
			e.printStackTrace();
		}
	}
}
