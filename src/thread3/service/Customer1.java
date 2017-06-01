package thread3.service;
//消费者
public class Customer1 {
	private String lock;

	public Customer1(String lock) {
		super();
		this.lock = lock;
	}
	public void getValue(){
		try {
			synchronized (lock) {
				if(ValueObject1.value.equals("")){
					lock.wait();
				}
				System.out.println("get的值是"+ValueObject1.value);
				ValueObject1.value = "";
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
