package thread2.service;

import thread2.service.InnerClass.PrivateClass;

public class InnerClassRun {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*测试内置类
		 * 如果InnerClass.java类和Run.java类不在同一个包中，需要将PrivateClass内置声明成public公开的
		 * 就算是在同一个包中，也需要import相应内置类import service.InnerClass.PrivateClass;*/
		InnerClass innerClass = new InnerClass();
		innerClass.setUsername("username");
		innerClass.setPassword("password");
		System.out.println(innerClass.getUsername()+" "+innerClass.getPassword());
		//想要实例化内置类必须使用一下代码
		PrivateClass privateClass = innerClass.new PrivateClass();
		privateClass.setAge("age");
		privateClass.setAddress("address");
		System.out.println(privateClass.getAge()+" "+privateClass.getAddress());
		
		
		
		
		
		
		
	}
}
