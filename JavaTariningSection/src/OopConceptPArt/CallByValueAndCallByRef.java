package OopConceptPArt;

public class CallByValueAndCallByRef {

	int p;
	int q;
	
	public static void main(String[] args) {

		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x=20;
		int y=30;
		obj.testsum(x,y);//call by the value and pass by the value
		
		obj.p=50;
		obj.q=60;
		
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
/*		int test=obj.testsum(10,20);
		System.out.println(test);*/
	
		
	}

	public int testsum(int a,int b) {
	    a=30;
		b=40;
		int c =a+b;
		return c;
	}
	
	//call by ref
	public void swap(CallByValueAndCallByRef t) {
	
		int temp;
		temp=t.p;//temp=50;
		t.p=t.q;//t.p=60;
		t.q=temp;//t.q=50;
		System.out.println(t.q);
		
		
	
	}
}
