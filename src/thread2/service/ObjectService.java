package thread2.service;
//synchronized同步代码块的使用
public class ObjectService {
	public void method() {
		try {
			synchronized (this) {
				System.out.println("begin time="+System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("end time="+System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
