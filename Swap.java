package codoid;

public class Swap {
  
	public static void main(String[] args) {
		int a= 10;
	 System.out.println("the value of a before swap"+a);
		int b=20;
		System.out.println("the value of  b before " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the value of a ="+ a);
		System.out.println("the value of b =" + b);
		
		
		
	}
	
}
