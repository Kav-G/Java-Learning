public class Account{
	static String accNumber;
	static String accHolderName;
	static int balance;
	
	Account(){}
	
	static void showAccountDetails(){
		System.out.println("Account Number: "+accNumber);
		System.out.println("Account Holder Name: "+accHolderName);
		System.out.println("Account Balance: "+balance);
		System.out.println("");
	}
	
	static void deposit(int amount){
		balance+=amount;
		System.out.println("You have successfully deposited the money!");
		System.out.println("Account Balance: "+balance);
		System.out.println("");
	}
	
	static void withdraw (int amount){
		if(balance>=amount){
			balance-=amount;
			System.out.println("You have withdrawn money successfully!");
			System.out.println("Account Balance: "+balance);
			System.out.println("");
		}else{
			System.out.println("You have insufficient Account Balance!!");
			System.out.println("Account Balance: "+balance);
			System.out.println("");
		}
	}

}