package d1504;

public class Test1 {

	public static void main(String[] args) {
		T1 t1 = new T1();
		T1 t2 = new T1();
		//启动线程
		//线程启动后，自动执行 run() 方法
		t1.start();
		t2.start();
		
		System.out.println("main");
	}
	
	static class T1 extends Thread {
		@Override
		public void run() {
			//获取线程名称
			String n = getName();
			//打印1到1000
			for (int i = 1; i <= 1000; i++) {
				System.out.println(n+" - "+i);    
			}
		}
	}

	static class thread extends Thread{
		static int ticket = 100;
		@Override
		public void run() {
			//获取线程名称
			String n = getName();
			//打印1到1000
			for (int i = 1; i <= 1000; i++) {
				System.out.println(n+" - "+i);
			}
		}
	}

}






