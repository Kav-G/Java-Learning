public class Check_Account{

	public static void main (String args[]){
		Account account=new Account();
		
		account.accNumber="245687236";
		account.accHolderName="K.H.Galagedara";
		account.balance=1200;
		
		account.showAccountDetails();
		account.deposit(5000);
		account.withdraw(2000);
	}
}