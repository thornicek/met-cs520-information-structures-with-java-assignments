package cs520.hw2.part2;

public class Course {
		
	private String courseName;
	private int costPerCredit;
	private int numberOfCredits;
	
	public Course(String courseName, int costPerCredits, int numberOfCredits)
	{
		this.courseName = courseName;
		this.costPerCredit = costPerCredits;
		this.numberOfCredits = numberOfCredits;
		
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public int getCostPerCredit()
	{
		return costPerCredit;
	}
	
	public int getNumberOfCredits()
	{
		return numberOfCredits;
	}
	
	public void setCourseName(String x)
	{
		courseName= x;
	}
	
	public void setCostPerCredit(int value)
	{
		costPerCredit= value;
	}
	
	public void setNumberOfCredits(int value) 
	{
		numberOfCredits= value;
	}
	
	public int getTotalTuition()
	{
		int cost;
		cost = costPerCredit * numberOfCredits;
		return cost;
	}
	
	public String toString()
	{
		return String.format("Course: "+ courseName + " @ $ " + getTotalTuition());
	}
}
