package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//		4.1 Createa Array, Print it, query a value

		int[] arrayToCheckValue = intArrayGenerator(10);
		arrayPrinter(arrayToCheckValue);
		checkValueInArray(scanner.nextInt(), arrayToCheckValue);


		//		4.2 Generate array, sort and print
		/*
		int[] arrayToSortAscAndPrint = intArrayGenerator(10);
		arrayPrinter(arrayToSortAscAndPrint);
		ascendingSortIntArray(arrayToSortAscAndPrint);
		arrayPrinter(arrayToSortAscAndPrint);
		*/

		//		4.3 Descending sorting of array
/*
		int[] arrayToSortDescAndPrint = intArrayGenerator(10);
		arrayPrinter(arrayToSortDescAndPrint);
		descendingSortIntArray(arrayToSortDescAndPrint);
		arrayPrinter(arrayToSortDescAndPrint);
*/

		//		4.4 get index of input number
/*
		int[] arrayToQueryValue = intArrayGenerator(10);
		arrayPrinter(arrayToQueryValue);
		getIndexOfQueriedNumber(scanner.nextInt(), arrayToQueryValue);
*/

		//		4.5 Generate matrix, print it, find max value
/*
		int[][] matrixToCheckTheMaxValue = intMatrixGenerator(10, 15);
		matrixPrinter(matrixToCheckTheMaxValue);
		System.out.println(intMatrixMaxValue(matrixToCheckTheMaxValue));

*/
		//		4.6 Generate matrix, print it, input the number of row, output the sum of elements of that row
/*
		int[][] matrixToPrintTheSumOfRow = intMatrixGenerator(10, 15);
		matrixPrinter(matrixToPrintTheSumOfRow);
		int rowNumber = scanner.nextInt();
		System.out.println(sumOfRowValuesInMatrix(rowNumber, matrixToPrintTheSumOfRow) == -1 ? "Wrong input" : sumOfRowValuesInMatrix(rowNumber, matrixToPrintTheSumOfRow));
*/
		//		4.7 Rotate matrix 90 clockwise;
/*
		int[][] matrixToRotateClockwise = intMatrixGenerator(4, 5);
		matrixPrinter(matrixToRotateClockwise);
		System.out.println("*********");
		matrixPrinter(rotateMatrixClockWise(matrixToRotateClockwise));
*/

		//		4.8 rotate 180
/*
		int[][] matrixToRotateUsideDown = intMatrixGenerator(4, 5);
		matrixPrinter(matrixToRotateUsideDown);
		System.out.println("*********");
		matrixPrinter(turnMatrixUpsideDown(matrixToRotateUsideDown));
*/

		//		4.9 rotate 270
/*
		int[][] matrixToRotateCounterClockWise = intMatrixGenerator(10, 15);
		matrixPrinter(matrixToRotateCounterClockWise);
		System.out.println("*********");
		matrixPrinter(rotateMatrixCounterClockWise(matrixToRotateCounterClockWise));
*/
		//		4.10 rotate
/*
		int[][] matrixToRotate = intMatrixGenerator(2, 3);
		matrixPrinter(matrixToRotate);
		matrixCustomRotateBy(matrixToRotate);
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

	public static void arrayPrinter(int[] array) {
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

	public static void matrixPrinter(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			arrayPrinter(matrix[i]);
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

}
