package JavaBasic;

public class StringConcatenation {

	public static void main(String[] args) {

		//+ concatenation operator;
		int a =100;
		int b =200;

		String x="hello";
		String y="world";

		double c =12.33;
		double d =13.55;

		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+y+b);
		System.out.println(a+b+b+x+y+a+b+y+a+b+x);
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		System.out.println("hello world");
		System.out.println(a);
		System.out.println("a");
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is"+b);
		System.out.println("addition of a and b is:"+(a+b));



	}

}
