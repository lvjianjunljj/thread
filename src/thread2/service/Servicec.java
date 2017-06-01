package thread2.service;

public class Servicec {
	public void print(Object object){
		try {
			synchronized (object) {
				while(true){
					System.out.println("ThreadName="+Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
