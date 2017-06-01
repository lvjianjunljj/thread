package thread2.service;

public class Main1 {
	synchronized public void mainMethod(){
		try {
			System.out.println("int main 下一步  sleep begin threadName"+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
			Thread.sleep(2000);
			System.out.println("int main 下一步  sleep end threadName"+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
