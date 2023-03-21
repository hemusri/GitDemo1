package OopConceptPart2;

public class TestTheCar {

	public static void main(String[] args) {

		//static polymorphism------compile time polymorphism
		BMW b= new BMW();
		b.start();
		b.stop();
		b.refule();
		b.theftSafety();
		b.engine();
		
		System.out.println("*********");
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refule();
		
		System.out.println("*******");
		
		//top casting
		Car c1 = new BMW();/*chiled class obj can be refered by parent class reference variable
		-----dynamic polymorphism---run-time polymorphism*/
		
	    c1.start();
	    c1.stop();
	    c1.refule();
	    
	    //down casting   is not allowing but same time is working but exception is comeing
	    
    //BMW b1= (BMW)new Car();    //Class casting exception    //************
	    
	    
	    
	}

}
