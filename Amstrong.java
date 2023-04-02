package codoid;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		
		
		Scanner num = new Scanner(System.in);
		System.out.println("enter the int value");
		
		int value = num.nextInt();
		int sum =0;
		int copy =value ;
		while (value!=0)
		{
			 int  rem  = value%10;
			 
		  sum = sum +(rem*rem*rem);
				  
		 value = value/10;		  
		
	}
		System.out.println(sum);
		
	
		if (sum==copy) {
			System.out.println("its not a amstrong number");
			
		}
		else {
			System.out.println("its not a amstrong number");
		}
		
	}
	
	
	
}
