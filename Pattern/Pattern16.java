package Patterns;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int Intvalue=65;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(Intvalue+i));
			}
			System.out.println();
		}
		
		/*
A
BB
CCC
DDDD
EEEEE 
		  
		 */

	}

}
