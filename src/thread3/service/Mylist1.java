package thread3.service;

import java.util.ArrayList;
import java.util.List;

public class Mylist1 {
	private List list = new ArrayList();
	public void add() {
		list.add("吕建君");
	}
	public int size() {
		return list.size();
	}
}
