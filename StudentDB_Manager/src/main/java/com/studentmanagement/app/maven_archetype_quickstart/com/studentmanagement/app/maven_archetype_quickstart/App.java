package com.studentmanagement.app.maven_archetype_quickstart.com.studentmanagement.app.maven_archetype_quickstart;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.InputStreamReader;

public class App {
  public static void main(String[] args) throws IOException {
    System.out.println("Welcome to Student Management App!!");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    while(true) {
    	System.out.println("Press 1 to ADD Student");
    	System.out.println("Press 2 to DELETE Student");
    	System.out.println("Press 3 to DISPLAY Student");
    	System.out.println("Press 4 to EXIT App");
    	int c=Integer.parseInt(br.readLine());
    	
    	if (c==1)
    	{
    		//ADD Student...
    		
    		System.out.println("Enter User Name :");
    		String name=br.readLine();
    		
    		System.out.println("Enter User Phone Number :");
    		String phone=br.readLine();
    		
    		System.out.println("Enter User City :");
    		String city=br.readLine();
    		
    		//Create Student Object to Store Student
    		Student st=new Student(name,phone,city);
    		boolean answer = StudentDao.insertStudentToDB(st);
    		if(answer) {
    			System.out.println("Student is added Successfully...");
    		} else {
    			System.out.println("Something went wrong. Please Try again...");
    		}
    	}
    	else if (c==2)
    	{
    		//DELETE Student...
    		System.out.println("Enter student id to delete: ");
    		int userId = Integer.parseInt(br.readLine());
    		boolean f = StudentDao.deleteStudent(userId);
    		if(f) {
    			System.out.println("Student Deleted from list successfully...");
    		} else {
    			System.out.println("Something went wrong. Please Try again...");
    		}
    	}
    	else if (c==3)
    	{
    		//DISPLAY Student...
    		StudentDao.showAllStudent();
    	}
    	else if (c==4)
    	{
    		//EXIT App...
    		break;
    	}
    	else
    	{
    		
    	}
    	
    }
    System.out.println("Thank You for using the application...");
    System.out.println("See ya..Bye Bye");
  }
}
