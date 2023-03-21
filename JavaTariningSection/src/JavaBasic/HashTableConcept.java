package JavaBasic;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h=new Hashtable();
		
		h.put("a", "Test");
		h.put("b", "Hello");
		h.put("c", "World");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("c"));
		
		h.put(3, "Hi");
		
		Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
		h1.put(4,300);
		//h1.put("d", "Cool");  this is not allow
		
		Hashtable<Integer,String> h2=new Hashtable<Integer,String>();
		h2.put(4, "google");
	}

}
