package d0305;

public class Test1 {
	public static void main(String[] args) {
		f1();
		f2();
	}

	private static void f1() {
		/*
		 * 鸡的数量j，从0到35
		 * 兔的数量t，从35到0
		 * 
		 * for第一项，可以给多个变量赋值
		 * 第三项，可以修改多个变量
		 */
		for (int j=0,t=35; j<=35; j++,t--) {
			//如果脚的数量是94，打印这个组合
			if (j*2 + t*4 == 94) {
				System.out.println(
				 "鸡："+j+"，兔："+t);
			}
		}
	}


	public static void f2(){
		for(int i=0,j=35;i<=35;i++,j--){
			if(i*4+j*2==94){
				System.out.println("兔兔"+i+"鸡你太美"+j);
			}
		}
	}
}








