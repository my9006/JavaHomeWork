package com.company;

import com.company.shapes.Point;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.naming.MalformedLinkException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		//		5.1
		//		twoNumberSum(random.nextInt(), random.nextInt());

		//		5.2
		//		System.out.println("Input 2 numbers to get their sum");
		//		twoNumberSum(scanner.nextInt(), scanner.nextInt());

		//		5.3
		//		System.out.println("Input two numbers to get the cube of their product");
		//		calculateCubeOfProduct(scanner.nextInt(), scanner.nextInt());

		//		5.4
		//		System.out.println("Input three ints to get the smallest of them");
		//		smallestOfThreeInts(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

		//		5.5
		//		System.out.println("Input a string to get the middle character");
		//		printMiddleCharacterOfString(scanner.next());

		//		5.6
		//		System.out.println("Input a sentence to get the number of Words");
		//		printCountOfWords(scanner.nextLine());

		//		5.7
		//		System.out.println("Input the year to check whether it's leap or not");
		//		isTheYearLeap(scanner.nextInt());

		//		5.8
		//		System.out.println("Input a string to check its validity as a password * Should cojntain at least 2 digits, be more or equal to 10 and contain only letters and numbers");
		//		isPasswordValid(scanner.nextLine());

		//		5.9
		//		int radius = scanner.nextInt();
		//		System.out.printf("The Area of %d radius circle is %f, and the circumference is %f", radius, calculateAreaOfCircle(radius), calculateCircumference(radius));
		//		5.10
		//		System.out.println("Input three sides of triangle");
		//		int side1 = scanner.nextInt();
		//		int side2 = scanner.nextInt();
		//		int side3 = scanner.nextInt();
		//		if(isTriangleValid(side1, side2, side3)){
		//			System.out.printf("Perimeter is %d, and the area is %f", calculatePerimeterOfTriangle(side1, side2, side3), calculateAreaOfTriangle(side1, side2, side3));
		//		}
//		5.11
//		arrayPrinter(intArrayGenerator(random));


	}

	public static void twoNumberSum(int a, int b) {
		System.out.println(a + b);
	}

	public static void calculateCubeOfProduct(int a, int b) {
		System.out.println(Math.pow(a * b, 3));
	}

	public static void printMiddleCharacterOfString(String inputString) {
		System.out.println(inputString.charAt(inputString.length() / 2));
	}

	public static void smallestOfThreeInts(int firstInt, int secondInt, int thidrInt) {
		int[] inputIntArray = {firstInt, secondInt, thidrInt};
		Arrays.sort(inputIntArray);
		System.out.println(inputIntArray[0]);
	}

	public static void printCountOfWords(String sentence) {
		System.out.println(sentence.length() - sentence.replaceAll(" ", "").length() + 1);
	}

	public static void isTheYearLeap(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.printf("%d is leap", year);
		} else {
			System.out.printf("%d is not leap", year);
		}
	}

	public static void isPasswordValid(String password) {
		boolean valid = password.length() >= 10 && password.matches(".*\\d.*") && password.matches("\\w+\\.?") && password.length() - 2 >= password.replaceAll("[0-9]", "").length();
		System.out.println(valid ? "password is valid" : "password is not valid");
	}

	public static double calculateCircumference(int radius) {
		return 2 * Math.PI * radius;
	}

	public static double calculateAreaOfCircle(int radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	public static boolean isTriangleValid(int side1, int side2, int side3) {
		return side1 + side2 > side3 || side2 + side3 > side1 || side1 + side3 > side2;
	}

	public static int calculatePerimeterOfTriangle(int side1, int side2, int side3) {
		return side1 + side2 + side3;
	}

	public static double calculateAreaOfTriangle(int side1, int side2, int side3) {
		int s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public static int[] intArrayGenerator(Random random) {
		int[] ints = new int[10];
		for (int i = 0; i < 10; i++) {
			ints[i] = random.nextInt();
		}
		return ints;
	}

	public static void arrayPrinter(int[] array) {
		for (int i : array) {
			System.out.print(i + ", ");
		}
	}

}
