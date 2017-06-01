package thread3.service;

public class Subtract2 {
	private String lock;
	public Subtract2(String lock){
		this.lock = lock;
	}
	public void subtract(){
		try {
			synchronized (lock) {
				while (ValueObject.list.size() == 0) {
					System.out.println("wait begin ThreadName="+Thread.currentThread().getName());
					lock.wait();
					System.out.println("wait   end ThreadName="+Thread.currentThread().getName());
				}
				ValueObject.list.remove(0);
				System.out.println("list size="+ValueObject.list.size());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
