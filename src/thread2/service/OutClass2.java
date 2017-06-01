package thread2.service;

public class OutClass2 {
	public static class Inner1{
		public void methodA(Inner2 class2){
			String threadName = Thread.currentThread().getName();
			synchronized (class2) {
				System.out.println("threadName="+threadName+" in InnerClass1 nethodA");
				for(int i=0;i<10;i++){
					System.out.println("i="+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("threadName="+threadName+" out InnerClass1 nethodA");
			}
		}
		public synchronized void methodB(){
			String threadName = Thread.currentThread().getName();
			System.out.println("threadName="+threadName+" in InnerClass1 nethodB");
			for(int i=0;i<10;i++){
				System.out.println("j="+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("threadName="+threadName+" out InnerClass1 nethodB");
		}
	}
	public static class Inner2{
		public synchronized void methodA(){
			String threadName = Thread.currentThread().getName();
			System.out.println("threadName="+threadName+" in InnerClass2 nethodB");
			for(int i=0;i<10;i++){
				System.out.println("k="+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("threadName="+threadName+" out InnerClass2 nethodB");
		}
	}
}
