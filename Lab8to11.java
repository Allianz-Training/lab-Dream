package com.azt.helloWorld;

public class Lab8to11 {
	public static void main(String[] args) {
		Lab8();
		Lab9();
		Lab10();
		Lab11();
	}

	public static void Lab8() {
		for (int count = 0; count <= 20; count++) {
			if (count == 11) {
				System.out.print(count);
				break;
			}
		}
	}

	public static void Lab9() {
		for (int count = 0; count <= 20; count++) {
			if (count == 11) {
				System.out.print(count);
				continue;
			}

		}
	}

	public static void Lab10() {
		int i = 0;
		while (i < 10) {
			i++;
			if (i == 2) {
				continue;
			}
			System.out.print(i);

		}

	}

	public static void Lab11() {
		String a = "My dog name is";
		String b = " Baka";
		System.out.println(pet(a, b));
		myDog(a, b);

	}

	public static String pet(String word, String name) {
		return word + name;
	}

	public static void myDog(String word, String name) {
		System.out.println(word + name);
	}

}
