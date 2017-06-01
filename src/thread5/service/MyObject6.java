package thread5.service;

public class MyObject6 {
	private static MyObject6 myObject6;

	private MyObject6() {
	};

	public static MyObject6 getInstance() {
		try {
			if (myObject6 != null) {
				// 模拟一些工作
				Thread.sleep(2000);
			} else {
				// 模拟在创建之前的一些准备工作
				Thread.sleep(3000);
				synchronized (MyObject6.class){
					if (myObject6 == null) {
						myObject6 = new MyObject6();
					}
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject6;
	}
}
