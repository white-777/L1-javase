package d0704;


import java.text.SimpleDateFormat;

public class Test1 {
	public static void main(String[] args) {
	/*	Integer integer = 1;
		Integer integer2 = 1;
		Integer integer3 = 150;
		Integer integer4 = 150;
		System.out.println(integer==integer2);
		System.out.println(integer3==integer4);
		String s = "123";
		int i = Integer.parseInt(s);
		System.out.println(i);*/
		String a="a";
		String b="b";
		String c ="a"+"b";
		String d = a + b;
		String e =d.intern();
		String f = a+"b";
		System.out.println(c==d);
		System.out.println(c==e);
		System.out.println(Math.sqrt(5));


	}
}





