package cs520.hw2.part1;

import javax.swing.JOptionPane; 

public class TuitionProceduralStyle {

	public static void main(String[] args) {
		// Assign Variables
		String First_Course, First_Credits, First_Cost, First_Output ;
		String Second_Course, Second_Credits, Second_Cost, Second_Output ;
		
		//First Course User entries
		First_Course = JOptionPane.showInputDialog("What is the name of the first course you are taking?");
		First_Credits = JOptionPane.showInputDialog("How many credits is this course?");
		First_Cost = JOptionPane.showInputDialog("What is the cost per credit of this course?");
		
		//Second Course User entries
		Second_Course = JOptionPane.showInputDialog("What is the name of the second course you are taking?");
		Second_Credits = JOptionPane.showInputDialog("How many credits is this course?");
		Second_Cost = JOptionPane.showInputDialog("What is the cost per credit of this course?");
		
		//First Course conversion to integer
		int FCost = Integer.parseInt(First_Cost);
		int FCred = Integer.parseInt(First_Credits);
		
		//First Course total cost calculation
		int First_TotalCost = FCost * FCred;
		
		//First Course total cost calculation output
		First_Output = "The tuition of "+ First_Course + " is: " + First_TotalCost ; 
		JOptionPane.showMessageDialog(null,First_Output);
		
		//Second Course conversion to integer
		int SCost = Integer.parseInt(Second_Cost);
		int SCred = Integer.parseInt(Second_Credits);
		
		//Second Course total cost calculation
		int Second_TotalCost = SCost * SCred;
		
		////Second Course total cost calculation output
		Second_Output = "The tuition of "+ Second_Course + " is: " + Second_TotalCost ; 
		JOptionPane.showMessageDialog(null,Second_Output);
		
		//If-else statement to compare Two courses
		if(First_TotalCost > Second_TotalCost) {
			JOptionPane.showMessageDialog(null,"The cost of " + First_Course +" is higher than the cost of "+Second_Course);
		}
		else if(First_TotalCost < Second_TotalCost) {
			JOptionPane.showMessageDialog(null,"The cost of " + Second_Course +" is higher than the cost of "+First_Course);
		}
		else if(First_TotalCost == Second_TotalCost) {
			JOptionPane.showMessageDialog(null,"The cost of " + Second_Course +" is equal to the cost of "+First_Course);
		}
	
	
	}

}
