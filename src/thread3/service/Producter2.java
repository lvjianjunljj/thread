package thread3.service;
//生产者
public class Producter2 {
	private String lock;

	public Producter2(String lock) {
		super();
		this.lock = lock;
	}
	public void setValue(){
		try {
			synchronized (lock) {
				if(!ValueObject1.value.equals("")){
					System.out.println("produceter waiting *** threadName="+Thread.currentThread().getName());
					lock.wait();
				}
				String value = System.currentTimeMillis()+"_"+System.nanoTime();
				System.out.println("produceter running /// threadName="+Thread.currentThread().getName());
				ValueObject1.value = value;
				lock.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
