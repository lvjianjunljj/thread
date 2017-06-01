package thread3.service;

public class Productor3 {
	private Mystack1 stack;

	public Productor3(Mystack1 stack) {
		super();
		this.stack = stack;
	}
	
	public void pushService(){
		stack.push();
	}
}
