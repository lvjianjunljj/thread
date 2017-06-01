package thread3.service;
//生产者
public class Producter1 {
	private String lock;

	public Producter1(String lock) {
		super();
		this.lock = lock;
	}
	public void setValue(){
		try {
			synchronized (lock) {
				if(!ValueObject1.value.equals("")){
					lock.wait();
				}
				String value = System.currentTimeMillis()+"_"+System.nanoTime();
				System.out.println("set的值是"+value);
				ValueObject1.value = value;
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
