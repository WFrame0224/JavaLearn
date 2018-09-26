package day21._01_object_stream;

//需要序列化的对象
public class User implements java.io.Serializable{
	
	private static final long serialVersionUID = -7681006539513141787L;
	private String name;
	transient private String password;//表示瞬态的字段
	private int age;
	private String email;
	
	public User(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;

	}

	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
}
