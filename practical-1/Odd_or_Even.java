import java.util.*;

class Odd_or_Even {

    public static void main (String args[]){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Number of Inputs : ");
        int count=input.nextInt();

        int odd=0, even=0;
   
        for(int i=0;i<count;i++){

            System.out.println("Enter the Input Number "+(i+1));
            int value=input.nextInt();

            if (value%2==0){
                even++;
            }else if (value%2==1){
                odd++;
            }
        }

        System.out.println("Number of Even Numbers Counted :"+(even));
        System.out.println("Number of Odd Numbers Counted :"+(odd));
    }

}