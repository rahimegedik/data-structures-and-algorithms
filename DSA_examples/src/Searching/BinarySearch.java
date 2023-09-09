package Searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 13, 36, 45, 54, 67, 79, 84 };
		System.out.println(binarySearch(arr, 79));

	}

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int middle = (start + end) / 2;

			if (target < arr[middle]) {
				end = middle - 1;
			} else if (target > arr[middle]) {
				start = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;
	}

}
