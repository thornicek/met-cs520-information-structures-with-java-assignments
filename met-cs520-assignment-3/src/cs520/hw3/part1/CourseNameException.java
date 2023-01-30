package cs520.hw3.part1;

public class CourseNameException extends Exception {
	public CourseNameException(){
		super("You have only entered the CourseId and CourseName");
	}
}
