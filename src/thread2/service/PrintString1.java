package thread2.service;

public class PrintString1 implements Runnable {
	private boolean continuePrint = true;

	public boolean isContinuePrint() {
		return continuePrint;
	}

	public void setContinuePrint(boolean continuePrint) {
		this.continuePrint = continuePrint;
	}
	//外部不调用只是内部调用的话这里是private或者public都可以
	private void method(){
		try {
			while(continuePrint){
				System.out.println("run PrintString threadName="+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		//在类里面定义的方法可以直接调用同类的方法，不需要将类实例化
		method();
	}
}
