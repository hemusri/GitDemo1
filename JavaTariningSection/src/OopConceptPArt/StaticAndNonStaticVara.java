package OopConceptPArt;

public class StaticAndNonStaticVara {
	
	//global vara; the scope of global var will be avaliable accross all the function
	
	String name="Tam";//non static global variables
	static int age =25;//static global variables,static key word untya static variables
	
	
	public static void main(String[] args) {
		
		//how to call a static method and variables
		
		//1.direct calling;
		sum();
		//2.calling by a calls name
		StaticAndNonStaticVara.sum();
		
		//how to call variables
		System.out.println(age);
		System.out.println(StaticAndNonStaticVara.age);
		
		//how to call non static methods and variables
		StaticAndNonStaticVara obj = new StaticAndNonStaticVara();
		obj.sendmail();
		System.out.println(obj.name);
		
		//can i access static method by using object reference ? yes
		obj.sum();//warning will be given
	}
	
	public void sendmail() {//	non static method
		System.out.println("send the mail method");
		
	}
	
	public static void sum() {//static method
		System.out.println("sum method");
		
	}
}
