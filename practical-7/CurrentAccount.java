class CurrentAccount extends NormalSavings{
	CurrentAccount(){}

	void withdraw(int amount){
		if(balance>=amount){
			balance-=amount;
			System.out.println("The amount is withdrawn. New balance is"+balance);
		}else if(balance>=(-50000)){
			balance-amount;
			System.out.println("The amount is withdrawn. New balance is"+balance);
		}else{
			System.out.println("The balance is insufficient");
		}
	}
}

