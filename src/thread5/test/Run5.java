package thread5.test;
/*五、定时器*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.text.DefaultEditorKit.PasteAction;
public class Run5 {
	
	/*方法schedule(TimerTask task,Date time)的作用是在指定的日期执行一次某一任务。
	 * 执行任务的时间晚于当前时间：在未来执行的效果；
	 * 例中任务虽然执行完了，但是进程还未销毁。
	 * 查看构造方法可以得知，创建一个Timer就是启动一个新的线程，这个新的线程并不是守护线程，一直在运行
	private static Timer timer = new Timer();
	public static class MyTask extends TimerTask{
		@Override
		public void run() {
			System.out.println("运行了！时间为"+new Date());
		}
	}
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2016-2-28 10:41:00";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toString());
			timer.schedule(task, dateRef);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*通过给Timer(true)设置参数true可以将新创建的Timer改成守护线程
	 * 但是这样程序运行后迅速结束当前的线程，可能TimerTask中的任务不再被运行，因为进程已经结束了
	private static Timer timer = new Timer(true);
	public static class MyTask extends TimerTask{
		@Override
		public void run() {
			System.out.println("运行了！时间为"+new Date());
		}
	}
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2016-2-28 10:49:00";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toString());
			timer.schedule(task, dateRef);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*计划时间早于当前时间：提前运行的效果
	 * 如果执行任务的事件早于当前时间，则立即执行task任务
	private static Timer timer = new Timer(true);
	public static class MyTask extends TimerTask{
		@Override
		public void run() {
			System.out.println("运行了！时间为"+new Date());
		}
	}
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2016-2-28 10:49:00";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toString());
			timer.schedule(task, dateRef);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*多个TimerTask任务及延时
	private static Timer timer = new Timer();
	public static class MyTask extends TimerTask{
		@Override
		public void run() {
			System.out.println("运行了！时间为"+new Date());
		}
	}
	public static void main(String[] args) {
		try {
			MyTask task1 = new MyTask();
			MyTask task2 = new MyTask();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString1 = "2016-2-28 11:10:50";
			String dateString2 = "2016-2-28 11:10:55";
			Date dateRef1 = sdf1.parse(dateString1);
			Date dateRef2 = sdf2.parse(dateString2);
			System.out.println("字符串1时间："+dateRef1.toLocaleString()+" 当前时间："+new Date().toString());
			System.out.println("字符串2时间："+dateRef2.toLocaleString()+" 当前时间："+new Date().toString());
			timer.schedule(task1, dateRef1);
			timer.schedule(task2, dateRef2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*TimerTask是以队列的方式一个一个被顺序执行的，所以执行的事件有可能和预期的时间不一致
	 * 前面的任务有可能消耗的时间比较长， 则后面的任务运行的事件也会被延迟
	 * 如果前面的任务结束的时间早于后面任务计划时间，则后面的任务会在计划时间运行
	 * 如果前面的任务结束的时间晚于后面任务计划时间，则后面的任务会在前面的任务结束后立即运行
	private static Timer timer = new Timer();
	public static class MyTask1 extends TimerTask{
		@Override
		public void run() {
			try {
				System.out.println("1 begin 运行了！时间为"+new Date());
				Thread.sleep(3000);
				System.out.println("1 begin 运行了！时间为"+new Date());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static class MyTask2 extends TimerTask{
		@Override
		public void run() {
			System.out.println("2 begin 运行了！时间为"+new Date());
			System.out.println("2 运行了！时间为"+new Date());
			System.out.println("2 end 运行了！时间为"+new Date());
		}
	}
	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();
			MyTask2 task2 = new MyTask2();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString1 = "2016-2-28 12:03:00";
			String dateString2 = "2016-2-28 12:03:10";
			Date dateRef1 = sdf1.parse(dateString1);
			Date dateRef2 = sdf2.parse(dateString2);
			System.out.println("字符串1时间："+dateRef1.toLocaleString()+" 当前时间："+new Date().toString());
			System.out.println("字符串2时间："+dateRef2.toLocaleString()+" 当前时间："+new Date().toString());
			timer.schedule(task1, dateRef1);
			timer.schedule(task2, dateRef2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*方法schedule(TimerTask task,Date firstTime,long period)的作用是在指定的日期之后，按指定的某个周期性地无限循环地执行某一任务
	private static Timer timer = new Timer();
	public static class MyTask extends TimerTask{
		@Override
		public void run() {
			System.out.println("运行了！时间为"+new Date());
		}
	}
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2016-2-28 12:10:30";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toString());
			timer.schedule(task, dateRef,4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*计划时间早于当前时间：提前运行的效果
	 * 如果执行任务的事件早于当前时间，则立即按指定的建个周期性地无限循环地执行task任务
	private static Timer timer = new Timer();
	public static class MyTask extends TimerTask{
		@Override
		public void run() {
			System.out.println("运行了！时间为"+new Date());
		}
	}
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2016-2-28 14:33:00";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toString());
			timer.schedule(task, dateRef,4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*任务时间有可能被延迟
	 * 如果前面的任务结束的时间早于后面任务计划时间，则后面的任务会在计划时间运行
	 * 如果前面的任务结束的时间晚于后面任务计划时间，则后面的任务会在前面的任务结束后立即运行。
	 * （这里三条都类似于TimerTask类的规则）
	private static Timer timer = new Timer();
	public static class MyTask extends TimerTask{
		@Override
		public void run() {
			try {
				System.out.println("运行了！时间为"+new Date());
				Thread.sleep(5000);
				System.out.println("结束了！时间为"+new Date());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2016-2-28 14:33:00";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toString());
			timer.schedule(task, dateRef,4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*TimerTask类中的cancel()方法的作用是将自身从任务列表中清除,其他任务不受影响
	private static Timer timer = new Timer();
	public static class MyTask1 extends TimerTask{
		@Override
		public void run() {
				System.out.println("1 运行了！时间为"+new Date());
				this.cancel();
		}
	}
	public static class MyTask2 extends TimerTask{
		@Override
		public void run() {
			System.out.println("2 运行了！时间为"+new Date());
		}
	}
	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();
			MyTask2 task2 = new MyTask2();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2016-2-28 12:03:00";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串1时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toString());
			timer.schedule(task1, dateRef,4000);
			timer.schedule(task2, dateRef,4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*Timer类中的cancel()方法的作用是将任务列表中的全部任务清除
	 *示例中全部任务都被清楚，并且进程被销毁，按钮由红色变成灰色 
	private static Timer timer = new Timer();
	public static class MyTask1 extends TimerTask{
		@Override
		public void run() {
				System.out.println("1 运行了！时间为"+new Date());
				timer.cancel();
		}
	}
	public static class MyTask2 extends TimerTask{
		@Override
		public void run() {
			System.out.println("2 运行了！时间为"+new Date());
		}
	}
	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();
			MyTask2 task2 = new MyTask2();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2016-2-28 12:03:00";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串1时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toString());
			timer.schedule(task1, dateRef,4000);
			timer.schedule(task2, dateRef,4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*注意Timer类中的cancel()方法有时并不一定会停止执行计划任务，而是正常执行
	 * 这是因为Timer类中的cancel()方法有时并没有抢到queue锁，所以TimerTask类中的任务继续正常运行
	 * 根据打印结果可以看出这种情况发生的概率较低
	static int i =0;
	public static class MyTask extends TimerTask{
		@Override
		public void run() {
			System.out.println("运行了"+i+"时间为"+new Date());
		}
	}
	public static void main(String[] args) {
		while(true){
			try {
				i++;
				Timer timer = new Timer();
				MyTask task = new MyTask();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dateString = "2016-2-28 12:03:00";
				Date dateRef = sdf.parse(dateString);
				timer.schedule(task, dateRef);
				timer.cancel();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}
	*/
	
	/*方法schedule(TimerTask task, long delay)的作用是以执行方法当前的时间为参考时间，延迟指定的毫秒数后执行一次TimerTask任务
	public static class MyTask extends TimerTask{
		@Override
		public void run() {
			System.out.println("运行了！时间为"+new Date());
		}
	}
	public static void main(String[] args) {
		Timer timer = new Timer();
		MyTask task = new MyTask();
		System.out.println("当前时间为"+new Date());
		timer.schedule(task, 2000);
	}
	*/
	
	/*使用方法schedule：如果执行任务的时间没有被延迟，那么下一个任务的执行时间参考的是上一次任务“开始”时的时间来计算的
	private static Timer timer = new Timer();
	private static int runCount = 0;
	public static class MyTask extends TimerTask{
		@Override
		public void run() {
			try {
				System.out.println("运行了！时间为"+new Date());
				Thread.sleep(1000);
				System.out.println("结束了！时间为"+new Date());
				runCount++;
				if(runCount == 5){
					timer.cancel();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2016-2-28 10:41:00";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toString());
			timer.schedule(task, dateRef,3000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*使用方法scheduleAtFixedRate：如果执行任务的时间没有被延迟，那么下一个任务的执行时间参考的是上一次任务“结束”时的时间来计算的
	 * 示例亲测不是这个样
	private static Timer timer = new Timer();
	private static int runCount = 0;
	public static class MyTask extends TimerTask{
		@Override
		public void run() {
			try {
				System.out.println("运行了！时间为"+new Date());
				Thread.sleep(1000);
				System.out.println("结束了！时间为"+new Date());
				runCount++;
				if(runCount == 10){
					timer.cancel();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2016-2-28 22:08:50";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toString());
			timer.scheduleAtFixedRate(task, dateRef, 5000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*延时情况则没有差别，如果执行任务的时间被延迟了，上一次任务“结束”时下一次任务立即执行
	private static Timer timer = new Timer();
	private static int runCount = 0;
	public static class MyTask extends TimerTask{
		@Override
		public void run() {
			try {
				System.out.println("运行了！时间为"+new Date());
				Thread.sleep(3000);
				System.out.println("结束了！时间为"+new Date());
				runCount++;
				if(runCount == 5){
					timer.cancel();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2016-2-28 21:26:00";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toString());
			timer.schedule(task, dateRef, 1000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	*/
}
