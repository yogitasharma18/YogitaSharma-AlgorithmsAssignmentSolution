package com.greatlearning.driver;

import java.lang.reflect.Array;
import java.util.Scanner;
import com.greatlearning.service.CompaniesStock;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CompaniesStock companiesStock = new CompaniesStock();
		int companyCount;
		boolean statusFlag = false;
		int choice;
		double search_val;
			
		// Input no. of companies
		
		System.out.println("Enter the no. of companies");
		companyCount = sc.nextInt();
		
		// Input companies stock price and storing it in array
		
		double stockPrice[] = new double[companyCount];
		double stockPriceArr[] = new double[companyCount];
		boolean statusFlagArr[] = new boolean[companyCount];
		for(int i=0; i < companyCount;i++) {
			System.out.println("Enter current stock price of the company "+(i+1));
			stockPrice[i] = sc.nextDouble();
			stockPriceArr[i] += stockPrice[i];
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			statusFlag = sc.nextBoolean();	
			Array.setBoolean(statusFlagArr, i, statusFlag);
		}
		
		//Display Menu
		while(true) {
			System.out.println("\n------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("\n------------------------------------------");
			
			choice = sc.nextInt();
			
			switch(choice) {
				case 1 : 
					companiesStock.displayAscendingOrder(stockPriceArr, companyCount);
					break;
					
				case 2 :
					companiesStock.displayDescendingOrder(stockPriceArr, companyCount);
					break;
					
				case 3 :
					companiesStock.displayRoseCount(statusFlagArr, companyCount);
					break;
					
				case 4 :
					companiesStock.displayDeclinedCount(statusFlagArr, companyCount);
					break;
					
				case 5 :
					System.out.println("Enter the key value");
					search_val = sc.nextDouble();
					companiesStock.searchStockPrice(stockPriceArr, companyCount, search_val);
					break;
					
				case 0 :
					System.out.println("Exited successfully");
					System.exit(0);
					
				default : 
					System.out.println("Please select correct operation to be performed");
			}
		}
	}

}
