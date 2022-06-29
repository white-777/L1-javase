package d0501;

public class Student {
	int id;
	String name;
	String gender;
	int age;
	
	public Student() {
	}
	public Student(int id,String name) {
		this(id, name, null);
	}
	public Student(int id,String name,String gender) {
		//把接收的参数数据，传递到下面的构造方法完成赋值运算
		//重载的构造方法之间调用
		this(id, name, gender, 0);
	}
	public Student(int id,String name,String gender,int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String toString() {
		return id+", "+name+", "+gender+", "+age;
	}
}




