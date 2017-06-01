package thread2.service;

public class Service2 {
	private String username;
	private String password;
	private String anyString = new String();
	public void setUsernamePassword(String username,String password){
		try {
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
