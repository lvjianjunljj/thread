package thread7.com.mythread.www;

public class Mythread04 extends Thread {
	private Object lock;
	private String showChar;
	private int showNumberPosition;
	private int printCount = 0;// 统计打印了几个字母
	volatile private static int addNumber = 1;

	public Mythread04(Object lock, String showChar, int showNumberPosition) {
		super();
		this.lock = lock;
		this.showChar = showChar;
		this.showNumberPosition = showNumberPosition;
	}

	@Override
	public void run() {
		super.run();
		try {
			synchronized (lock) {
				while (true) {
					if (addNumber % 3 == showNumberPosition) {
						System.out.println("threadName:"
								+ Thread.currentThread().getName()
								+ " runCount=" + addNumber + " " + showChar);
						lock.notifyAll();
						addNumber++;
						printCount++;
						if (printCount == 4) {
							break;
						}
					} else {
						lock.wait();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
