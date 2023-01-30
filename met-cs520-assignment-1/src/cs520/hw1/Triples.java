package cs520.hw1;


public class Triples {

	public static void main(String[] args) {
		
		System.out.println("Count   x   y   z");
		int triplesCounter= 0;
		
		int x, y, z;
		
		for(x = 1; x <= 100;  x++)
		{
			for(y = 1; y <= 100; y++) {
				int sum = (x*x) + (y*y);
				double root = Math.sqrt(sum);
				 z = (int)root;
				 
				 if((z*z)== sum) {
					 if(x>y) {
					 triplesCounter++;	 
					 System.out.println(triplesCounter + "      "+x+"  "+"  "+ y+"  "+ z);
					 }
				 }
				
				
			}
				
		}
		

	}

}
