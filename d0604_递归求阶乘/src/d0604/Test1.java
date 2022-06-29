package d0604;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数求阶乘：");
		int n = new Scanner(System.in).nextInt();
		long r = f(n);
		System.out.println(r);
	}

	private static long f(int n) {
		//最简问题
		//if (n == 0) {
		//	return 1;//从最简问题向前返回
		//}
		return n * f(n-1); //递归调用
	}
}






