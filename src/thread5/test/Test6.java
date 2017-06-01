package thread5.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import thread5.com.mythread.www.Mythread01;
import thread5.com.mythread.www.Mythread02;
import thread5.com.mythread.www.Mythread03;
import thread5.com.mythread.www.Mythread04;
import thread5.com.mythread.www.Mythread05;
import thread5.com.mythread.www.Mythread06;
import thread5.com.mythread.www.Mythread07;
import thread5.com.mythread.www.Mythread08;
import thread5.service.MyObject8;

public class Test6 {
	public static void main(String[] args) {
		
		/*立即加载就是使用类的时候已经将对象创建完毕，常见的方法就是直接new实例化（“饿汉模式”）。
		 * 缺点是不能有其他实例变量，示例中因为getInstance()方法没有同步，所以有可能出现非线程安全问题。
		Mythread01 t1 = new Mythread01();
		Mythread01 t2 = new Mythread01();
		Mythread01 t3 = new Mythread01();
		t1.start();
		t2.start();
		t3.start();
		*/
		
		/*延迟加载就是在调用get()方法时实例才被创建，常见的实现办法就是在get()方法中进行new实例化。
		 * （就是在调用方法时实例才被创建——“懒汉模式”）
		 * 但是并不是单例的，这就是“错误的单例模式”
		Mythread02 t1 = new Mythread02();
		Mythread02 t2 = new Mythread02();
		Mythread02 t3 = new Mythread02();
		t1.start();
		t2.start();
		t3.start();
		*/
		
		/*延迟加载（“懒汉模式”）的解决方案：
		 * 1、声明synchronized关键字
		Mythread03 t1 = new Mythread03();
		Mythread03 t2 = new Mythread03();
		Mythread03 t3 = new Mythread03();
		t1.start();
		t2.start();
		t3.start();
		*/
		
		/*2、尝试同步代码块
		Mythread04 t1 = new Mythread04();
		Mythread04 t2 = new Mythread04();
		Mythread04 t3 = new Mythread04();
		t1.start();
		t2.start();
		t3.start();
		*/
		
		/*3、针对某些重要的代码进行单独的同步
		 * 运行时，效率完全可以大大提升。但如果遇到多线程的情况下还是无法解决得到同一个实例对象的结果
		Mythread05 t1 = new Mythread05();
		Mythread05 t2 = new Mythread05();
		Mythread05 t3 = new Mythread05();
		t1.start();
		t2.start();
		t3.start();
		*/
		
		/*4、使用DCL双检查锁机制
		 * 使用双重检查锁功能，成功解决了“懒汉模式”遇到多线程的问题。DCL也是大多数多线程结合单例模式使用的解决方案
		Mythread06 t1 = new Mythread06();
		Mythread06 t2 = new Mythread06();
		Mythread06 t3 = new Mythread06();
		t1.start();
		t2.start();
		t3.start();
		*/
		
		/*使用静态内置类实现单例模式
		Mythread07 t1 = new Mythread07();
		Mythread07 t2 = new Mythread07();
		Mythread07 t3 = new Mythread07();
		t1.start();
		t2.start();
		t3.start();
		*/
		
		/*序列化与反序列化的单例模式
		 * 静态内置类可以达到线程安全问题，但如果遇到序列化对象时，使用默认的方式运行得到的结果还是多例的。
		 * 示例中解决办法就是在反序列化中使用readResolve()方法。
		try {
			MyObject8 myobject = MyObject8.getInstance();
			FileOutputStream fosRef = new FileOutputStream(new File("test.txt"));
			ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
			oosRef.writeObject(myobject);
			oosRef.close();
			fosRef.close();
			System.out.println(myobject.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fisRef = new FileInputStream(new File("test.txt"));
			ObjectInputStream oisRef = new ObjectInputStream(fisRef);
			MyObject8 myobject = (MyObject8) oisRef.readObject();
			oisRef.close();
			fisRef.close();
			System.out.println(myobject.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		*/
		
		/*使用static代码块实现单例模式
		Mythread08 thread1 = new Mythread08();
		Mythread08 thread2 = new Mythread08();
		Mythread08 thread3 = new Mythread08();
		thread1.start();
		thread2.start();
		thread3.start();
		*/
		
		
		
	}
}
