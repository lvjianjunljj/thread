package thread3.service;

import java.util.ArrayList;
import java.util.List;

public class Mylist2 {
	private static List list = new ArrayList();
	public static void add() {
		list.add("吕建君");
	}
	public static int size() {
		return list.size();
	}
}
