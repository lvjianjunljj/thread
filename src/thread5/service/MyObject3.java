package thread5.service;

public class MyObject3 {
	private static MyObject3 myObject3;
	private MyObject3(){};
	synchronized public static MyObject3 getInstance(){
		try {
			if(myObject3 != null){
				//模拟一些工作
				Thread.sleep(2000);
			}else{
				//模拟在创建之前的一些准备工作
				Thread.sleep(3000);
				myObject3 = new MyObject3();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject3;
	}
}
