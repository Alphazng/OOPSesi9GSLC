public abstract class User {
	private String name;
	private String type;
	int count;
	
	public User(String name, String type) {
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
		
	public abstract void TotUser();
	public abstract void AddUser();

	
	
	

}