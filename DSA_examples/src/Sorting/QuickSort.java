package Sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 84, 45, 36, 79, 67, 13 };
		quick_sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	class Quicksort {

		  
		  static int partition(int array[], int low, int high) {
		    int pivot = array[high];
		   
		    int i = (low - 1);

		    for (int j = low; j < high; j++) {
		      if (array[j] <= pivot) {
		
		        i++;
		     
		        int temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		      }

		    }
		    int temp = array[i + 1];
		    array[i + 1] = array[high];
		    array[high] = temp;

		
		    return (i + 1);
		  }

		  static void quickSort(int array[], int low, int high) {
		    if (low < high) {

		      int pi = partition(array, low, high);
	
		      quickSort(array, low, pi - 1);

		      quickSort(array, pi + 1, high);
		    }
		  }
		}

	static void quick_sort(int[] arr, int low, int high) {
		if (low>=high) {
			return;
		}
		int pivot = arr[high];

		int start = low;
		int end = high-1;

		while (start < end) {
			while (arr[start] <= pivot && start < end) {
				start++;
			}
			while (arr[end] >= pivot && start < end) {
				end--;
			}
			swap(arr, start, end);
		}
		if (arr[start]>arr[high]) {
		swap(arr, start, high);
		}
		else
			start=high;
		
		quick_sort(arr, low, start-1);
		quick_sort(arr, start+1, high);

	}
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}


}
