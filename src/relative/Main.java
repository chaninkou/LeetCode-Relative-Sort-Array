package relative;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		
		System.out.println("Arr1: " + Arrays.toString(arr1));
		
		System.out.println("Arr2: " + Arrays.toString(arr2));
		
		SortRelativeArrayFunction solution = new SortRelativeArrayFunction();
		
		System.out.println("Solution: " + Arrays.toString(solution.relativeSortArray(arr1, arr2)));
	}
}
