public class Rectangle{
	static float width;
	static float length;
	
	Rectangle(){}
	
	static void PerimeterOfRectangle(){
		float perimeter=(width+length)*2;
		System.out.println("The perimeter of the rectangle : "+perimeter+" cm");
	}
	
	 static void AreaOfRectangle(){
		float area= width*length;
		System.out.println("The area of the rectangle : "+area+" cm^2");
	}

}