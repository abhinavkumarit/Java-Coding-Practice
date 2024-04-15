package Patterns;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int Intvalue=65;
		int n=5;
		for(int i=0; i<n ; i++) {
			for(char ch=(char) ('E'-i); ch<='E'; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		/*
E
DE
CDE
BCDE
ABCDE 
		  
		 */
		

	}

}
