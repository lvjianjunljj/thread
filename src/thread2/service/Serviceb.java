package thread2.service;

public class Serviceb {
	public void print(String string){
		try {
			synchronized (string) {
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
