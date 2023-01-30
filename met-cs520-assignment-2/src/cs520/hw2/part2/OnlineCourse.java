package cs520.hw2.part2;

class OnlineCourse extends Course
{ 
	private int technologyFee;
	
	public OnlineCourse(String courseName, int costPerCredits, int numberOfCredits, int technologyFee) {
		super(courseName, costPerCredits, numberOfCredits);
		this.technologyFee = technologyFee;
		 
	}
	
	public int getTechnologyFee() {
		return technologyFee;
	}
	
	public void setTechnologyFee(int technologyFee) {
		this.technologyFee = technologyFee;
	}
	
	public int getTotalTuition()
	{
		int cost = super.getTotalTuition() + (getNumberOfCredits() * technologyFee);
		return cost;
	}
	
	public String toString()
	{
		return String.format("Online Course: "+ super.getCourseName() + " @ $ " + getTotalTuition());
	}
	
	
	
	}

	
	



