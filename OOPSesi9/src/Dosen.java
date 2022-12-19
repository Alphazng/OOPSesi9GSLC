public class Dosen extends User implements IKondisi{
	
	private String ID;

	public Dosen(String type, String name, String iD) {
		super(type, name);
		ID = iD;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	@Override
	public void TotUser() {
		System.out.println(count);
		
	}
	@Override
	public void AddUser() {
		count++;
		
	}
	
	@Override
	public void Kesehatan(){
		if(health == true) {
			System.out.println("Healthy");
		}
		
	}
	

}
