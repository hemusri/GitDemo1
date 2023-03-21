package OopConceptPart2;

public class HSBCBank implements USBank,BrazilBank{//we achieving multiple inheritance
	//is-a her relationship (inheritance to class relation ship)
	
	//if a class implementing any interface,then its mandatory to define/override all the methods of interface 
	//overriding for USBank
	public void credit(){
		System.out.println("hsbc------credit");
	}

	public void debit() {
		System.out.println("hsbc------debit");
	}
	public void transforMoney() {
		System.out.println("hsbc----transforMoney");
	}
	
	//seperate methods for HSBCBank class
	public void educationLoan() {
		System.out.println("hsbc-----educationLoan");
	}
	public void carLoan() {
		System.out.println("hsbc-------carLoan");
	}
	
	//brazilbank method  ,overriding for Brazilbank methods
	public void mutualFund() {
		System.out.println("hsbc------mutalFund");
	}
}
