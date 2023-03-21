package OopConceptPArt;

public class Car {
            //gobal variables
              int mod ;
              int wheel;
              public static void main(String[] args) {
            	  
            	  //new car()......this is object of car class
            	  //new keyword is used to create the object
            	  //a,b,c,.....reference variables
            	  
            	  Car a = new Car();
            	  Car b = new Car();
            	  Car c = new Car();
            	  
            	  a.mod=2015;
            	  a.wheel=4;
            	  
            	  b.mod=2014;
            	  b.wheel=3;
            	  
            	  c.mod=2017;
            	  c.wheel=5;
            	  
            	  System.out.println("before Assigning the references");
            	  
            	  System.out.println(a.mod);
            	  System.out.println(a.wheel);
            	  
            	  System.out.println(b.mod);
            	  System.out.println(b.wheel);
            	  
            	  System.out.println(c.mod);
            	  System.out.println(c.wheel);
            	  
            	  System.out.println("After Shifiting the references");
            	  
            	  a=b;
            	  b=c;
            	  c=a;
            	  
            	  a.mod=10;
            	  System.out.println(a.mod);//10
            	  c.mod=20;
            	  System.out.println(a.mod);//20
            	  System.out.println(c.mod);//20	
            	  
	}

}
