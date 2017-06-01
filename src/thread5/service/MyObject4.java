package thread5.service;

public class MyObject4 {
	private static MyObject4 myObject4;
	private MyObject4(){};
	public static MyObject4 getInstance(){
		try {
			synchronized (MyObject4.class) {
				if(myObject4 != null){
					//模拟一些工作
					Thread.sleep(2000);
				}else{
					//模拟在创建之前的一些准备工作
					Thread.sleep(3000);
					myObject4 = new MyObject4();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject4;
	}
}
