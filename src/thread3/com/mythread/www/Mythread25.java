package thread3.com.mythread.www;

import thread3.service.DBTools;

public class Mythread25 extends Thread {
	private DBTools backup;

	public Mythread25(DBTools backup) {
		super();
		this.backup = backup;
	}
	
	@Override
	public void run() {
		super.run();
		backup.backupA();
	}
}
