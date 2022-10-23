import java.util.*;

class Question3{

    public static void main (String args[]){

    	Scanner w =new Scanner(System.in);
    	System.out.print("Enter a word: ");

    	String word = w.nextLine();

    	System.out.println(word);
    
    	String term=word;
    
    	System.out.println("If you want to exit press Enter");
    
    	while(!word.isEmpty()){

        	System.out.println("Enter a word: ");
        	word=w.nextLine();
        
        	if(word.isEmpty()){
             		break;
        	}     

        	term=term+", "+word;
        	System.out.println(term);
    	}

    	System.out.println(term);

    }

}