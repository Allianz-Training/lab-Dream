package com.azt.helloWorld;

public class Homework2 {
	public static void main(String[] args) {
		String[][] table = {
				{"1","2","3"},
				{"4","5","6"},
				{"7","8","9"}
		};
		
		multiplyTable(table);
	}
	
	
	
	public static void multiplyTable(String[][] table) { 
		for (int i = 0; i <table.length; ++i) {
			for (int j = 0; j <table[i].length ; ++j) {
				int a = Integer.parseInt(table[i][j]);				
				System.out.print(a*2);
				if(j<2) { //j!=intGrid.length
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}
}
