public class Check_Triangle{

	public static void main(String args[]){
		Triangle TriangleA=new Triangle();
		Triangle TriangleB=new Triangle();
		Triangle TriangleC=new Triangle();
		
		TriangleA.lengthsideA=10;
		TriangleA.lengthsideB=20;
		TriangleA.lengthsideC=15;
		
		TriangleB.lengthsideA=10;
		TriangleB.lengthsideB=10;
		TriangleB.lengthsideC=10;
		
		TriangleC.lengthsideA=10;
		TriangleC.lengthsideB=10;
		TriangleC.lengthsideC=15;
		
		System.out.println("Triangle 1: ");
		TriangleA.showDetails();
		TriangleA.checkTriangle();
		
		System.out.println("\nTriangle 2: ");
		TriangleB.showDetails();
		TriangleB.checkTriangle();
		
		System.out.println("\nTriangle 3: ");
		TriangleC.showDetails();
		TriangleC.checkTriangle();
	}
}