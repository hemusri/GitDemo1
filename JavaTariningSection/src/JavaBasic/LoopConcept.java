	package JavaBasic;

public class LoopConcept {

	public static void main(String[] args) {

		//while loop
		//dis-advantage of while loop;it will generate infinity loop if you not give increment and decrement part
		

			/*	int i =0;//initialization
				while (i<=10) {//conditional
					System.out.println(i);
					i=i+1;//increment part/decremental part*/
				//}
				int i=1;                 //initialization
				while (i<=10) {          //condition
					System.out.println(i);
					//i=i+1;
					i++;                 //increment or decrement
		       }
				System.out.println("********");
		
		//2.for loop;
		
		//j++means j=j+1 //print 1 to 10 values
	
		for(int j=1;j<=10;j++) {         //Initialization,conduction,increment,decrement
			System.out.println(j);
		}
		//k-- means  k=k-1  // print 10 to  1 values
		for(int k=10;k>=1;k--) {
			System.out.println(k);
		}
		
	}
}
