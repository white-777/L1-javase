package d0101;


import java.sql.DriverManager;
import java.util.*;


public class HelloWorld {
	//主方法、入口方法
	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 100; i++) {
			Task1 task1 = new Task1(i);

		}

	}
	static class Task1 implements Runnable {
		int id;
		public Task1(int id){
			this.id = id;
		}

			@Override
		public void run() {
			String n  = Thread.currentThread().getName();
				System.out.println(n+"------------"+i);
		}
	}

}






