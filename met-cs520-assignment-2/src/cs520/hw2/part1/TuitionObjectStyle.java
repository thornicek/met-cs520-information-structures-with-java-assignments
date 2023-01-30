package cs520.hw2.part1;

import javax.swing.JOptionPane;

public class TuitionObjectStyle {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		Course course2 = new Course();
		
		String courseOneName = JOptionPane.showInputDialog("What is the name of the course you are taking?");
		course1.setCourseName(courseOneName);
		
		String courseOneNumber = JOptionPane.showInputDialog("How many credits is this course?");
		int courseOneNumberOfCredits = Integer.parseInt(courseOneNumber);
		course1.setNumberofCredits(courseOneNumberOfCredits);
		
		String courseOneCost = JOptionPane.showInputDialog("What is the cost per credit of this course?");
		int courseOneCostOfCredits = Integer.parseInt(courseOneCost);
		course1.setCostPerCredit(courseOneCostOfCredits);
		
		course1.printTuitionDetails();

		String courseTwoName = JOptionPane.showInputDialog("What is the name of the course you are taking?");
		course2.setCourseName(courseTwoName);
		
		String courseTwoNumber = JOptionPane.showInputDialog("How many credits is this course?");
		int courseTwoNumberOfCredits = Integer.parseInt(courseTwoNumber);
		course2.setNumberofCredits(courseTwoNumberOfCredits);
		
		String courseTwoCost = JOptionPane.showInputDialog("What is the cost per credit of this course?");
		int courseTwoCostOfCredits = Integer.parseInt(courseTwoCost);
		course2.setCostPerCredit(courseTwoCostOfCredits);
		
		course2.printTuitionDetails();

	}

}
