import java.awt.desktop.UserSessionListener;

public class NonBinusian extends User implements IKondisi {
	private String Pekerjaan;
	private String asal;
	private String Email;
	public NonBinusian(String name, String type, String pekerjaan, String asal, String email) {
		super(name, type);
		Pekerjaan = pekerjaan;
		this.asal = asal;
		Email = email;
	}
	public String getPekerjaan() {
		return Pekerjaan;
	}
	public void setPekerjaan(String pekerjaan) {
		Pekerjaan = pekerjaan;
	}
	public String getAsal() {
		return asal;
	}
	public void setAsal(String asal) {
		this.asal = asal;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
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
	public void Kesehatan() {
		if(health == true)System.out.println("Healthy");
	}
}
		
	