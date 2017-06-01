package thread3.service;

public class DBTools {
	volatile private boolean mark = false;
	synchronized public void backupA(){
		try {
			while(mark == true){
				wait();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("AAAAA");
			}
			mark = true;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	synchronized public void backupB(){
		try {
			while(mark == false){
				wait();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("BBBBB");
			}
			mark = false;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
