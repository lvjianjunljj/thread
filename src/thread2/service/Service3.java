package thread2.service;

public class Service3 {
	private String username;
	private String password;
	public void setUsernamePassword(String username,String password){
		try {
			String anyString = new String();
			synchronized (anyString) {
				System.out.println("ThreadName="+Thread.currentThread().getName()+",enter time="+System.currentTimeMillis());
				username = username;
				Thread.sleep(3000);
				password = password;
				System.out.println("ThreadName="+Thread.currentThread().getName()+",out time="+System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
