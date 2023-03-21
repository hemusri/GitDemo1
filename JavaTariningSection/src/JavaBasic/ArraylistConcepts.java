package JavaBasic;

import java.util.ArrayList;

public class ArraylistConcepts {

	public static void main(String[] args) {

		ArrayList ar= new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		
		ar.add("tom");//5
		ar.add("hello");//6
		ar.add(12.33);//7
		ar.add('m');//8
		ar.add(600);//9
		
		System.out.println(ar.size());
		
		ar.remove(9);
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		//to print the all values of array list ; for loop
		
		for (int i=0; i<=ar.size(); i++) {
			//System.out.println(i);
			System.out.println(ar.get(i));
			
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("hi");
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("hi");
		//ar2.add(100);
	}

}
