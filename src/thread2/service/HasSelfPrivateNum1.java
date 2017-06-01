package thread2.service;

public class HasSelfPrivateNum1 {
	public void addI(String username){
		try{
			int num = 0;
			if(username == "a"){
				num = 100;
				System.out.println("a set over!!!");
				Thread.sleep(2000);
			}else{
				num = 200;
				System.out.println("b set over!!!");
			}
			System.out.println(username+" num="+num);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
