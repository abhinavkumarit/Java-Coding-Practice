package Patterns;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			for(int k=0; k<n-i; k++) {
				System.out.print(" ");
			}
			for(int k=0; k<n-i; k++) {
				System.out.print(" ");
			}
			for(int j=i; j>0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		/* 
		 1             1
		 1 2         2 1
		 1 2 3     3 2 1
		 1 2 3 4 4 3 2 1
	 
		 */
		
		
	}

}

