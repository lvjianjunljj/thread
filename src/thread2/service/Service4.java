package thread2.service;

public class Service4 {
	private String anyString = new String();
	public void methodA(){
		synchronized (anyString) {
			try {
				System.out.println("A Begin!!!");
				Thread.sleep(3000);
				System.out.println("A End!!!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized public void methodB(){
		System.out.println("B Begin!!!");
		System.out.println("B End!!!");
	}
}
