package cs520.hw3.part1;

import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.InputMismatchException;




public class StringTest {

	public static void main(String[] args) {
		String input = "";
		try {
		//Ask user for input
		 input = JOptionPane.showInputDialog(null,"Please enter data using the format CourseId,CourseName,Tuition");
		//Handle if cancel button hit
		if (input == null) {
			
			throw new CancelButtonException();	
		}
		}
		catch(CancelButtonException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		System.out.println(input);		
		
		
		
		//Trim the user's input and display to console
		input = input.trim();
		System.out.println(input);
		
		//Find index of first comma, extract courseId and get it's length
		int fComma = input.indexOf(",");
		try {
			if(fComma == -1) {
				throw new CourseIdException();
				}
			}
			catch(CourseIdException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}

		String courseId = input.substring(0, fComma);
		int fLength = courseId.length();
		
		//Display the index of first comma,courseName and it's length
		String fOutput = ("First Comma position:"+ fComma +", Course Id:"+ courseId +", Length:"+ fLength );
		System.out.println(fOutput);
		

		//Find index of second comma, extract courseName and get it's length
		int sComma = input.indexOf(",", fComma + 2);
		try {
		if(sComma == -1) {
			throw new CourseNameException();
			}
		}
		catch(CourseNameException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		String courseName = input.substring(fComma + 1, sComma);
		int sLength = courseName.length();
		
		//Display the index of first comma,courseName and it's length
		String sOutput = ("Second Comma position:"+ sComma +", Course Name:"+ courseName +", Length:"+ sLength );
		System.out.println(sOutput);
		
		//Extract Tuition and convert to integer
		String s = input.substring(sComma + 1);
		int tuition = 0;
		try{
			 tuition = Integer.parseInt(s);
		}
		catch(NumberFormatException e){ 
			System.out.println("Not entered a valid integer");
			System.exit(0);
		}
		
		//Display tuition and discounted tuition
		String tOutput = ("Regular Tuition $"+ tuition +", Discount Tuition $"+ applyDiscount(tuition));
		System.out.println(tOutput);
	}
	
	//Method to calculate discounted tuition
	private static int applyDiscount(int tuition) {
				return (int) (tuition * 0.75);		
			}
		}
		
	
	


