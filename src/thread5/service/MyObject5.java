package thread5.service;

public class MyObject5 {
	private static MyObject5 myObject5;

	private MyObject5() {
	};

	public static MyObject5 getInstance() {
		try {
			if (myObject5 != null) {
				// 模拟一些工作
				Thread.sleep(2000);
			} else {
				// 模拟在创建之前的一些准备工作
				Thread.sleep(3000);
				synchronized (MyObject5.class){
					myObject5 = new MyObject5();
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject5;
	}
}
