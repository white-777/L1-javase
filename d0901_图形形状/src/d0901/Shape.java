package d0901;

public abstract class Shape {
	/*
	 * *) 作为通用方法
	 * *) 子类必须实现
	 */
	public abstract void draw();
	
	
	public void clear() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("图形已被擦除");
		System.out.println("---------------------------");
	}
}