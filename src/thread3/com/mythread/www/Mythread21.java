package thread3.com.mythread.www;

import java.io.PipedOutputStream;

import thread3.service.WriteData;

public class Mythread21 extends Thread {
	private WriteData write;
	private PipedOutputStream out;
	public Mythread21(WriteData write, PipedOutputStream out) {
		super();
		this.write = write;
		this.out = out;
	}
	
	@Override
	public void run() {
		super.run();
		write.writeMethod(out);
	}
}
