public class Karyawan extends User implements IKondisi{
	
	private String ID;
	private String Pekerjaan;
	public Karyawan(String type, String name, String iD, String pekerjaan) {
		super(type, name);
		ID = iD;
		Pekerjaan = pekerjaan;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPekerjaan() {
		return Pekerjaan;
	}
	public void setPekerjaan(String pekerjaan) {
		Pekerjaan = pekerjaan;
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
