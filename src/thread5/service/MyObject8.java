package thread5.service;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MyObject8 implements Serializable{
	private static final long serialVersionUID = 888L;
	//内部类方法
	private static class MyObjectHandler{
		private static final MyObject8 myobject8 = new MyObject8();
	}
	private MyObject8(){
	}
	public static MyObject8 getInstance(){
		return MyObjectHandler.myobject8;
	}
	protected Object readResolve() throws ObjectStreamException{
		System.out.println("use readResolve");
		return MyObjectHandler.myobject8;
	}
}
