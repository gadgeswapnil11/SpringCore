package ConstruvtoInjection;

public class Emplyoess {
	private String name;
	private String Lastname;
	private int id;

	
	public Emplyoess( int id) {
		super();
		this.id = id;
	}
	
	public Emplyoess( String name) {
		super();
		this.name = name;
	}
	
	public Emplyoess(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}



	public Emplyoess(String name, String lastname, int id) {
		super();
		this.name = name;
		Lastname = lastname;
		this.id = id;
	}



	public Emplyoess(String name, String lastname) {
		super();
		this.name = name;
		Lastname = lastname;
	}



	@Override
	public String toString() {
		return "Emplyoess [name=" + name + ", Lastname=" + Lastname + ", id=" + id + "]";
	}

}
