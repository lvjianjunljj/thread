package thread2.service;

public class OutClass1 {
	static public class Inner{
		public void methodA(){
			synchronized ("其他的锁") {
				for(int i=0;i<100;i++){
					System.out.println("ThreadName="+Thread.currentThread().getName()+" i="+i);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		synchronized public void methodB(){
			for(int i=0;i<100;i++){
				System.out.println("ThreadName="+Thread.currentThread().getName()+" i="+i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
