package Searching;


public class LinearSearching {
	public static void main(String[] args) {
		int[] arr ={13,78,54,84,26};
		System.out.println(linearSearch(arr,56));
		
	
	}
	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if (element == target) {
				return index;
			}

		}
		return -1;
	}

}
