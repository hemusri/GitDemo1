
package JavaBasic;

public class ArrayConcepts {

	public static void main(String[] args) {
	
		//array ; to story similar data type values in a array variables
		
		//1.int array
		//lowest bound/index =0
		//upper bound/index = n-1(n is size of the array)
		
		//one damnation array
		
		//dis advantages of array
		/*size is fixed ---static array-------->to over come this problem--we use collections
		---arraylist,Hashtables--use in dynamic array*/
		//story only similar data type----->int value estaya int values story avthya , char aytha char values story
		//(to over come of this problem we use obejct array)
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]);  //array index out of bound  exception******
		System.out.println(i.length);//size /length of array
		
		//print all the value of array;use of loop
		
		for(int k=0;k<i.length;k++) {
			System.out.println(k);
		}
		//2.Double array
		double d[]=new double[3];
		d[0]=12.44;
		d[1]=44.5;
		d[2]=16.20;
		
		
		System.out.println(d[1]);
		
		//3.char array
		
		char c[]=new char[3];
		c[0]='a';
		c[1]='2';
		c[2]='b';
		
		System.out.println(c[1]);
		
		//4.boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5.string array;
		String s[]=new String[3];
		s[0]="hello";
		s[1]="welcome";
		s[2]="world";
		
		System.out.println(s.length);
		
		//6.object array;(object is class)---->is used to story different data type values
		//object is the super class of the all class methods
		Object ob[]=new Object[6];
		ob[0]="tom";
		ob[1]=25;
		ob[2]=13.55;
		ob[3]=1/2/2020;
		ob[4]='a';
		ob[5]="londan";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		for(int j=0;j<ob.length;j++) {
			System.out.println(j);
	}
	}
}
