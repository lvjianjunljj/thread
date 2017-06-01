package thread2.service;

public class PrintString {
	private boolean continuePrint = true;

	public boolean isContinuePrint() {
		return continuePrint;
	}

	public void setContinuePrint(boolean continuePrint) {
		this.continuePrint = continuePrint;
	}
	public void method(){
		try {
			while(continuePrint){
				System.out.println("run PrintString threadName="+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
