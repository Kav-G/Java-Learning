import java.util.Scanner;

public class GettingArrayFromUser {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int a;

        System.out.println("enter the number of elements: ");
        a = obj.nextInt();
        int numarray[];
        numarray = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.println("enter element" + (i + 1));
            numarray[i] = obj.nextInt();
        }

        for (int i = 0; i < a; i++) {
            System.out.print(numarray[i] + " ");

        }

    }

}
