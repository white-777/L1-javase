package d1802;

import java.lang.reflect.Method;

public class Runner {
	//在指定的类中，自动发现自动运行有@Test注解的方法
	public static void launch(Class c) throws Exception{
		Object obj = c.newInstance();
		Method[] a = c.getMethods();
		for (Method m : a) {
			//在方法上，是否存在Test类型的注解
			if (m.isAnnotationPresent(Test.class)) {
				//获取 Test 注解数据
				Test t = m.getAnnotation(Test.class);
				System.out.println("id: "+t.id());
				System.out.println("title: "
			     +(t.title().length()!=0?t.title():t.value()));
				
				m.invoke(obj);
				System.out.println("\n\n-------------------");
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		Runner.launch(A.class);
	}
}
