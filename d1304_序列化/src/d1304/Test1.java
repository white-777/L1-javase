package d1304;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1 {
	public static void main(String[] args) throws Exception {
		Student s = 
		 new Student(9527,"唐伯虎","男",19);
		/*
		 * OOS--FOS--f3
		 */
/*		ObjectOutputStream out =
		 new ObjectOutputStream(
		 new FileOutputStream("d:/abc/f3"));

		out.writeObject(s);

		out.close();*/


		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("1.txxt"));
		objectOutputStream.writeObject(s);
		objectOutputStream.close();
	}
}








