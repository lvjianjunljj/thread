package thread2.service;

public class Servicei {
	private boolean isContinueRun = true;
	public void run() {
		/*String anyString = new String();*/
		while(isContinueRun){
			/*synchronized (anyString) {
			}*/
		}
		System.out.println("停下来了！！！");
	}
	public void stop() {
		isContinueRun = false;
	}
}
