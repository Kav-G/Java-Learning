import java.util.*;

class rocket{

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the total Mass : ");
		int mass = input.nextInt();

		System.out.println("Enter the Total Thrust : ");
		int thrust = input.nextInt();

		double acceleration= (thrust-mass*9.8)/mass*1.0;

		System.out.println("Acceleration is "+acceleration+"ms^(-2)");

	}
}