package cs520.hw3.part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		//Use the BufferedReader class to read the data.txt
		try {
			BufferedReader inputStream = new BufferedReader(new FileReader("data.txt"));
			
			String line;
			while ((line = inputStream.readLine()) !=null) {
			
				processInputData(line);
			}
		
		} 
		catch (FileNotFoundException e) {
			
			System.out.println("File not found or coulnd't be opened");
		}
		catch(IOException e) {
			System.out.println("Error reading data.txt");
		}
		

	}
	//processInputData method
	private static void processInputData(String x) {
		//Tokenize the string
		StringTokenizer tokenizer = new StringTokenizer(x,",");
		//Extract the name token
		String name = tokenizer.nextToken();
		//Create a Student object and assign to variable currentStudent
		Student currentStudent = new Student(name); 
		
		//Read each homework grade token, one at a time and use the set methods to set instance value
		String hw1 = tokenizer.nextToken();
		int hw1int = Integer.parseInt(hw1);
		currentStudent.setHomework1(hw1int);
		
		String hw2 = tokenizer.nextToken();
		int hw2int = Integer.parseInt(hw2);
		currentStudent.setHomework2(hw2int);

		String hw3 = tokenizer.nextToken();
		int hw3int = Integer.parseInt(hw3);
		currentStudent.setHomework3(hw3int);
		
		String hw4 = tokenizer.nextToken();
		int hw4int = Integer.parseInt(hw4);
		currentStudent.setHomework4(hw4int);
		
		String hw5 = tokenizer.nextToken();
		int hw5int = Integer.parseInt(hw5);
		currentStudent.setHomework5(hw5int);
		
		String hw6 = tokenizer.nextToken();
		int hw6int = Integer.parseInt(hw6);
		currentStudent.setHomework6(hw6int);
		
		//Display to console
		System.out.println(currentStudent);	
		
	} 

}
