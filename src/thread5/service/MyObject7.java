package thread5.service;

public class MyObject7 {
	private static class MyObjectHandler{
		private static MyObject7 myObject7 = new MyObject7();
	}
	private MyObject7(){
	}
	public static MyObject7 getInstance(){
		return MyObjectHandler.myObject7;
	}
}
