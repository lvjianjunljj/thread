package thread3.service;

import java.util.Date;

public class InheritableThreadLocalExt2 extends InheritableThreadLocal{
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
	@Override
	protected Object childValue(Object parentValue) {
		return parentValue+"_我在子线程上加的！！！";
	}
}
