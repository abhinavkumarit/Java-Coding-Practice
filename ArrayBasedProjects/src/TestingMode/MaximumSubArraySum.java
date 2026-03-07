
// Kadanes Algorithm
package TestingMode;

public class MaximumSubArraySum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int n=arr.length;
		System.out.println(FindItsMaxSubArraySum(arr,n));
}

	private static int FindItsMaxSubArraySum(int[] arr, int n) {
		// TODO Auto-generated method stub
		int currSum=0;
		int maxSum=0;
		for(int i=0; i<n; i++) {
			currSum=Math.max(arr[i], currSum+arr[i]);
			maxSum=Math.max(maxSum, currSum);
		}
		return maxSum;
		
	}
}