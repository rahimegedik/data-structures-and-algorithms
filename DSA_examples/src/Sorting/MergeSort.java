package Sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 84, 45, 36, 79, 67, 13 };
		merge_sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void merge_sort(int[] arr) {
		if (arr.length < 2) {
			return;
		}
		int middle = arr.length / 2;
		
		int[] leftArr = new int[middle];
		int[] rightArr = new int[arr.length - middle];
		
		for (int i =0;i<middle;i++) {
			leftArr[i]=arr[i];
		}
		for (int i =middle;i<arr.length;i++) {
			rightArr[i - middle] = arr[i];
		}
		merge_sort(leftArr);
		merge_sort(rightArr);
		
		merge(leftArr, rightArr, arr);
		

	}
	static void merge(int[] leftArr, int[]rightArr, int[] Arr) {
		int i=0; 
		int j=0;
		int k=0;
		
		while(i<leftArr.length && j<rightArr.length) {
			if(leftArr[i]<=rightArr[j]) {
				Arr[k]=leftArr[i];
				i++;
			}
			else {
				Arr[k]=rightArr[j];
				j++;
			}
			k++;
		}
		while (i<leftArr.length) {
			Arr[k]=leftArr[i];
			i++;
			k++;
		}
		while (j<rightArr.length) {
			Arr[k]=rightArr[j];
			j++;
			k++;
		}
		
	}

}
