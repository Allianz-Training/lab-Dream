package com.azt.helloWorld;

public class Lab12to13 {
	public static void main(String[] args) {
		lab12();
		lab13();
	}
	public static void lab12() {
		String firstString = "You and Me";
		String secondString = " you and me";
		System.out.println(firstString.equals(secondString));
		System.out.println(firstString.contains("and"));
		System.out.println(firstString.length());
		System.out.println(firstString.substring(4,10));
		System.out.println(firstString.trim());
		System.out.println(firstString.toUpperCase());
		System.out.println(secondString.trim().toUpperCase());		
	}
	public static void lab13() {
		int[][] twoD_Array = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		int sum = 0;
		for (int row = 0; row < twoD_Array.length; row++){
			   for (int element = 0; element < twoD_Array[row].length; element++){	 
				System.out.println(twoD_Array[row][element]);
				if (element == twoD_Array[row].length-1) {
					sum = sum + twoD_Array[row][element];
				}
			
				}
			}
		System.out.println(sum);
		}
	
}

