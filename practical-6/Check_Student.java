public class Check_Student{
	
	public static void main(String args[]){
		Student StudentA = new Student();
		Student StudentB = new Student();
		
		StudentA.student_name = "Piyumi Withana";
		StudentA.reg_no = "R202210";
		StudentA.age=21;
		StudentA.address="No:21,Western Park, Horana";
		StudentA.contact_no= "0774934323";
		
		StudentB.student_name = "Harsha Silva";
		StudentB.reg_no = "R202211";
		StudentB.age=23;
		StudentB.address="No:73,Kubuka East, Gonapola";
		StudentB.contact_no= "0715687643";
		
		StudentA.showStudentDetails();
		StudentB.showStudentDetails();
	}
}