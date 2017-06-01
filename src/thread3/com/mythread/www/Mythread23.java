package thread3.com.mythread.www;

import java.io.PipedWriter;

import thread3.service.WriteData1;

public class Mythread23 extends Thread {
	private WriteData1 write;
	private PipedWriter out;
	public Mythread23(WriteData1 write, PipedWriter out) {
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
