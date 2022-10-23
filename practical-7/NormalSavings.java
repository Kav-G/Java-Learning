class NormalSavings{

	String account_number; 
	String branch; 
	String account_holder_name; 
	String nic; 
	int interest_rate;
	int balance;

	NormalSavings()
	{
		interest_rate = 10;	
	}

	void deposit(int amount){
		balance+=amount;
		System.out.println("The amount is deposit. New balance is "+balance) ;
	}

	void withdraw(int amount){
		if (balance>=amount){
			balance-=amount;
		 	System.out.println("The amount is withdrawn. New balance is "+balance): 
		}else{
			System.out.println("The balance is insufficient");
		}
	}

}