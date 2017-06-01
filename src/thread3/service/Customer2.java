package thread3.service;
//消费者
public class Customer2 {
	private String lock;

	public Customer2(String lock) {
		super();
		this.lock = lock;
	}
	public void getValue(){
		try {
			synchronized (lock) {
				if(ValueObject1.value.equals("")){
					System.out.println("customer waiting *** threadName="+Thread.currentThread().getName());
					lock.wait();
				}
				System.out.println("customer running *** threadName="+Thread.currentThread().getName());
				ValueObject1.value = "";
				lock.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
