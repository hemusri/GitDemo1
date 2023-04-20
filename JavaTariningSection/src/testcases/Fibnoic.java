package testcases;

public class Fibnoic {
	
	
	public static void main(String[] args)
	{
		//0 1 1 2 3 5 8 13
		//0+1=1  ,1+1=2,
		
		int a=0,b=1,c;
		System.out.println(a+" "+b);
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
				
				
			}
		}
		
		
		
	}

}
