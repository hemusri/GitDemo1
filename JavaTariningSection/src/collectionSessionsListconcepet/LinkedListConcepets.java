package collectionSessionsListconcepet;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepets {

	public static void main(String[] args) {

		LinkedList<String> ll=new LinkedList();
		
		//add
		ll.add("Test");
		ll.add("QTP");
		ll.add("RAP");
		ll.add("RFT");
		
		//print
		System.out.println("content of linkedlist;"+ll);
		
		//addfirst
		ll.addFirst("Naveen");
		
		//addlast
		ll.addLast("Automation");
		System.out.println("content of linkedlist;"+ll);
		
		//get
		System.out.println(ll.get(0));
		
		//set
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove first and lest element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist;"+ll);
		
             //remove index based
		ll.remove(2);
		System.out.println("content of linkedlist;"+ll);
		
		//how to print are (itarable) all the values will be linked list
		//for loop
		System.out.println("*******using for loop*******");
		for(int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		
		//advanced for loop
		System.out.println("****using advanced for loop*****");
		for(String str:ll) {
			System.out.println(str);
		}
		
		//iterator
		System.out.println("****using iterator****");
		Iterator<String>it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//while loop
		System.out.println("*****while loop using ****");
		int num=0;
		while (ll.size()>num) {
		System.out.println(ll.get(num));
		num++;
	}
	}
}
