package thread3.com.mythread.www;

import thread3.service.DBTools;

public class Mythread26 extends Thread {
	private DBTools backup;

	public Mythread26(DBTools backup) {
		super();
		this.backup = backup;
	}
	
	@Override
	public void run() {
		super.run();
		backup.backupB();
	}
}
