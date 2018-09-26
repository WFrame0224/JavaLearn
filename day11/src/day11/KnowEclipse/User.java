package day11.KnowEclipse;

public class User extends Object{
	
	private String name;
	private Integer age;
	private Integer genderl;
	
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getGenderl() {
		return genderl;
	}

	public void setGenderl(Integer genderl) {
		this.genderl = genderl;
	}
	
}
