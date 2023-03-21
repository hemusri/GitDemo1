package OopConceptPart2;

public class BMW extends Car{ //has-a her relationship(class to class retion ship)
  
	/*when the same method is present in parent class as well as child 
	with the same name and same number of argments, is called Method---overriding*/
	
	public void start() {//overriaden method 
		System.out.println("BMW-----start");
	}
	public void theftSafety() {
		System.out.println("BMW------theftSafety");
	}
}
