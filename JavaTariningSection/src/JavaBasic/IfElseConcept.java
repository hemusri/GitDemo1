package JavaBasic;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;

		if(b>a) {
			System.out.println("b is greater than a");
		}else {
			System.out.println("a is greater than b");
		}
		//comperison operator
		//< > ,<= ,== ,!=;
		//== (is a compression operator),,,=(is a Asian operator)

		int x= 40;
		int y=50;

		if(x==y) {
			System.out.println("x and y are equal ");
		}else {
			System.out.println("x and y are not equal");
		}

		//write the logic to find out the highest number
		int a1=100;
		int b1=200;
		int c1=300;

		//nested loop

		if(a1>b1 & a1>c1) {//false & true =false
			System.out.println("a1 is greators");
		}
		else if (b1>c1) {
			System.out.println("b1 is greators");
		}
		else {
			System.out.println("c1 is greators");
		}
		
		int d1=300;
		int e1=200;
		int f1=100;

		//nested loop

		if(d1>e1 & d1>f1) {//false & true =false
			System.out.println("d1 is greators");
		}
		else if (f1>c1) {
			System.out.println("e1 is greators");
		}
		else {
			System.out.println("f1 is greators");
	}
}
}