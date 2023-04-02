package codoid;

class Encap {
	 private int value =10;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	} 
}
public class Enacapsulation{
	
	public static void main(String[] args) {
        
		Encap e =new Encap();
		int a = e.getValue();
		
		System.out.println(a);
		
		e.setValue(30);
       
		int b = e.getValue();
		System.out.println(b);
				
	}
	
}

	
	

