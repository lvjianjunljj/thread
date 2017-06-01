package thread3.service;

import java.util.ArrayList;
import java.util.List;

public class Mystack1 {
	private List list = new ArrayList();
	synchronized public void push(){
		try {
			while(list.size() == 1){
				System.out.println("push waiting "+Thread.currentThread().getName());
				this.wait();
			}
			list.add("anyString_"+Math.random());
			this.notifyAll();
			System.out.println("push="+list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	synchronized public String pop(){
		String returnValue = "";
		try {
			while(list.size() == 0){
				System.out.println("pop waiting "+Thread.currentThread().getName());
				this.wait();
			}
			returnValue = ""+list.get(0);
			list.remove(0);
			this.notifyAll();
			System.out.println("pop="+list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}
