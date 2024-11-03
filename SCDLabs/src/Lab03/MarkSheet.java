package Lab03;
import java.util.Scanner;

public class MarkSheet {
	String 	st_name;
	int total_marks = 100;
	int obt_marks;
	float percentage;
	String grade;
	float gpa;
	
	public MarkSheet(String st_name, int obt_marks) {
        this.st_name = st_name;
        this.obt_marks = obt_marks;
    }
	
	   public static MarkSheet inputFields(){
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter Student Name: ");
        String st_name = input.nextLine(); 
        
        System.out.println();
        
        System.out.print("Enter Obtained Marks: ");
        int obt_marks = input.nextInt();
        
        return new MarkSheet(st_name, obt_marks);
        
	}
	   public String gpaAndGradeCalculation() {
		   if(obt_marks >= 86) {
			   grade = "A";
			   gpa = 4.0f;
		   }
		   else if(obt_marks >= 80) {
			   grade = "B";
			   gpa = 3.66f;
		   }
		   else if(obt_marks >= 75) {
			   grade = "C";
			   gpa = 3.0f;
		   }
		   else if(obt_marks >= 60) {
			   grade = "D";
			   gpa = 2.66f;
		   }
		   else {
			  return "Fail";
		   }
		   return "Grade: " + grade + "\n" + "GPA: " + gpa;
	   }
	   
	   public float percentageCalculation() {
		   percentage = (((float)obt_marks/total_marks)*100);
		   return percentage;
		   
	   }
	   
	   public void displayResult() {
		   System.out.println("Student Name: " + st_name);
		   System.out.println("Obtained Marks: " + obt_marks);
		   System.out.println("Percentage: " + percentageCalculation() + "%");
		   System.out.println(gpaAndGradeCalculation());
	   }

}
