package JavaBasic;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		
		//++
		//--
		
		int i=1;
		int j=i++;  //post increment
		System.out.println(i);
		System.out.println(j);	
		
		int a=1;
		int b=++a;  //pre increment
		System.out.println(a);
		System.out.println(b);
		
		int n=2;
		int m=n--;  //post decerement
		System.out.println(n);
		System.out.println(m);	
		
		int o=2;
		int p=+--o;  //pre decrement
		System.out.println(o);
		System.out.println(p);

	}

}
