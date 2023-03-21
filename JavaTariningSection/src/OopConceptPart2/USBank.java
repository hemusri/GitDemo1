package OopConceptPart2;

public interface USBank {
	
	int min_bal =100;
	
	public void credit();
	
	public void debit();
	
	public void transforMoney();
	
	//only method declaration
	//no method body --only method prototype
	//in interface ,we can declara the variables ,var are by defult static in nature
	//var value will be not changed  ,its final/constant  in nature
	//no static method in interface
	//no main method in interface
	//we can not create the object in interface
	//interface is abstract in nature

}
