package fastJson2Json;

public class Userinfo {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	public Userinfo() {
		super();
	}

	public Userinfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}