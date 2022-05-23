
public class Agent extends Client {

	float btcPrice = 30000.25F;
	float ethPrice = 1500.50F;
	float dotPrice = 10.00F;
	float rmrkPrice = 4.50F;
	float kiltPrice = 0.85F;
	
	void btcPriceDisplay() {
		System.out.println("Right now, 1 BTC is: $" + btcPrice);
	}
	
	void ethPriceDisplay() {
		System.out.println("Right now, 1 ETH is: $" + ethPrice);
	}
	
	void dotPriceDisplay() {
		System.out.println("Right now, 1 DOT is: $" + dotPrice);
	}
	
	void rmrkPriceDisplay() {
		System.out.println("Right now, 1 RMRK is: $" + rmrkPrice);
	}
	
	void kiltPriceDisplay() {
		System.out.println("Right now, 1 KILT is: $" + kiltPrice);
	}
	
	public void buyBTC() {
		System.out.println("How much are you going to buy?");
		float amount = scan.nextFloat();
		float orderSize = amount * btcPrice;
		if((orderSize) <= usdBal) {
			usdBal = usdBal - orderSize;
			btcBal = btcBal + amount;
			System.out.println("Congratultions, you bought " + amount + " BTC for $" + orderSize + " Your new balances are $" + usdBal + " and " + btcBal + " BTC.");
		} else {
			System.err.println("We couldn't process your transaction: Insufficient Funds.");
		}
	}
	
	public void buyETH() {
		System.out.println("How much are you going to buy?");
		float amount = scan.nextFloat();
		float orderSize = amount * ethPrice;
		if((orderSize) <= usdBal) {
			usdBal = usdBal - orderSize;
			ethBal = ethBal + amount;
			System.out.println("Congratultions, you bought " + amount + " ETH for $" + orderSize + " Your new balances are $" + usdBal + " and " + ethBal + " ETH.");
		} else {
			System.err.println("We couldn't process your transaction: Insufficient Funds.");
		}
	}
	
	public void buyDOT() {
		System.out.println("How much are you going to buy?");
		float amount = scan.nextFloat();
		float orderSize = amount * dotPrice;
		if((orderSize) <= usdBal) {
			usdBal = usdBal - orderSize;
			dotBal = dotBal + amount;
			System.out.println("Congratultions, you bought " + amount + " DOT for $" + orderSize + " Your new balances are $" + usdBal + " and " + dotBal + " DOT.");
		} else {
			System.err.println("We couldn't process your transaction: Insufficient Funds.");
		}
	}
	
	public void buyRMRK() {
		System.out.println("How much are you going to buy?");
		float amount = scan.nextFloat();
		float orderSize = amount * rmrkPrice;
		if((orderSize) <= usdBal) {
			usdBal = usdBal - orderSize;
			rmrkBal = rmrkBal + amount;
			System.out.println("Congratultions, you bought " + amount + " RMRK for $" + orderSize + " Your new balances are $" + usdBal + " and " + rmrkBal + " RMRK.");
		} else {
			System.err.println("We couldn't process your transaction: Insufficient Funds.");
		}
	}
	
	public void buyKILT() {
		System.out.println("How much are you going to buy?");
		float amount = scan.nextFloat();
		float orderSize = amount * kiltPrice;
		if((orderSize) <= usdBal) {
			usdBal = usdBal - orderSize;
			kiltBal = kiltBal + amount;
			System.out.println("Congratultions, you bought " + amount + " KILT for $" + orderSize + " Your new balances are $" + usdBal + " and " + kiltBal + " KILT.");
		} else {
			System.err.println("We couldn't process your transaction: Insufficient Funds.");
		}
	}
	
	public void sellBTC() {
		System.out.println("How much are you going to sell?");
		float amount = scan.nextFloat();
		float orderSize = amount * btcPrice;
		if(amount <= btcBal) {
			btcBal = btcBal - amount;
			usdBal = usdBal + orderSize;
			System.out.println("Congratultions, you sold " + amount + " BTC for $" + orderSize + " Your new balances are $" + usdBal + " and " + btcBal + " BTC.");
		} else {
			System.err.println("We couldn't process your transaction: Insufficient Funds.");
		}
	}
	
	public void sellETH() {
		System.out.println("How much are you going to sell?");
		float amount = scan.nextFloat();
		float orderSize = amount * ethPrice;
		if(amount <= ethBal) {
			ethBal = ethBal - amount;
			usdBal = usdBal + orderSize;
			System.out.println("Congratultions, you sold " + amount + " ETH for $" + orderSize + " Your new balances are $" + usdBal + " and " + ethBal + " ETH.");
		} else {
			System.err.println("We couldn't process your transaction: Insufficient Funds.");
		}
	}
	
	public void sellDOT() {
		System.out.println("How much are you going to sell?");
		float amount = scan.nextFloat();
		float orderSize = amount * dotPrice;
		if(amount <= dotBal) {
			dotBal = dotBal - amount;
			usdBal = usdBal + orderSize;
			System.out.println("Congratultions, you sold " + amount + " DOT for $" + orderSize + " Your new balances are $" + usdBal + " and " + dotBal + " DOT.");
		} else {
			System.err.println("We couldn't process your transaction: Insufficient Funds.");
		}
	}
	
	public void sellRMRK() {
		System.out.println("How much are you going to sell?");
		float amount = scan.nextFloat();
		float orderSize = amount * rmrkPrice;
		if(amount <= rmrkBal) {
			rmrkBal = rmrkBal - amount;
			usdBal = usdBal + orderSize;
			System.out.println("Congratultions, you sold " + amount + " RMRK for $" + orderSize + " Your new balances are $" + usdBal + " and " + rmrkBal + "RMRK.");
		} else {
			System.err.println("We couldn't process your transaction: Insufficient Funds.");
		}
	}
	
	public void sellKILT() {
		System.out.println("How much are you going to sell?");
		float amount = scan.nextFloat();
		float orderSize = amount * kiltPrice;
		if(amount <= kiltBal) {
			kiltBal = kiltBal - amount;
			usdBal = usdBal + orderSize;
			System.out.println("Congratultions, you sold " + amount + " KILT for $" + orderSize + " Your new balances are $" + usdBal + " and " + kiltBal + " KILT.");
		} else {
			System.err.println("We couldn't process your transaction: Insufficient Funds.");
		}
	}
	
	public Agent() {
		
	}
}
