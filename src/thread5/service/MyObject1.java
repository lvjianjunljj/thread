package thread5.service;

public class MyObject1 {
	private static MyObject1 myObject1 = new MyObject1();
	private MyObject1(){};
	public static MyObject1 getInstance(){
		return myObject1;
	}
}
