package thread1.com.mythread.www;

import java.util.Random;

public class Mythreadh2 extends Thread {
	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		long addResult= 0;
		for(int j=0;j<10;j++){
			for(int i=0;i<500000;i++){
				Random random = new Random();
				random.nextInt();
				addResult += i;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&Mythreadh2 run time id "+(endTime-beginTime));
	}
}
