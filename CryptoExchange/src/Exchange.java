import java.util.Scanner;

public class Exchange {
	
	public static Agent a = new Agent();
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		System.out.println("Welcome to TheCryptoChad's Coin Exchange!");
		System.out.println("");
		
		a.userNameInput();
		
		boolean mainLoop = true;
		
		while(mainLoop) {
			System.out.println("");
			System.out.println("Hello " + a.userName + ", what would you like to do today?");
			System.out.println("");
			System.out.println("1. Check Balances.");
			System.out.println("2. Check Prices.");
			System.out.println("3. Buy Coins.");
			System.out.println("4. Sell Coins.");
			System.out.println("5. Turn OFF the app.");
			System.out.println("");
			System.out.println("Enter your desired option's number:");
			
			int option = scan.nextInt();
			switch(option) {
				case 1:	
					System.out.println("");
					System.out.println("What balances do you want to check?");
					System.out.println("");
					System.out.println("1. Check USD Balance.");
					System.out.println("2. Check BTC Balance.");
					System.out.println("3. Check ETH Balance.");
					System.out.println("4. Check DOT Balance.");
					System.out.println("5. Check RMRK Balance.");
					System.out.println("6. Check KILT Balance.");
					System.out.println("7. Check All Balances.");
					System.out.println("");
					System.out.println("Enter your desired option's number:");
					int balances = scan.nextInt();
					switch(balances) {
						case 1:
							a.usdBalDisplay();
							System.out.println("");
							System.out.println("Your current balance is $" + a.usdBal + ".");
							break;
						case 2:
							a.btcBalDisplay();
							System.out.println("");
							System.out.println("Your current balance is " + a.btcBal + " BTC.");
							break;
						case 3:
							a.ethBalDisplay();
							System.out.println("");
							System.out.println("Your current balance is " + a.ethBal + " ETH.");
							break;
						case 4:
							a.dotBalDisplay();
							System.out.println("");
							System.out.println("Your current balance is " + a.dotBal + " DOT.");
							break;
						case 5:
							a.rmrkBalDisplay();
							System.out.println("");
							System.out.println("Your current balance is " + a.rmrkBal + " RMRK.");
							break;
						case 6:
							a.kiltBalDisplay();
							System.out.println("");
							System.out.println("Your current balance is " + a.kiltBal + " KILT.");
							break;
						case 7:
							System.out.println("");
							System.out.println("Your current balances are:");
							System.out.println("USD: $" + a.usdBal);
							System.out.println("BTC: " + a.btcBal);
							System.out.println("ETH: " + a.ethBal);
							System.out.println("DOT: " + a.dotBal);
							System.out.println("RMRK: " + a.rmrkBal);
							System.out.println("KILT: " + a.kiltBal);
							break;
					}
					break;
				case 2:	
					System.out.println("");
					System.out.println("What prices do you want to check?");
					System.out.println("");
					System.out.println("1. Check BTC Price.");
					System.out.println("2. Check ETH Price.");
					System.out.println("3. Check DOT Price.");
					System.out.println("4. Check RMRK Price.");
					System.out.println("5. Check KILT Price.");
					System.out.println("6. Check All Prices.");
					System.out.println("");
					System.out.println("Enter your desired option's number:");
					int prices = scan.nextInt();
					switch(prices) {
						case 1:
							System.out.println("");
							a.btcPriceDisplay();
							break;
						case 2:
							System.out.println("");
							a.ethPriceDisplay();
							break;
						case 3:
							System.out.println("");
							a.dotPriceDisplay();
							break;
						case 4:
							System.out.println("");
							a.rmrkPriceDisplay();
							break;
						case 5:
							System.out.println("");
							a.kiltPriceDisplay();
							break;
						case 6:
							System.out.println("");
							System.out.println("Current market prices are:");
							System.out.println("BTC: $" + a.btcPrice);
							System.out.println("ETH: $" + a.ethPrice);
							System.out.println("DOT: $" + a.dotPrice);
							System.out.println("RMRK: $" + a.rmrkPrice);
							System.out.println("KILT: $" + a.kiltPrice);	
							break;
					}
					break;
				case 3:	
					System.out.println("");
					System.out.println("What do you want to buy?");
					System.out.println("");
					System.out.println("1. Buy BTC.");
					System.out.println("2. Buy ETH.");
					System.out.println("3. Buy DOT.");
					System.out.println("4. Buy RMRK.");
					System.out.println("5. Buy KILT.");
					System.out.println("");
					System.out.println("Enter your desired option's number:");
					int buying = scan.nextInt();
					switch(buying) {
						case 1:
							System.out.println("");
							a.buyBTC();
							break;
						case 2:
							System.out.println("");
							a.buyETH();
							break;
						case 3:
							System.out.println("");
							a.buyDOT();
							break;
						case 4:
							System.out.println("");
							a.buyRMRK();
							break;
						case 5:
							System.out.println("");
							a.buyKILT();
							break;		
					}
					break;
				case 4:	
					System.out.println("");
					System.out.println("What do you want to sell?");
					System.out.println("");
					System.out.println("1. Sell BTC.");
					System.out.println("2. Sell ETH.");
					System.out.println("3. Sell DOT.");
					System.out.println("4. Sell RMRK.");
					System.out.println("5. Sell KILT.");
					System.out.println("");
					System.out.println("Enter your desired option's number:");
					int selling = scan.nextInt();
					switch(selling) {
						case 1:
							System.out.println("");
							a.sellBTC();
							break;
						case 2:
							System.out.println("");
							a.sellETH();
							break;
						case 3:
							System.out.println("");
							a.sellDOT();
							break;
						case 4:
							System.out.println("");
							a.sellRMRK();
							break;
						case 5:
							System.out.println("");
							a.sellKILT();
							break;		
					}
					break;
				case 5:
					System.out.println("");
					System.out.println("Turning OFF...");
					mainLoop = false;
			}
		}
	}
}
