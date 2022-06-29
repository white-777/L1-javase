package d0901;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A{
	public static void main(String[] args) {
		new B().add(new C());
		try {
			FileInputStream fileInputStream = new FileInputStream(new File("xx.xml"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
class B{
	void add(C c){System.out.println("BBBB");}
}
class C{}