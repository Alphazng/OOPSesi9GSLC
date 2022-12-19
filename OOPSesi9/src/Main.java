import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<User>userList = new ArrayList<>();
	
	// Untuk Check-in
	public void CheckIn() {
		String name, jurusan;
		String ID;
		String type;
		String pekerjaan;
		String asal, Email;
		
		
		do {
			System.out.print("What are you [Binusian | Lecturer | Employee | Non-Binusian]?: ");
			type = scan.nextLine();
		} while (!type.equals("Binusian") && !type.equals("Lecturer") && !type.equals("Employee") && !type.equals("Non-Binusian"));
		
		// Validasi
		// Apabila Binusian maka diminta untuk input nama, nim, dan jurusan
		if(type.equals("Binusian")) {
			System.out.print("Input your Full Name:");
			name = scan.nextLine();
			
			System.out.print("Input your Student ID: ");
			ID = scan.nextLine();
			
			System.out.print("Input Your Major: ");
			jurusan = scan.nextLine();
			
			// Menambahkan data binusian dengan menggunakan arraylist
			Binusian userAdd = new Binusian(name,  type,  ID,  jurusan);
			userList.add(userAdd);
			System.out.println("Data Successfully Added");
			System.out.println();
			// Menghtitung Jumlah populasi user  yang sedang berada di kampus binus
			System.out.println("Data Successfully Added");
			for (int i = 0; i < userList.size(); i++) {
				userAdd.AddUser();
				
			}
			System.out.println();
			System.out.print("Current Population: ");
			userAdd.TotUser();
			
			
			
		}
		// Apabila dosen maka diminta untuk input nama dan nim dosen
		else if(type.equals("Lecturer")) {
			System.out.print("Input your Full Name: ");
			name = scan.nextLine();
			
			System.out.print("Input your Lecturer ID: ");
			ID = scan.nextLine();
			
			// Menambahkan data dosen dengan menggunakan arraylist
			Dosen userAdd = new Dosen(name,  type,  ID);
			userList.add(userAdd);
			System.out.println("Data Successfully Added");
			System.out.println();
			// Menghtitung Jumlah populasi user  yang sedang berada di kampus binus
			System.out.println("Data Successfully Added");
			for (int i = 0; i < userList.size(); i++) {
				userAdd.AddUser();
				
			}
			System.out.println();
			System.out.print("Current Population: ");
			userAdd.TotUser();
		}
		else if(type.equals("Employee")){
			System.out.print("Input your Full Name: ");
			name = scan.nextLine();
			
			System.out.print("Input your Employee ID: ");
			ID = scan.nextLine();
			
			System.out.print("Your Occupation at Binus: ");
			pekerjaan = scan.nextLine();
			
			// Menambahkan data karyawan binus dengan menggunakan arraylist
			Karyawan userAdd = new Karyawan(name,  type,  ID,  pekerjaan);
			userList.add(userAdd);
			System.out.println("Data Successfully Added");
			System.out.println();
			// Menghtitung Jumlah populasi user  yang sedang berada di kampus binus
			System.out.println("Data Successfully Added");
			for (int i = 0; i < userList.size(); i++) {
				userAdd.AddUser();
							
			}
			System.out.println();
			System.out.print("Current Population: ");
			userAdd.TotUser();
		}
		else if(type.equals("Non-Binusian")) {
			
			System.out.print("Input your Full Name: ");
			name = scan.nextLine();
			
			System.out.print("Your Occupation: ");
			pekerjaan = scan.nextLine();
			
			System.out.print("Where are you from? ");
			asal = scan.nextLine();
			
			System.out.print("Input Your Email:  ");
			Email = scan.nextLine();
			
			// Menambahkan data Non-Binusian dengan menggunakan arraylist
			NonBinusian userAdd = new NonBinusian(name,  type,  pekerjaan,  asal, Email);
			userList.add(userAdd);
			// Menghtitung Jumlah populasi user  yang sedang berada di kampus binus
			System.out.println("Data Successfully Added");
			for (int i = 0; i < userList.size(); i++) {
				userAdd.AddUser();
				
			}
			System.out.println();
			System.out.print("Current Population: ");
			userAdd.TotUser();
			
		}
		
	}
	
	// Membuat method view untuk melihat data-data yang telah di dimasukkan
	public void View() {
		int choose;
		// Apabila tidak ada data 
		if(userList.isEmpty()) {
			System.out.println("No Data Avalaible!!");
			System.out.println("Press Enter to Continue......");
			scan.nextLine();
		}
		// Apabila ada data
		else {
			for(int i=0;i<userList.size();i++){
				User temp=userList.get(i);
				if(temp instanceof Binusian) {
					System.out.printf("No.%d | Name: %s | ID: %s | Type: %s | Occupation: %s | Origin: %s | |Email: %s | Condition:"
							, (int)i+1, temp.getName(), ((Binusian)temp).getNim(), temp.getType(),"-", "-", "-");
					((Binusian) temp).Kesehatan();
					System.out.println();
					
					
				}
				else if(temp instanceof Dosen) {
					System.out.printf("No.%d | Name: %s | ID: %s | Type: %s | Occupation: %s | Origin: %s | Email: %s | condition: "
							, (int)i+1, temp.getName(), ((Dosen)temp).getID(), temp.getType(),"-", "-", "-");
					((Dosen) temp).Kesehatan();
					System.out.println();
					
				}
				else if(temp instanceof Karyawan) {
					System.out.printf("No.%d | Name: %s | ID: %s | Type: %s | Occupation: %s | Origin: %s | Email: %s | Condtion: "
							, (int)i+1, temp.getName(), ((Karyawan)temp).getID(), temp.getType(), ((Karyawan)temp).getPekerjaan(), "-", "-");
					((Karyawan) temp).Kesehatan();
					System.out.println();
					
				}
				else if(temp instanceof NonBinusian) {
					System.out.printf("No.%d | Name: %s | ID: %s | Type: %s | Occupation: %s | Origin: %s | Email: %s | Condtion: "
							, (int)i+1, temp.getName(), "-", temp.getType(),((NonBinusian)temp).getPekerjaan(), ((NonBinusian)temp).getPekerjaan(), 
							((NonBinusian)temp).getEmail());
					((NonBinusian) temp).Kesehatan();
					System.out.println();
				
				}
			}
		}
				
				
	
			
		}
		
	
	public void CheckOut() {
		// declare nama yang mau di delete atau check out
		String FindName;
		// apabila data kosong
		if(userList.isEmpty()) {
			System.out.println("No Data Avalaible!!");
			System.out.println("Press Enter to Continue......");
			scan.nextLine();
		}
		// Apabila data tidak kosong
		else {
			// Panggil method view untuk melihat data-data yang telah ada
			View();
			// Delete berdasarkan nama yang diinput
			System.out.print("Input Your Full Name to Check Out: ");
			FindName = scan.nextLine();
			for(int i =0; i<userList.size(); i++) {
				User temp = userList.get(i);
				// Apabila nama yang mau di check-out sama dengan nama yang ada pada data, maka dapat checkout
				if(temp.getName().equals(FindName)) {
					userList.remove(i);
					System.out.println("You have succesfully checked");
					System.out.println("Press Enter to Continue...");
					scan.nextLine();
			
				}
				
			}
		}
	}
	
	public Main() {
		int input=0;
		
		// Membuat menu
		do {
			System.out.println("Main Menu");
			System.out.println("================");
			System.out.println("1. Check-in");
			System.out.println("2. View");
			System.out.println("3. Check-out");
			System.out.println("4. Exit");
			System.out.print("Input: ");
			input = scan.nextInt();
			scan.nextLine();
			
			// Validasi
			if(input == 1) {
				// Panggil Method Check-in
				CheckIn();
			}
			else if(input == 2) {
				// Panggil Method View
				View();
				
			}
			else if(input == 3) {
				// Method Check-out
				CheckOut();
			}
			
		} while (input !=4);
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
