package codoid;

// method over loding 

class amanzon
{
	static void buy(String b)
	{
		System.out.println(b);
	}
static void buy(String c,int a)
{
	System.out.println(c+""+a);
}
static void buy(String d,String d1)
{
	System.out.println(d+" "+d1);
	
}

}

public class Mol {

	public static void main(String[] args) {
		// method over loding
          amanzon.buy("book");
          amanzon.buy("book",12);
          amanzon.buy("book","cloth");
	}

}
