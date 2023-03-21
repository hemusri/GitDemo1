package collectionSessionsListconcepet;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepets {

	public static<E> void main(String[] args) {

		int[]a=new int[3]; //static array -----size is fixed
		
		//dynamic array-----array list
		//1. it can cantain duplicate value /element  ex;ar.add(50);  ,ar.add(50);  agine will be added
		//2.maintance insertion order
		//3.sychronized  this is muliti thried concept other conncet comper cheyasathya edhi chala slow ga untyadi
		//allow the rendom access to fetch the elment because it stores the value on the basic of index value
		
		ArrayList ar=new ArrayList();
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println(ar.size());  //size of the array list
		
		ar.add(40);//3
		ar.add(50);//4
		ar.add(12.33);
		ar.add('a');
		ar.add("test");
		ar.add(true);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));  //to get the value from on index
		
		//to print the all the values of array list ;
		//1.for loop
		//2.using iterator
		
		for (int  i=0; i<=ar.size(); i++) {
			//System.out.println(i);
			System.out.println(ar.get(i));
			
			//non generic and generic
			
			ArrayList<Integer>ar1 = new ArrayList<Integer>();
			ar1.add(100);
			//ar1.add("Hello");
			
			ArrayList<String>ar2 = new ArrayList<String>();
			//ar2.add(100);
			ar2.add("Hello");
			
			ArrayList<E>ar3 = new ArrayList<E>();//perticilare value u dont know that time will be useing to <E> Kind off Symbols
			
			//Employee class Object
			
			Employee e1= new Employee("naveen",27,"QA");
			Employee e2= new Employee("balaji",28,"Test");
			Employee e3= new Employee("malli",29,"Dev");
			
			//create the arrayList:
			
			ArrayList<Employee>ar4=new ArrayList<Employee>();
			ar4.add(e1);
			ar4.add(e2);
			ar4.add(e3);
			
			//iterator to traverse the values
			Iterator<Employee> it =ar4.iterator();
			while (it.hasNext()) {
				Employee emp=it.next();
				System.out.println(emp.name);
				System.out.println(emp.age);
				System.out.println(emp.dept);
				
			}
			
			System.out.println("**********");
			
			//add all()
			ArrayList<String> ar5=new ArrayList<String>();
			ar5.add("test");
			ar5.add("selenium");
			ar5.add("QTP");
			
			ArrayList<String> ar6=new ArrayList<String>();
			ar5.add("java");
			ar5.add("javaScript");
			ar5.add("dev");
			
			ar5.addAll(ar6);
			
			for(int j=0; j<ar5.size(); j++) {
				System.out.println(ar5.get(j));
			}
			
			System.out.println("*********");
			
			//remove all also
			
			ar5.removeAll(ar6);
			
			for(int k=0; k<ar5.size(); k++) {
			    System.out.println(ar5.get(k));
		}
			System.out.println("*********");
			
			//retain All value
			
			ArrayList<String> ar7=new ArrayList<String>();
			ar7.add("test");
			ar7.add("selenium");
			
			
			ArrayList<String> ar8=new ArrayList<String>();
			ar8.add("test");
			ar8.add("java");
			ar8.add("dev");
			
				ar7.retainAll(ar8);
				for(int l=0; l<ar7.size(); l++) {
					System.out.println(ar7.get(l));
				}
	}
	}
}
