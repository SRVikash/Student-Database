package student_db_app;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		System.out.print("Enter number of students to be enrolled :");
		Scanner in = new Scanner(System.in); 
		int numOfStudents = in.nextInt();
		
		Student[] students = new Student[numOfStudents];
		
		for(int i=0;i<numOfStudents;i++)
		{
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition(50000);
		}
		
		System.out.println("\n Info of entered students");
		
		for(int i=0;i<numOfStudents;i++) {
			System.out.println(students[i].showInfo());
		}
	}

}
