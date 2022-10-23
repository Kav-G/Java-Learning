import java.util.*;

class Question5{

     public static void main (String args[]){
        Scanner scan=new Scanner(System.in);

     	int [] marks=new int[3];
     	int sum=0;
     
     	for (int i=0;i<3;i++){
        	System.out.print("Enter Mark : ");
        	marks[i]=scan.nextInt();
        	sum+=marks[i];
     	}   
     
     	System.out.print("Marks you entered ");

     	for (int i=0;i<3;i++){
          System.out.print(marks[i]+",");
     	}

     	System.out.println("\b ");
     
     	System.out.println("Total mark : "+sum);

    }

}