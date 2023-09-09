package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 84, 45, 36, 79, 67, 13 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		bubble_sort_2(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void show_list(int[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}

	}

	static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i- 1; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

				}
			}
		}
		return arr;
	}

	static void bubble_sort_2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - 1; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}

	}

}
