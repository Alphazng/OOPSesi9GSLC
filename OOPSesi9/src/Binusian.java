public class Binusian extends User implements IKondisi{
	
	private String nim;
	private String jurusan;
	
	public Binusian(String name, String type, String nim, String jurusan) {
		super(name, type);
		this.nim = nim;
		this.jurusan = jurusan;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
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