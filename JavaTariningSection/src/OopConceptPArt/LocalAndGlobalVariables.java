package OopConceptPArt;

public class LocalAndGlobalVariables {
	
	//global variables-------class variables
			String name ="Tam";
			int age=25;
			
	public static void main(String[] args) {

	int i =10;///local variable for main method
	System.out.println(i);
	
	//System.out.println(name)    because this is a global variables that resion not access create the object
	//create the class obj create cheyali next call cheyali obejct nee
	
	LocalAndGlobalVariables obj = new LocalAndGlobalVariables();
	System.out.println(obj.name);
	System.out.println(obj.age);
	
	//(public static void )anni vasthya static key word kabatee ala call cheyali annta direct ga ...//sum();
	//void annni vasthya obj.sum();call cheyali
	
	obj.sum();
	
	}
	
	public  void sum() {
	
		int i=15;//local variable for sum method
		int j=20;
		//int age=25;      //this using because this is global variable
		System.out.println(i);
		System.out.println(j);
	}

}
