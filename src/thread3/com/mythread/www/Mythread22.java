package thread3.com.mythread.www;

import java.io.PipedInputStream;

import thread3.service.ReadData;

public class Mythread22 extends Thread{
	private ReadData read;
	private PipedInputStream input;
	public Mythread22(ReadData read, PipedInputStream input) {
		super();
		this.read = read;
		this.input = input;
	}
	
	@Override
	public void run() {
		super.run();
		read.readMethod(input);
	}
}
