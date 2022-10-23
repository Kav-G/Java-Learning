public class Triangle{
	int lengthsideA;
	int lengthsideB;
	int lengthsideC;
	
	Triangle(){}
	
	void showDetails(){
		System.out.println(lengthsideA);
		System.out.println(lengthsideB);
		System.out.println(lengthsideC);
	}
	
	 void checkTriangle(){

		if(lengthsideA == lengthsideB && lengthsideA == lengthsideC){

			System.out.println("This is an equilateral triangle");

		}else if(lengthsideA == lengthsideB && lengthsideA != lengthsideC){

			System.out.println("This is an isosceles triangle");

		}else if(lengthsideA == lengthsideC && lengthsideA != lengthsideB){

			System.out.println("This is an isosceles triangle");

		}else{

			System.out.println("This is an scalene triangle");

		}

	}

	
}