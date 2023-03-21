package OopConceptPart2;

public class TestBank {

	public static void main(String[] args) {

		System.out.println(USBank.min_bal);
		//USBank.min_bal=200;    we cannot change becase some interface same  rules is there
		

		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.carLoan();
		hs.educationLoan();
		hs.transforMoney();

		//dynamic polymarphism
		//child class object can be referred by parent interface reference var
		USBank b =new HSBCBank();
		b.credit();
		b.transforMoney();
		b.debit();
		///car and eduction loan are over retion method that resion not showing 
	}

}
