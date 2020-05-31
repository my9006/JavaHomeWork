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
		twoNumberSum(random.nextInt(), random.nextInt());

		//		5.2
		System.out.println("Input 2 numbers to get their sum");
		twoNumberSum(scanner.nextInt(), scanner.nextInt());

		//		5.3
		System.out.println("Input two numbers to get the cube of their product");
		calculateCubeOfProduct(scanner.nextInt(), scanner.nextInt());

		//		5.4
		System.out.println("Input three ints to get the smallest of them");
		smallestOfThreeInts(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

		//		5.5
		System.out.println("Input a string to get the middle character");
		printMiddleCharacterOfString(scanner.next());

		//		5.6
		System.out.println("Input a sentence to get the number of Words");
		printCountOfWords(scanner.nextLine());

		//		5.7
		System.out.println("Input the year to check whether it's leap or not");
		isTheYearLeap(scanner.nextInt());

		//		5.8
		System.out.println("Input a string to check its validity as a password * Should cojntain at least 2 digits, be more or equal to 10 and contain only letters and numbers");
		isPasswordValid(scanner.nextLine());

		//		5.9
		int radius = scanner.nextInt();
		System.out.printf("The Area of %d radius circle is %f, and the circumference is %f", radius, calculateAreaOfCircle(radius), calculateCircumference(radius));
//		5.10
		System.out.println("Input three sides of triangle");
		int side1 = scanner.nextInt();
		int side2 = scanner.nextInt();
		int side3 = scanner.nextInt();
		if (isTriangleValid(side1, side2, side3)) {
			System.out.printf("Perimeter is %d, and the area is %f", calculatePerimeterOfTriangle(side1, side2, side3), calculateAreaOfTriangle(side1, side2, side3));
		}
		//						5.11
		int[] ints = new int[10];
		arrayPrinter(intArrayGenerator(ints));
		//				5.12
		arrayPrinter(ascendingSortIntArray(intArrayGenerator(ints)));
		//				5.13
		arrayPrinter(descendingSortIntArray(intArrayGenerator(ints)));
		//		 		5.14
		primePrinter(100);
		//				5.15
		arrayPrinter(reverseArray(intArrayGenerator(ints)));
		//				5.16
		System.out.println(isStringPalindrome("debed") ? "Palindrome" : "Not palindrome");
		//		5.17
		System.out.println(factorialCalculator(14));
		//		5.18
		stringMatrixPrinter(initializeRandomMatrix(10));
		//		5.19
		int[][] matrix = intMatrixGenerator(scanner.nextInt());
		rotateMatrixCounterClockWise(matrix);
		rotateMatrixClockWise(matrix);
		turnMatrixUpsideDown(matrix);
		helloMenu();

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

	public static int[] intArrayGenerator(int[] array) {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			array[i] = random.nextInt();
		}
		return array;
	}

	public static void arrayPrinter(int[] array) {
		for (int i : array) {
			System.out.print(i + ", ");
		}
	}

	public static int[] ascendingSortIntArray(int[] array) {
		Arrays.sort(array);
		return array;
	}

	public static int[] descendingSortIntArray(int[] array) {
		ascendingSortIntArray(array);
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		return array;
	}

	public static void primePrinter(int till) {
		System.out.println(till >= 2 ? 2 : "");
		for (int i = 2; i < till; i++) {
			int divCount = 0;
			for (int j = 2; j < Math.sqrt(i) + 1; j++) {
				if (i % j == 0) {
					divCount++;
					break;
				}
			}
			if (divCount == 0) {
				System.out.println(i);
			}
		}
	}

	public static int[] reverseArray(int[] array) {
		int[] reversedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			reversedArray[i] = array[array.length - 1 - i];
		}
		return reversedArray;
	}

	public static boolean isStringPalindrome(String string) {
		String reversedString = "";
		for (int i = 0; i < string.length(); i++) {
			reversedString += string.charAt(string.length() - i - 1);
		}
		return reversedString.equals(string);
	}

	public static long factorialCalculator(int number) {
		long factorial = 1;
		for (int i = 1; i < number + 1; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static String[][] initializeRandomMatrix(int n) {
		String[][] plusMinusMatrix = new String[n][n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				plusMinusMatrix[i][j] = random.nextInt() % 2 == 0 ? "+" : "-";
			}
		}
		return plusMinusMatrix;
	}

	public static void stringMatrixPrinter(String[][] matrix) {
		for (String[] array : matrix) {
			for (String element : array) {
				System.out.print(element + ", ");
			}
			System.out.println("");
		}
	}

	public static int[][] intMatrixGenerator(int size) {
		int[][] matrix = new int[size][size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = random.nextInt((78 - 27)) + 27;
			}
		}
		return matrix;
	}

	public static int[][] rotateMatrixClockWise(int[][] matrix) {
		int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < transposedMatrix.length; i++) {
			for (int j = 0; j < transposedMatrix[i].length; j++) {
				transposedMatrix[i][matrix.length - j - 1] = matrix[j][i];
			}
		}
		return transposedMatrix;
	}

	public static int[][] rotateMatrixCounterClockWise(int[][] matrix) {
		int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < transposedMatrix.length; i++) {
			for (int j = 0; j < transposedMatrix[i].length; j++) {
				transposedMatrix[i][j] = matrix[j][matrix[j].length - 1 - i];
			}
		}
		return transposedMatrix;
	}

	public static int[][] turnMatrixUpsideDown(int[][] matrix) {
		int[][] bottomUpMatrix = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < bottomUpMatrix.length; i++) {
			for (int j = 0; j < bottomUpMatrix[i].length; j++) {
				bottomUpMatrix[i][j] = matrix[matrix.length - 1 - i][matrix[matrix.length - 1 - i].length - 1 - j];
			}
		}
		return bottomUpMatrix;
	}

	public static void helloMenu() {
		System.out.println("------------------MENU-------------\n" +
			"Press 1 -  to print “Hello Word”\n" +
			"Press 2 -  to print “Hello Vorld”\n" +
			"Press 3 -  to print “Hello Uorld”\n" +
			"Press 4 -  EXIT\n" +
			"--------------------------------------------\n");
		Scanner scanner = new Scanner(System.in);
		switch (scanner.nextInt()) {
			case 1:
				System.out.println("Hello World");
				helloMenu();
				break;
			case 2:
				System.out.println("Hello Vorld");
				helloMenu();
				break;
			case 3:
				System.out.println("Hello Uorld");
				helloMenu();
				break;
			case 4:
				return;
			default:
				System.out.println("enter values 1-4");
				helloMenu();

		}
	}

	public static void matrixCustomRotateBy(int[][] matrix) {
		Scanner menuInput = new Scanner(System.in);
		System.out.println("———————- MENU —————-\n1. For rotating 90\n2. For rotating 180\n3. For rotating 270\n4. For Exit\n———————-------—————-");
		switch (menuInput.nextInt()) {
			case 1:
				matrixPrinter(rotateMatrixClockWise(matrix));
				matrixCustomRotateBy(matrix);
				break;
			case 2:
				matrixPrinter(turnMatrixUpsideDown(matrix));
				matrixCustomRotateBy(matrix);
				break;
			case 3:
				matrixPrinter(rotateMatrixCounterClockWise(matrix));
				matrixCustomRotateBy(matrix);
				break;
			case 4:
				return;
			default:
				System.out.println("Wrong input");
				matrixCustomRotateBy(matrix);
		}
	}

	public static void matrixPrinter(int[][] matrix) {
		for (int[] array : matrix) {
			for (int element : array) {
				System.out.print(element + ", ");
			}
			System.out.println();
		}
	}

}
