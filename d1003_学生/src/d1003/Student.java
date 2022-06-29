package d1003;

public class Student {
	//静态初始化块
	static {
		System.out.println(
		"静态块 - Student类被加载时执行");
	}
	
	
	//成员变量一般都用private隐藏
	//便于维护修改
	private int id;
	private String name;
	private String gender;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
}







