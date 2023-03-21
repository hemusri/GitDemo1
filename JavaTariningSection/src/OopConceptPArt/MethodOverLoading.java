package OopConceptPArt;

public class MethodOverLoading {

	public static void main(String[] args) {

		MethodOverLoading obj = new MethodOverLoading();

		obj.sum();
		obj.sum(10);
		obj.sum(10, 30);
	}
	public static void main(int p) {

	}
	public static void main(int q,int h) {

		//we can over load main method also
		//you can create method inside the method
		//duplicate method----i.e same method name with same  number of arugument are not allowed with in same class
		/*method overloading--->when method name is same with different 
		argument(DATE TYPES) or input parameters with in same class*/
	}

	public void sum() {//0 inputs param
		System.out.println("sum method-----zero para");

	}

	public void sum(double i) {//1 input para
		System.out.println("sum method----1input para");
		System.out.println(i);

	}

	public void sum(int i) {//1 input para
		System.out.println("sum method----1input para");
		System.out.println(i);
	}

	public void sum(int k,int l) {//2input para
		System.out.println("sum method----2input para");
		System.out.println(k+l);
	}
}
