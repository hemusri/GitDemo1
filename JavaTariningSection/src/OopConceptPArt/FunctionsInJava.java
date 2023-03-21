package OopConceptPArt;

public class FunctionsInJava {
 
	//main method ....>Starting point execution
	
	public static void main(String[] args) {
 
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created,obj is the reference variable ,referring to the this objects
		//after the creating the object,the copy of the all static methods will be given this objects
		
		obj.test();	
		obj.pqr();
		int l=obj.pqr();
		System.out.println(l);
		
		String s =obj.qa();
		System.out.println(s);
		
		int div = obj.division(30, 10);
		System.out.println(div);
		
		//main method is void--->never return a value
		
	}
		//non static methods
	    //void......does not retun in any value
	   //return type  is =void
	
		public void test() {   //no input and no out put
			System.out.println("test method");
		}
		  
		//return type is =int
		public int pqr() {    //no input but some out put
			System.out.println("pqr methods");
			int a=10;
			int b=20;
			int c=a+b;
			
			return c;
	}
		//return type is String
		public String qa() {   //no input some out put
			System.out.println("qa method");
			String s="selenium";
			
			return s;
		}

		//return type is--->int
		//x,y is input parameters/arguments
		
		public int division(int x, int y) {
			System.out.println("division method");
			int d = x/y;
			
			return d;
		}
}
