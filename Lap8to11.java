package com.azt.helloWorld;

public class Lap8to11 {
	public static void main(String[] args) {
		Lap8();
		Lap9();
		Lap10();
		Lap11();
	}

	public static void Lap8() {
		for (int count = 0; count <= 20; count++) {
			if (count == 11) {
				System.out.print(count);
				break;
			}
		}
	}

	public static void Lap9() {
		for (int count = 0; count <= 20; count++) {
			if (count == 11) {
				System.out.print(count);
				continue;
			}

		}
	}

	public static void Lap10() {
		int i = 0;
		while (i < 10) {
			i++;
			if (i == 2) {
				continue;
			}
			System.out.print(i);

		}

	}

	public static void Lap11() {
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
