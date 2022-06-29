package d1303;

import java.io.FileInputStream;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * FIS--f2
		 */
		FileInputStream in = 
		 new FileInputStream("C:\\Users\\26560\\Desktop\\sb\\f2");
		
		//标准格式
		int b;
		while((b = in.read()) != -1) {
			System.out.println(b);
		}
		in.close();
		
		/*int b;
		while(true) {
			b = in.read();
			if(b == -1) {
				break;
			}
			System.out.println(b);
		}*/
		
	}
}





