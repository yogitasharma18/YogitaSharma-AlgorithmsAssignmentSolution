package com.greatlearning.dsa;

public class BinarySearch {

	public int BinarySearch(double[] stockPriceArr, int left, int right, double search_val) {
		
		// To find mid and size of array
		
		if(right >= left) {
			int mid = left + (right - left)/2; 
			if(stockPriceArr[mid] == search_val) {
				return 1;
			}
			if(stockPriceArr[mid] > search_val)
			{
				return BinarySearch(stockPriceArr, left, mid-1, search_val);
			}
			else {
				return BinarySearch(stockPriceArr, mid+1, right, search_val);
			}
		}
		return -1;	
	}
}
