package com.azt.helloWorld;

public class Homework3 {
	public static void main(String[] args) {
		homework3();
	}

	public static void homework3() {
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw9 result:");
			}
			draw9(i);

		}
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw10 result:");
			}
			draw10(i);

		}
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw11 result:");
			}
			draw11(i);

		}
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw12 result:");
			}
			draw12(i);

		}
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw13 result:");
			}
			draw13(i);

		}
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw14 result:");
			}
			draw14(i);

		}
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw15 result:");
			}
			draw15(i);

		}
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw16 result:");
			}
			draw16(i);

		}
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw17 result:");
			}
			draw17(i);

		}
	}

//draw9
	public static void draw9(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(2 * (i - 1));
		}
		System.out.println("n=" + n);
		System.out.println();
	}

//draw10
	public static void draw10(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(2 * i);
		}
		System.out.println("n=" + n);
		System.out.println();
	}

//draw11
	public static void draw11(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j * i);
			}
			System.out.println();
		}
		System.out.println("n=" + n);
		System.out.println();
	}

//draw12
	public static void draw12(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("n=" + n);
		System.out.println();
	}

//draw13
	public static void draw13(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j == n+1) {
					System.out.print("_");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("n=" + n);
		System.out.println();
	}

//draw14
	public static void draw14(int n) {
		for (int i = 0; i < n; i++) {			
			for (int j = 0; j <n; j++) {
				if(i<j) {
					System.out.print("_");
				} else {
				System.out.print("*");
			}
			}	
			System.out.println();
			
		}
		System.out.println("n=" + n);
		System.out.println();
	}
//draw15	
	public static void draw15(int n) {
		for (int i = 0; i < n; i++) {			
			for (int j = 0; j <n; j++) {
				if(i+j >= n) {
					System.out.print("_");
				} else {
				System.out.print("*");
			}
			}	
			System.out.println();
			
		}
		System.out.println("n=" + n);
		System.out.println();
	}
//draw16
	public static void draw16(int n) {
		for (int i = 0; i < (n*2)-1; i++) {
			for (int j = 0; j <n; j++) {
				if(i<j && i<= n ) {
					System.out.print("_");
				} else if(i+j >= n*2-1 && i <= n*2 ) {
					System.out.print("_");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("n=" + n);
		System.out.println();
	}

//draw17
	public static void draw17(int n) {
		for (int i = 0; i < (n*2)-1; i++) {
			for (int j = 0; j <n; j++) {
				if(i<j && i<= n ) {
					System.out.print("_");
				} else if(i+j >= n*2-1 && i <= n*2 ) {
					System.out.print("_");
				}else if(i<n){
					System.out.print(i+1);
				}else {
					System.out.print(2*n-i-1);
				}
			}
			System.out.println();
		}
		System.out.println("n=" + n);
		System.out.println();
		
	}
}
