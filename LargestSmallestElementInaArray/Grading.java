import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        int a;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your marks :");
        a = obj.nextInt();

        if (75 < a && a < 100) {
            System.out.println("Your Grade is A");
        } else if (65 < a && a < 75) {
            System.out.println("Your Grade is B");
        } else if (55 < a && a < 65) {
            System.out.println("Your Grade is C");
        } else if (35 < a && a < 55) {
            System.out.println("Your Grade is S");
        } else if (0 < a && a < 35) {
            System.out.println("Your Grade is F");
        } else {
            System.out.println("Please enter your valid marks :");
        }

    }
}
