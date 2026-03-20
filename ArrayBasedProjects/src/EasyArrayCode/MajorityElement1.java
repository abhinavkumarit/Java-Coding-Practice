package EasyArrayCode;

//import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 1, 2, 1, 5, 3, 1};
		
		System.out.println(FindItsMajorityElement(arr));
	}

	private static int FindItsMajorityElement(int[] arr) {
		// TODO Auto-generated method stub
//		return null;
		Map<Integer, Integer>map=new LinkedHashMap<>();
		for(int num: arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
			if(map.get(num)>arr.length/2) {
				return map.get(num);
			}
		}
		return -1;
		
		
		
	}

//	private static int FindItsMajorityElement(int[] arr) {
//		// TODO Auto-generated method stub
//		Arrays.sort(arr);
//		int count=1;
//		int maxCount=Integer.MIN_VALUE;
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i-1]==arr[i]) {
//				count++;
//			}
//			else {
//				maxCount=Math.max(count, maxCount);
//				count=0;
//			}
//		}
//		if(maxCount>arr.length/2) {
//			return maxCount;
//		}
//		else {
//			return -1;
//		}
//	}
	

}
