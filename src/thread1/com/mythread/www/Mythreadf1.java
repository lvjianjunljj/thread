package thread1.com.mythread.www;

public class Mythreadf1 extends Thread {
	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		int count = 0;
		for(int i=0;i<50000000;i++){
			Thread.yield();
			count =+ i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("线程调用yield()方法用时："+(endTime-beginTime)+"毫秒");
	}
}
