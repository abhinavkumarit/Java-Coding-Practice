package Patterns;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int intvalue=65;
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print((char)(intvalue+j));
			}
			System.out.println();
		}

	}


/*
 
A
AB
ABC
ABCD
 	
 	
 */
	
}
