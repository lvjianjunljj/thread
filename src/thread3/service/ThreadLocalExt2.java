package thread3.service;

import java.util.Date;

public class ThreadLocalExt2 extends ThreadLocal {
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
}
