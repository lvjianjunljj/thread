package thread2.service;

public class PublicVar1 {
	public String username = "A";
	public String password = "AA";
	synchronized public void setValue(String username,String password){
		try {
			this.username = username;
			Thread.sleep(2000);
			this.password = password;
			System.out.println("setValue method thread name="+Thread.currentThread().getName()+" username="+username+" password="+password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/*synchronized*/ public void getValue(){
		System.out.println("getValue method thread name="+Thread.currentThread().getName()+" username="+username+" password="+password);
	}
}
