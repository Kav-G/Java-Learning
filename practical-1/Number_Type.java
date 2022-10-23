import java.util.*;

class Number_Type {

    public static void main (String args[]){

        Scanner input=new Scanner (System.in);

        System.out.println("Enter your Number :");
        int value = input.nextInt();

        int typeA=0, typeB=0;
        
        if(value%25==0 && value%100!=0){
            typeA=1;
        }

        if(value%4==0 && value%128!=0){
            typeB=1;
        }

        if(typeA==1 && typeB==0){
            System.out.println("Type A");

        }else if(typeA==0 && typeB==1){
            System.out.println("Type B");

        }else if(typeA==1 && typeB==1){
            System.out.println("Type A and Type B");

        }else{
            System.out.println("The entered number is not either Type A or Type B");
        }
    }
}