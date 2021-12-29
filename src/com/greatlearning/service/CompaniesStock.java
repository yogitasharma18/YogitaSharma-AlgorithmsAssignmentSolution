package com.greatlearning.service;
import java.util.Arrays;

import com.greatlearning.dsa.BinarySearch;
import com.greatlearning.dsa.MergeSort;

public class CompaniesStock {
	
	//To sort companies stock prices in ascending order 
	
	public void displayAscendingOrder(double[] stockPriceArr, int companyCount) {
		MergeSort mergeSort = new MergeSort();
		double price[] = new double[companyCount];
		for(int i=0; i< companyCount; i++ ) {
			price[i] = stockPriceArr[i];
		}
		
		mergeSort.sortAscending(price, 0, companyCount-1);
	
		// Print the values
		System.out.println("Stock prices in ascending order are :");
		for(int i=0; i < companyCount ; i++) {	
			System.out.print(price[i]+" ");
		}
	}
	
	public void displayDescendingOrder(double[] stockPriceArr, int companyCount) {
		
		// To sort companies stock prices in descending order
		
		MergeSort mergeSort = new MergeSort();
		double price[] = new double[companyCount];
		for(int i=0; i< companyCount; i++ ) {
			price[i] = stockPriceArr[i];
		}
	
		mergeSort.sortDescending(price, 0, companyCount-1); 
		
		// Print the values
		System.out.println("Stock prices in descending order are :");
		for(int i=0; i< companyCount ; i++) {	
			System.out.print(price[i]+" ");
		}
		
	}
	public void displayRoseCount(boolean[] statusFlagArr, int companyCount) {
		
		// To count no. of companies whose stock rose today
		
		int count = 0;
		for (boolean x : statusFlagArr) {
			 if(x == true) { 
			   count++;
			 }
	    }
		
		// To print the count
		System.out.println("Total no of companies whose stock price rose today : "+count);
	}
	
	public void displayDeclinedCount(boolean[] statusFlagArr, int companyCount) {
		
		// To count no. of companies whose stock declined today
		
		int count = 0;
		for (boolean x : statusFlagArr) {
			 if(x == false) { 
			   count++;
			 }
	    }
		
		// To print the count
		System.out.println("Total no of companies whose stock price declined today : "+count);
	}
	
	public void searchStockPrice(double[] stockPriceArr, int companyCount, double search_val) {
		
		// To search a specific stock price
		
		BinarySearch binarySearch = new BinarySearch();
		int result = binarySearch.BinarySearch(stockPriceArr, 0, companyCount-1, search_val);

		// To print the message
		if(result == -1) {
			System.out.println("Value not found");
		}
		else {
			System.out.println("Stock of value "+search_val+" is present");
		}
		
	}
}
