package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 84, 45, 36, 79, 67, 13 };
		selection_sort(arr);
		System.out.println(Arrays.toString(arr));
		selctionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void selctionSort(int arr[]) {
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < arr.length - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	static void selection_sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int last = arr.length - i - 1;
			int max = getMax(arr, 0, last);
			swap(arr, max, last);
		}
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	static int getMax(int[] arr, int start, int end) {
		int max = start;
		for (int i = start; i <= end; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;

	}

}
