package Patterns;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int Intvalue=65;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			
			}
			for(int k=0; k<=i; k++) {
				System.out.print((char) (Intvalue+k));
			}
			for(int k=0; k<i; k++) {
				System.out.print((char) (Intvalue+k));
			}
			System.out.println();
		}
		
		/*
		 
     A
    ABA
   ABCAB
  ABCDABC
 ABCDEABCD
		  
		  
		 */
		

	}

}
