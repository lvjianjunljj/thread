package thread2.service;

public class Service5 {
	public Mylist2 addData(Mylist2 list,String data){
		try {
			if(list.getSize()<1){
				Thread.sleep(2000);//模拟远程花费2秒取回数据
				list.add(data);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return list;
	}
}
