package d1303;

import java.io.FileOutputStream;

public class Test1 {
	public static void main(String[] args) throws Exception {
		/*
		 * FOS--d:/abc/f2
		 * 
		 * new FileOutputStream(文件)
		 * 不管文件是否存在，都新建空文件
		 */
		FileOutputStream out = 
		 new FileOutputStream("C:\\Users\\26560\\Desktop\\sb\\f2");
		out.write(97);//00 00 00 61 --> 61
		out.write(98);//00 00 00 62 --> 62
		out.write(99);//00 00 00 63 --> 63
		out.write(356);//00 00 01 64 --> 64
		
		byte[] a = {
				101,102,103,104,105,
				106,107,108,109,110
		};
		out.write(a, 0, 10);
		out.write(a, 3, 4);
		out.close();//释放系统资源
	}
}







