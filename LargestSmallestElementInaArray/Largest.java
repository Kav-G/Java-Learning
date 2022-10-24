public class Largest {
    public static void main(String args[]) {
        int[] numbers = { -1, -2, -3, -4, -5, -6, -7, -8 };
        int a = numbers[0];

        for (int i = 0; i < (numbers.length); i++) {
            if (a < numbers[i]) {
                a = numbers[i];
            }
        }
        System.out.println(a);
    }
}