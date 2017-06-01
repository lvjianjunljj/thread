package thread3.service;

public class Customer3 {
	private Mystack1 stack;

	public Customer3(Mystack1 stack) {
		super();
		this.stack = stack;
	}
	
	public void popService(){
		System.out.println("pop="+stack.pop());
	}
}
