package Sorting;

import java.util.Arrays;

public class ÝnsertionSort {

	public static void main(String[] args) {
		int[] arr = { 84, 45, 36, 79, 67, 13 };
		int[] list = { 13, 36, 45, 67, 79, 84 };
		insertion_sort(arr);
		System.out.println(Arrays.toString(arr));
		insertion_sort(list);
		System.out.println(Arrays.toString(list));

	}

	static void insertion_sort(int[] arr) {

		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;

				} else {
					break;
				}
			}
		}

	}

}
