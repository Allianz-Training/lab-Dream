package com.azt.helloWorld;

public class homework1 {
	public static void main(String[] args) {
		homework1();
	}

//homework 1	
	public static void homework1() {
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw1 result:");
			}
			draw1(i);

		}

		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw2 result:");
			}
			draw2(i);

		}
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw3 result:");
			}
			draw3(i);

		}
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw4 result:");
			}
			draw4(i);

		}
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw5 result:");
			}
			draw5(i);

		}
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw6 result:");
			}
			draw6(i);

		}
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw7 result:");
			}
			draw7(i);

		}
		for (int i = 2; i <= 4; i++) {
			if (i == 2) {
				System.out.println("Draw8 result:");
			}
			draw8(i);

		}

	}

//draw1
	public static void draw1(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
			if (i == n) {
				System.out.println();
				System.out.println("n=" + n);
				System.out.println();
			}
		}
	}

//draw2
	public static void draw2(int n) {
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				System.out.print("*");
				if (b == n) {
					System.out.println();

				}
			}
			if (a == n) {
				System.out.println("n=" + n);
				System.out.println();
			}
		}
	}

//draw3	
	public static void draw3(int n) {
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				System.out.print(b);
				if (b == n) {
					System.out.println();

				}
			}
			if (a == n) {
				System.out.println("n=" + n);
				System.out.println();
			}
		}

	}

//draw4
	public static void draw4(int n) {
		for (int a = n; a > 0; a--) {
			for (int b = n; b > 0; b--) {
				System.out.print(b);
				if (b == 1) {
					System.out.println();

				}
			}
			if (a == 1) {
				System.out.println("n=" + n);
				System.out.println();
			}
		}
	}
//draw5
	public static void draw5(int n) {
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				System.out.print(a);
				if (b == n) {
					System.out.println();

				}
			}
			if (a == n) {
				System.out.println("n=" + n);
				System.out.println();
			}
		}
		
	}
//draw6
	public static void draw6(int n) {
		for (int a = n; a > 0; a--) {
			for (int b = n; b > 0; b--) {
				System.out.print(a);
				if (b == 1) {
					System.out.println();

				}
			}
			if (a == 1) {
				System.out.println("n=" + n);
				System.out.println();
			}
		}
	}
//draw7
	public static void draw7(int n) {
		for (int a = 1; a <= n; a++) {
			for (int b = 1+n*(a-1); b <=n*a ; b++) {
				System.out.print(b);				
				}
			System.out.println();
		if (a == n) {
			System.out.println("n=" + n);
			System.out.println();
			}
			
		}
	}
//draw8
	public static void draw8(int n) {
		for (int a = 1; a <= n; a++) {
			for (int b = 1+n*(a-1); b <=n*a ; b++) {
				System.out.print((n*n)-b+1);				
				}
			System.out.println();
		if (a == n) {
			System.out.println("n=" + n);
			System.out.println();
			}
			
		}
	}
}
