package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//		4.1 Createa Array, Print it, query a value
		/*
		int[] myArray = intArrayGenerator(10);
		intArrayPrinter(myArray);
		checkValueInArray(scanner.nextInt(), myArray);

		 */
		//		4.2 Generate array, sort and print
		/*
		int[] myArray = intArrayGenerator(10);
		intArrayPrinter(myArray);
		ascendingSortIntArray(myArray);
		intArrayPrinter(myArray);
		 */

		//		4.3 Descending sorting of array
		/*
		int[] myArray = intArrayGenerator(10);
		intArrayPrinter(myArray);
		descendingSortIntArray(myArray);
		intArrayPrinter(myArray);
		 */

		//		4.4 get index of input number
		/*
		int[] myArray = intArrayGenerator(10);
		intArrayPrinter(myArray);
		getIndexOfQueriedNumber(scanner.nextInt(), myArray);

		 */
		//		4.5 Generate matrix, print it, find max value
		/*
		int[][] myMatrix = intMatrixGenerator(10, 15);
		intMatrixPrinter(myMatrix);
		System.out.println(intMatrixMaxValue(myMatrix));

		 */

		//		4.6 Generate matrix, print it, input the number of row, output the sum of elements of that row
		/*
		int[][] myMatrix = intMatrixGenerator(10, 15);
		intMatrixPrinter(myMatrix);
		int rowNumber = scanner.nextInt();
		System.out.println(sumOfRowValuesInMatrix(rowNumber, myMatrix) == -1 ? "Wrong input" : sumOfRowValuesInMatrix(rowNumber, myMatrix));

		 */
//		4.7 Rotate matrix 90 clockwise;
		/*
		int[][] myMatrix = intMatrixGenerator(4, 5);
		intMatrixPrinter(myMatrix);
		System.out.println("*********");
		intMatrixPrinter(rotateMatrixClockWise(myMatrix));

		 */
//		4.8 rotate 180
		/*
		int[][] myMatrix = intMatrixGenerator(4, 5);
		intMatrixPrinter(myMatrix);
		System.out.println("*********");
		intMatrixPrinter(turnMatrixUpsideDown(myMatrix));

		 */


//		4.9 rotate 270
		/*
		int[][] myMatrix = intMatrixGenerator(4, 5);
		intMatrixPrinter(myMatrix);
		System.out.println("*********");
		intMatrixPrinter(rotateMatrixCounterClockWise(myMatrix));

		 */

	}

	public static int[] intArrayGenerator(int arrayLength) {
		int[] intArray = new int[arrayLength];
		Random random = new Random();
		int upperBound = 99;
		int lowerBound = 10;
		for (int i = 0; i < arrayLength; i++) {
			intArray[i] = random.nextInt(upperBound - lowerBound) + lowerBound;
		}
		return intArray;
	}

	public static void intArrayPrinter(int[] array) {
		for (int i : array) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	public static void checkValueInArray(int value, int[] array) {
		//		Dont panic, it just checks whether the given value exists in the array returning true / false, which after is checked by ternary operator
		System.out.printf(IntStream.of(array).anyMatch(valueToCheck -> valueToCheck == value) ? "%d exists in given Array" : "%d doesn't exist in the Array", value);
	}

	public static void ascendingSortIntArray(int[] array) {
		Arrays.sort(array);
	}

	public static void descendingSortIntArray(int[] array) {
		ascendingSortIntArray(array);
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
	}

	public static void getIndexOfQueriedNumber(int queryNumber, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == queryNumber) {
				System.out.printf("The index of input number in array is %d", i);
				return;
			}
		}
		System.out.println("Number doesn't exist");
	}

	public static int[][] intMatrixGenerator(int rowCount, int columnCount) {
		Random random = new Random();
		int[][] matrix = new int[rowCount][columnCount];
		for (int i = 0; i < rowCount; i++) {
			matrix[i] = intArrayGenerator(columnCount);
		}
		return matrix;
	}

	public static void intMatrixPrinter(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			intArrayPrinter(matrix[i]);
		}
	}

	public static int intMatrixMaxValue(int[][] matrix) {
		int max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			descendingSortIntArray(matrix[i]);
			max = matrix[i][0] > max ? matrix[i][0] : max;
		}
		return max;
	}

	public static int sumOfRowValuesInMatrix(int rowNumber, int[][] matrix) {
		return rowNumber < matrix.length ? IntStream.of(matrix[rowNumber]).sum() : -1;
	}

	public static int[][] rotateMatrixClockWise(int[][] matrix){
		int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < transposedMatrix.length; i++) {
			for (int j = 0; j < transposedMatrix[i].length; j++) {
				transposedMatrix[i][matrix.length-j-1]=matrix[j][i];
			}
		}
		return transposedMatrix;
	}

	public static int[][] rotateMatrixCounterClockWise(int[][] matrix){
		int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < transposedMatrix.length; i++) {
			for (int j = 0; j < transposedMatrix[i].length; j++) {
				transposedMatrix[i][j]=matrix[j][matrix.length-i];
			}
		}
		return transposedMatrix;
	}

	public static int[][] turnMatrixUpsideDown(int[][] matrix){
		int[][] bottomUpMatrix = rotateMatrixClockWise(matrix);
		bottomUpMatrix = rotateMatrixClockWise(bottomUpMatrix);
		return bottomUpMatrix;
	}

}
