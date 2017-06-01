package thread3.service;

public class ThreadLocalExt1 extends ThreadLocal {
	@Override
	protected Object initialValue() {
		return "这是默认值，第一次调用get方法不会再返回null了！！！";
	}
}
