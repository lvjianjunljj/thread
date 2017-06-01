package thread1.com.mythread.www;

import java.util.Random;

public class Mythreadi extends Thread {
	private int count = 0;
	public int getCount() {
		return count;
	}
	@Override
	public void run() {
		while(true){
			count++;
		}
	}
}
