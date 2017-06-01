package thread2.service;

public class Sub extends Main{
	synchronized public void subMethod(){
		try {
			while(i>0){
				i--;
				System.out.println("sub i="+i);
				Thread.sleep(100);
				this.mainMethod();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
