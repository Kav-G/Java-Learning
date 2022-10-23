import java.util.*;

class Question1{

  public static void main (String args[]){

    Scanner w = new Scanner (System.in);

    System.out.println("Enter your word: ");
    String word = w.nextLine();

    int count=0;

    for (int i=0 ; i<word.length() ; i++){

    	char character = word.charAt(i);

    	if (character == 'a'|| character == 'e'|| character == 'i' || character == 'o' ||character == 'u' || character == 'A'|| character == 'E' || character == 'I' || character == 'O' || character == 'U'){

        	count ++;

     	}

    }

    System.out.println("Number of vowels in the word you entered : "+count);

  }

}