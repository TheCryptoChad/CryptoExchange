import java.util.Scanner;

public class Client {
	
	public static Scanner scan = new Scanner(System.in);
	
	float usdBal = 1000000.00F;
	float btcBal = 0.00F;
	float ethBal = 0.00F;
	float dotBal = 0.00F;
	float rmrkBal = 0.00F;
	float kiltBal = 0.00F;
	
	public String userName;
	
	public String userNameInput() {
		System.out.println("Enter your name:");
		userName = scan.nextLine();
		return userName;
	}
	
	public float usdBalDisplay() {
		return usdBal;
	}
	
	public float btcBalDisplay() {
		return btcBal;
	}
	
	public float ethBalDisplay() {
		return ethBal;
	}
	
	public float dotBalDisplay() {
		return dotBal;
	}
	
	public float rmrkBalDisplay() {
		return rmrkBal;
	}
	
	public float kiltBalDisplay() {
		return kiltBal;
	}
	
	public Client() {
		
	}
}
