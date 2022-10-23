import java.util.Scanner;

class Calc{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first number : ");
		float A = input.nextFloat();

		System.out.println("Enter your second number : ");
		float B = input.nextFloat();

		float sum = A+B;
		float sub = A-B;
		float mul = A*B;
		float div = A/B;

		System.out.println("A + B = "+sum);
		System.out.println("A - B = "+sub);
		System.out.println("A * B = "+mul);
		System.out.println("A / B = "+div);
	}
}