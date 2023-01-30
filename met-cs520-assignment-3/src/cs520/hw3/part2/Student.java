package cs520.hw3.part2;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Student {
			//declare instance variables
			private String name;
			private int homework1;
			private int homework2;
			private int homework3;
			private int homework4;
			private int homework5;
			private int homework6;
			
			//Create a single constructor with name as its argument
			public Student(String name) {
				this.name =  name;
			}
			
			//Public set methods for homeworks
			public void setHomework1(int value) {
				homework1 = value;
			}
			public void setHomework2(int value) {
				homework2 = value;
			}
			public void setHomework3(int value) {
				homework3 = value;
			}
			public void setHomework4(int value) {
				homework4 = value;
			}
			public void setHomework5(int value) {
				homework5 = value;
			}
			public void setHomework6(int value) {
				homework6 = value;
			}
			
			//computeAverage method
			public Double computeAverage() {
				Double count = (double) 6;
				Double average =  ((homework1 + homework2 + homework3 + homework4 + homework5 + homework6)/count); 
				average = (double) Math.round(average*100.0)/100.0;
				return average;
				
			}
			//Override toString method
			public String toString()
			{
				return String.format(name +"'s average grade is "+ computeAverage());
			}
			
}			
