package thread3.com.mythread.www;

import java.io.PipedReader;

import thread3.service.ReadData1;

public class Mythread24 extends Thread{
	private ReadData1 read;
	private PipedReader input;
	public Mythread24(ReadData1 read, PipedReader input) {
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
