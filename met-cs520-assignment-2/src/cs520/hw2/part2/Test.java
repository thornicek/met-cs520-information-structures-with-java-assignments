package cs520.hw2.part2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course currentCourse = null;
		
		 currentCourse = new Course("CS520", 4, 4);
		 System.out.println(currentCourse);
		 
		 currentCourse=(OnlineCourse) new OnlineCourse("CS521", 6 , 5, 5);
	     System.out.println(currentCourse);
	}

}
