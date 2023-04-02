package codoid;

import java.util.Scanner;

public class Palindrom {
public static void main(String[] args) {
	

	Scanner user= new Scanner(System.in);
		
    System.out.println("Enter the String value  ");
	 
	 String  s= user.nextLine();
	
	//Store the reverse Srting value 
	  String rev="";
	 // take the value of loop statement 
	  for(int i=s.length()-1;i>=0; i--) 
	  {
		  rev = rev + s.charAt(i);
		 
		 
	  }
	 if (s==rev)
	 {
		 System.out.println("its a palindrom");
		 
	 }
	 else {
		System.out.println("its not a palindrom");
	}
	  
	  
	  
}

}