package HW4_THornicek;

import java.io.*;
import java.util.Arrays; 
   

public class SearchClass {

	public static void main(String[] args) throws Exception {
		//Declare an empty string line
		String line = ""; 
		//Working directory
		String dir = System.getProperty("user.dir");
		
		try   
		{  
		//BufferedReader instance to read file
		BufferedReader br = new BufferedReader(new FileReader(dir + "/Data.csv"));  
		
		//While file has next line do stuff with the line
		while ((line = br.readLine()) != null)     
		{  
		//Split line into array of strings 	
		String[] data = line.split(",");    
		
		//iterate over array of strings
			for(int i = 0; i < data.length; i++) {
			//Search for keyword robots and print out to Console
				if(data[i].contains("robots")) {
				System.out.println(Arrays.toString(data));
						}
					}
			}
		}  
		//Catch exception if opening file goes wrong
		catch (IOException e)   
		{  
		//Print error message to screen
		e.printStackTrace();  
		}  
	
	}
}
