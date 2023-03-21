package OopConceptPArt;

public class WapperClassMethods {

	public static void main(String[] args) {
 
		String x ="100";
		System.out.println(x+20);
		
		//data conversion:String to int
		int i =Integer.parseInt(x);
		System.out.println(i+20);
		
		//integer,double,boolean
		
		//String to double conversion
		String y ="12.33";
		double d=Double.parseDouble(y);
		System.out.println(d+y);
		
		//string to boolean
		String k = "true";
		boolean b =Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to string conversion
		int j =200;
		System.out.println(j+20);
		
		String s=String.valueOf(j);//200
		System.out.println(s+20);
		
		//String u="100A";      //number and albetes are there
		//Integer.parseInt(u);     //number format exception ---->for input string "100A"
				
	}

}
