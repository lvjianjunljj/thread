package thread2.service;

public class Serviced {
	synchronized public void methodA(){
		System.out.println("methodA begin!!!");
		boolean running  = true;
		while(running){
		}
		System.out.println("methodA end!!!");
	}
	synchronized public void methodB(){
		System.out.println("methodB begin!!!");
		System.out.println("methodB end!!!");
	}
}
