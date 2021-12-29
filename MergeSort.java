package com.greatlearning.dsa;

public class MergeSort {
	public void mergeAscending(double[] arr, int left, int mid, int right) {
		
		// Size of two sub arrays
		int len1 = mid-left+1;
		int len2 = right - mid;
		
		// Two sub arrays
		double leftArr[] = new double[len1];
		double rightArr[] = new double[len2];
		
		// Inserting values into sub arrays
		for(int i = 0; i < len1; i++) {
			leftArr[i] = arr[left+i];
		}
		for(int j=0; j < len2; j++) {
			rightArr[j] = arr[mid+1+j];
		}
		
		// Compare two sub arrays and merging them
		int i = 0, j = 0; 
		int k = left;
		while(i < len1 && j < len2){
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}
			else {
				arr[k] = rightArr[j];
				j++;
 			}
			k++;
		}
		
		// Copying remaining elements into arr[]
		while(i < len1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j < len2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}	
	}
	
	public void sortAscending(double[] price, int left, int right) {
		if(left < right) {
			int mid = ((left+right)/2);
			
			//Sorting sub arrays
			sortAscending(price, left, mid);
			sortAscending(price, mid+1, right);
			
			// Merge both sub arrays
			mergeAscending(price, left, mid, right);		
			
		}	
	}
	
	
	public void mergeDescending(double[] arr, int left, int mid, int right) {
		
		// Size of two sub arrays
		int len1 = mid-left+1;
		int len2 = right - mid;
		
		// Two sub arrays
		double leftArr[] = new double[len1];
		double rightArr[] = new double[len2];
		
		// Inserting values into sub arrays
		for(int i = 0; i < len1; i++) {
			leftArr[i] = arr[left+i];
		}
		for(int j=0; j < len2; j++) {
			rightArr[j] = arr[mid+1+j];
		}
		
		// Compare two sub arrays and merging them
		int i = 0, j = 0; 
		int k = left;
		while(i < len1 && j < len2){
			if(leftArr[i] >= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}
			else {
				arr[k] = rightArr[j];
				j++;
 			}
			k++;
		}
		
		// Copying remaining elements into arr[]
		while(i < len1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j < len2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}	
	}
	
	public void sortDescending(double[] price, int left, int right) {
		if(left < right) {
			int mid = ((left+right)/2);
			
			//Sorting sub arrays
			sortDescending(price, left, mid);
			sortDescending(price, mid+1, right);
			
			// Merge both sub arrays
			mergeDescending(price, left, mid, right);		
			
		}	
	}
}
