package thread5.service;

public class MyObject9 {
	private static MyObject9 instance = null;
	private MyObject9(){
	}
	static{
		instance = new MyObject9();
	}
	public static MyObject9 getInstance(){
		return instance;
	}
}
