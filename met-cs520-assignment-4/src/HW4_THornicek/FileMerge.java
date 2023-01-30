package HW4_THornicek;

import java.io.*;
public class FileMerge {

	public static void main(String[] args) throws IOException {
		
		//empty Data.csv file
		/*
		PrintWriter writer = new PrintWriter("/Users/tomas/Desktop/JavaProjects/Homework4_Hornicek2/Data.csv");

		writer.print("");

		writer.close();
		  */
		//Working directory
		String dir = System.getProperty("user.dir");
		
		
		//Assign, empty csv file, Data.csv to PrintWriter
        PrintWriter pw = new PrintWriter(dir + "/Data.csv");
          
        //Open reader for first csv file
        BufferedReader br = new BufferedReader(new FileReader(dir + "/Data1.csv"));
        
        //Read first line of document and assign to string line
        String line = br.readLine();
          
       //As long as the document has data, keep adding the data to printwriter
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        
        
       br = new BufferedReader(new FileReader(dir + "/Data2.csv"));
          
       line = br.readLine();
          
       
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
         
        br = new BufferedReader(new FileReader(dir + "/Data3.csv"));
          
        line = br.readLine();
          
  
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        br = new BufferedReader(new FileReader(dir + "/Data4.csv"));
        
        line = br.readLine();
          
       
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        br = new BufferedReader(new FileReader(dir + "/Data5.csv"));
        
        line = br.readLine();
          
     
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        br = new BufferedReader(new FileReader(dir + "/Data6.csv"));
        
        line = br.readLine();
          
   
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
          
        
        
        //Close BufferedReader  
        br.close();
        
        //Close PrintWriter
        pw.close();
     
    }
	}


