/*
 Create an interface called "Person" with a method called "speak". Create two classes  called "Student" and "Teacher"
  that implement  the Person interface and implement the "speak" method. Create objects of both the Student and  Teacher classes
   and call their respective "speak"  methods.
 */

package Thursday_Lab_3rd_aug;

public class Operation_Q2 {

//Student and Teacher speak method call in this class	

	public static void main(String args[]) {

		// student class object
		Student_Q2 obj = new Student_Q2();
		obj.speak();

		// teacher class object
		Teacher_Q2 obj1 = new Teacher_Q2();
		obj1.speak();
	}

}
