package thread1.com.mythread.www;

public class Mythreada extends Thread {
	@Override
	public void run() {
		super.run();
		for(int i=0;i<95000;i++){
			if(this.interrupted()){
				System.out.println("已经停止状态了！要退出了！！！");
				//这个break只是跳出了for循环，之后的程序还是会运行(解决办法见Mythreadb)
				break;
			}
			System.out.println("i="+i);
		}
		System.out.println("for之后的程序，表明线程并未停止");
	}
}
