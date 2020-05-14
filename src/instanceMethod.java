// creating and learning the use of instance method
/*  
 * Create a void method name_of_student, this method takes name and prints ("My name is :" name )
 * create a void method grade, this mehtod takes double value and prints ("your grade is :, grade)
 */
class Student {	

	public void name_of_student(String name) {
		//System.out.println("Student name is :"+ name);
		System.out.println(String.format("Student name is : %s", name));
	}
	
	public void grade(double grade) {
		//System.out.println("Student grade is" + grade);
		System.out.println(String.format("Student grade is : %f", grade));
	}
	
	public void student_level(int level) {
		System.out.println(String.format("You are in level %d", level));
	}
	
	
	// lets add a static method to see how this would work here
	public static void classGroup(String group) {
		System.out.println(String.format("Student class group is: %s", group));
	}
	
}
public class instanceMethod {
	
	public static void main(String args[]) {
		// create student1 object
		// class name  -  Object name =  new Classname
		Student student1 = new Student();
		student1.name_of_student("Riz");
		student1.grade(4.25);
		student1.student_level(9);			
		student1.classGroup("Lime");
		
		Student student2 = new Student();
		student2.name_of_student("Eeshal");
		student2.grade(3.65);
		student2.student_level(7);
		student2.classGroup("Apple");
	}
		
}
