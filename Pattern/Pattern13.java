package Patterns;

public class Pattern13 {
	public static void main(String[] args) {
		int k=1;
		int n=6;
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
//				System.out.print(j+i+" ");
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}





/* 
 1 
 2  3  
 4  5  6  
 7  8  9  10
 11 12 13 14 15  
 *  */
