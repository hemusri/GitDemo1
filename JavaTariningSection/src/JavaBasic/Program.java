package JavaBasic;

public class Program 
{

	public static void main(String[] args)
	{
		Program b2 = new Program();
		Program b1= new Program();
		System.out.println(b1);
		System.out.println(b2);
		b2=b1;
		
		System.out.println(b1);
		
		System.out.println(b2);
	}

}
