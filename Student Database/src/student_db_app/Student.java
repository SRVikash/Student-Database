package student_db_app;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int costofCourse = 42000;
	private static int id = 1000;
	
	//Constructor to enter student's name and year
	public Student()
	{
		Scanner in = new Scanner (System.in);
		
		System.out.println("\nEnter the first name:");
		this.firstName = in.next();

		System.out.println("Enter the last name:");
		this.lastName = in.next();
		
		System.out.print("\n 1. First year \n 2. Second year \n 3. Third year \n 4. Fourth year \n Enter the year: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		
		
		
	}
	
	//Generate Student ID
	private void setStudentID()
	{
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	//Enroll course
	public void enroll() {
		do{
			System.out.print("Enter course to enroll (hit Q to quit): ");
			Scanner in = new Scanner (System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance += costofCourse;
				}
			else {break;}
			 }while(1 != 0);
		}
	
	//View Balance
	public void viewBalance()
	{
		System.out.println("Your Balance is: "+ tuitionBalance + " " + "RS");
	}
	
	//make payment
	public void payTuition(int payment)
	{
		viewBalance();
		System.out.print("Enter your payment: ");
		Scanner  in = new Scanner(System.in);
		payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thanks for your payment of "+payment+" "+"RS");
		viewBalance();
	}
	
	//Show information
	public String showInfo()
	{
		return "\n Student ID: " + studentID +
				"\n Name: " + firstName + " " + lastName +
				"\n Year: " + gradeYear +
				"\n Courses enrolled : " + courses +
				"\n Tuition Balance : " + tuitionBalance;
	}
	
	
	
	

}
