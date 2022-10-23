class SpecialSavings extends NormalSavings{
	SpecialSavings (){
		interest rate=15;
	}

	void withdraw (int amount){
		if (balance>=amount && (balance-amount)>=2000){
			balance-=amount;
			System.out.println("The amount is withdrawn. New balance is"+balance);
		}else{
			System.out.println("The balance is insufficient");
		}
	}
}
