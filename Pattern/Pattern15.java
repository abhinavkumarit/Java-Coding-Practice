package Patterns;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int Intvalue=65;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print((char) (Intvalue+j));
			}
			System.out.println();
		}
		
		/*
ABCDE
ABCD
ABC
AB
A 
		  
		  
		 */

	}

}
