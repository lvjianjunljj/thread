package thread2.service;

public class Main {
	public int i = 10;//这里是public子类可以不用声明直接调用
	synchronized public void mainMethod(){
		try {
			i--;
			System.out.println("main i="+i);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
