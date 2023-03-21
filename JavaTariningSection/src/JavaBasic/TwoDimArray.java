
package JavaBasic;

public class TwoDimArray {

	public static void main(String[] args) {
		
		//Declaration
		String [][]x=new String[4][5];
		
		System.out.println(x.length); //4.....toatal number  of rows=4
		System.out.println(x[0].length);//5....toatal number of colm=5
		
		//Story the values of two dim Array
		
		//1St Row
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="c";
		x[0][3]="D";
		x[0][4]="E";
		//2nd Row

		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="c1";
		x[1][3]="D1";
		x[1][4]="E1";
		//3rd Row
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="c2";
		x[2][3]="D2";
		x[2][4]="E2";
		//4th Row
		x[3][0]="A3";
		x[3][1]="B3";
		x[3][2]="c3";
		x[3][3]="D3";
		x[3][4]="E3";
		
		System.out.println(x[1][1]);
		System.out.println(x[1][2]);
		System.out.println(x[0][1]);
//		
//		int[][] arr = new int[2][3]; // Array Declaration and assigning size.   
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30; // Array initialization
//		arr[1][0] = 40;
//		arr[1][1] = 50;
//		arr[1][2] = 60;
//		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);

	}

}
