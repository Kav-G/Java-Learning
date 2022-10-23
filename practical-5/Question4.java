import java.util.*;

class Question4{

      public static void main (String args[]){

           Scanner num=new Scanner (System.in);

           System.out.print("Enter Number 1 : ");
           int number1=num.nextInt();

           System.out.print("Enter Number 2 : ");
           int number2=num.nextInt () ;
           
           if (number1==number2){
               System.out.println("Numbers are equal");
           }else{
               System.out.println("Numbers are not equal");
           }

      }

}