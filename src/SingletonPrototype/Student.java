package SingletonPrototype;

public class Student {

	private String id;
	private String name;
	
	public Student() {
	
	System.out.println("Here is  student  class");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
