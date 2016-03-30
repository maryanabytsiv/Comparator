package com.epam.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	/*
	 * Create a class containing two String objects and make it Comparable so
	 * that the comparison only cares about the first String.
	 * 
	 * Fill an array and an ArrayList with objects of your class by using a
	 * custom generator (eg, which generates pairs of Country-Capital).
	 * Demonstrate that sorting works properly.
	 * 
	 * Now make a Comparator that only cares about the second String and
	 * demonstrate that sorting works properly.
	 * 
	 * Also perform a binary search using your Comparator.
	 */
	
	public static void printArray(CountryCapital array[]){
		for(CountryCapital cc: array)
			System.out.println(cc.getCountry() + " - " + cc.getCapital());		
	}
	
	public static void printArrayList(List<CountryCapital> arrayList){
		for(CountryCapital cc: arrayList)
			System.out.println(cc.getCountry() + " - " + cc.getCapital());		
	}
	
	
	public static void main(String[] args) {

		CountryCapital array[] = { new CountryCapital("Ukraine", "Kyiv"),
				new CountryCapital("Azerbaijan", "Baku"),
				new CountryCapital("Cuba", "Havana"),
				new CountryCapital("Belgium", "Brussels"),
				new CountryCapital("Indonezia", "Jakarta"),
				new CountryCapital("Hungary", "Budapest"),
				new CountryCapital("Senegal", "Dakar") 
		};


		System.out.println("==============Array not sorted=============");
		printArray(array);	

		System.out.println("==========Array sorted by country==========");
		Arrays.sort(array, new ComparatorCountry());
		printArray(array);

		System.out.println("==========Array sorted by capital==========");
		Arrays.sort(array, new ComparatorCapital());
		printArray(array);
		
		List<CountryCapital> listArray = new ArrayList<CountryCapital>();
		listArray.add(new CountryCapital("Ukraine", "Kyiv"));
		listArray.add(new CountryCapital("Azerbaijan", "Baku"));
		listArray.add(new CountryCapital("Cuba", "Havana"));
		listArray.add(new CountryCapital("Belgium", "Brussels"));
		listArray.add(new CountryCapital("Indonezia", "Jakarta"));
		listArray.add(new CountryCapital("Hungary", "Budapest"));
		listArray.add(new CountryCapital("Senegal", "Dakar"));

		System.out.println();
		System.out.println("============ArrayList not sorted==============="); 
		printArrayList(listArray);


		System.out.println("==========ArrayList sorted by country==========");
		Collections.sort(listArray, new ComparatorCountry());
		printArrayList(listArray);

		System.out.println("==========ArrayList sorted by capital==========");
		ComparatorCapital comparatorCapital = new ComparatorCapital();
		Collections.sort(listArray, new ComparatorCapital());
		printArrayList(listArray);	
		CountryCapital listForSearch = new CountryCapital("Senegal", "Dakar");
		
		int index=Collections.binarySearch(listArray, listForSearch, comparatorCapital);     
	      index++;
	      System.out.println("'Dakar' is available at index: "+index);

	      
	      StringBuffer sb = new StringBuffer("Котэ");
	      sb.append('g');
	      System.out.println("Длина: " + sb.capacity());
	      
	      
	}
}


