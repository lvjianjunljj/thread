package thread5.service;

public class MyObject2 {
	private static MyObject2 myObject2;
	private MyObject2(){};
	public static MyObject2 getInstance(){
		try {
			if(myObject2 != null){
				//模拟一些工作
				Thread.sleep(2000);
			}else{
				//模拟在创建之前的一些准备工作
				Thread.sleep(3000);
				myObject2 = new MyObject2();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject2;
	}
}
