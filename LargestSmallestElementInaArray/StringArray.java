public class StringArray {
    public static void main(String[] args) {

        String names[] = { "iroshan", "rashmi", "manula", "Hirushi", "SB" };
        int a = names[0].length();
        String b = names[0];
        for (int i = 0; i < names.length; i++) {
            if (a > names[i].length()) {
                a = names[i].length();
                b = names[i];
            } else if (a == names[i].length()) {
                a = names[i].length();
                b = names[i];
                System.out.println(b);

            }
        }

        System.out.println(b);

    }
}