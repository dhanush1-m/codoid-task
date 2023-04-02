package codoid;

//method over ridding 

class iphone
{
	void camera()
	{
		System.out.println("one camera");
	}
}
class iphone1 extends iphone
{
	void camera()
	{
		System.out.println("one camera+two cameras");
	}
}
public class Mor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // iphone1 i=new iphone1();
       iphone1 b=new iphone1();
       b.camera();
       
	}

}

