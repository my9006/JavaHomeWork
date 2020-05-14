package com.company;

import com.sun.deploy.util.ArrayUtil;
import com.sun.media.jfxmediaimpl.HostUtils;
import com.sun.tools.javac.util.ArrayUtils;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//	    1.1 sum of two numbers;
		Scanner scanner = new Scanner(System.in);
        /*TODO remove comment
        System.out.println("Enter first number -> Enter, then the second -> enter -> get the sum");
        System.out.println(scanner.nextInt()+scanner.nextInt());
        */

		//        1.2 Divide two number
        /*
        System.out.println("Enter first number -> Enter, then the second -> enter -> get the reult of division");
        System.out.println((float)scanner.nextInt()/scanner.nextInt());

         */
		//        1.3 result of equations
       /* System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+ -3*5/8);
        System.out.println(5 + 15/3*2-8%3);

        */
		//       1.4 Multiplication
       /* System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Inpiut the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber+"x"+secondNumber+"="+firstNumber*secondNumber);

        */
		//       1.5 Multiplication table
        /*
        System.out.println("Input the number to get the multiplication table");
        int inputNumber = scanner.nextInt();
        for (int i = 1; i <11 ; i++) {
            System.out.println(inputNumber+"x"+i+"="+inputNumber*i);
        }

         */
		//        1.6 Perimeter and area of circle
        /*
        System.out.print("Radius = ");
        double radius = scanner.nextDouble();
        System.out.println("Perimeter is - " + 2*Math.PI*radius);
        System.out.println("Area is - " + Math.PI*Math.pow(radius, 2));

         */
		//        1.7 Farenheit to Celsius
        /*
        System.out.print("Input degree in Farenheit: ");
        float farenheitDegree = scanner.nextFloat();
        System.out.println(farenheitDegree+" degree Fahrenheit is equal to " + (farenheitDegree-32)*5/9 + " in Celsius");
         */
		//        1.8 Inch to meter
        /*
        double inchToMeterConversionCoefficient = 0.0254;
        System.out.print("Input a value for inch: ");
        double inputInInches = scanner.nextDouble();
        System.out.println(inputInInches+ " inch is "+ inputInInches*inchToMeterConversionCoefficient + " meters");

         */
		//        1.9 Positive or negative (here 0 is considered as positive)
/*
        System.out.print("Input number: ");
        int inputNumber = scanner.nextInt();
        boolean isNumberPositive = inputNumber>=0;
        System.out.println("Number is "+ (isNumberPositive?"positive":"negative"));

 */

		//        1.10 greatest number among 3
        /*
        System.out.print("Input the 1st number: ");
        int firstNumber = scanner.nextInt();
        int max = firstNumber;
        System.out.print("Input the 2nd number: ");
        int secondNumber = scanner.nextInt();
        max = secondNumber>max?secondNumber:max;
        System.out.print("Input the 3rd number: ");
        int thirdNumber = scanner.nextInt();
        max = thirdNumber>max?thirdNumber:max;
        System.out.println("The greatest: " + max);
    */

		//        1.11 input 5 numbers get sum and average
        /*
        System.out.println("Input the 5 numbers: ");
        int accumulator = 0;
        for (int i = 0; i < 5; i++) {
            int temp = scanner.nextInt();
            accumulator+=temp;
        }
        System.out.println("The sum of 5 no is : "+accumulator);
        System.out.println("The Average is : "+(float)accumulator/5);

         */

		//        1.12 check even or odd
/*
        System.out.print("Input ");
        System.out.println(scanner.nextInt()%2==0?"Even":"Odd");
        scanner.close();
*/
		//        2.1 Generate 2 random numbers in range 10 - 100, calculate the sum, cast it to long.
		Random random = new Random();
        /*
        int min = 10;
        int max = 100;
        int number1 = random.nextInt(max-min)+min;
        int number2 = random.nextInt(max-min)+min;
        int sum = number1+number2;
        long longSum = sum;
        System.out.print(longSum);
         */
		//        2.2 even -> long, odd -> double
        /*
        int number1 = random.nextInt(100-10)+10;
        int number2 = random.nextInt(100-10)+10;
        int product = number1*number2;
        if(product%2==0){
            long longProduct =product;
            System.out.println(longProduct);
        }else{
            double doubleProduct = product;
            System.out.println(doubleProduct);
        }

         */
		//        2.3
        /*
        int randomNumber = random.nextInt(100-10)+10;
        System.out.println(String.valueOf(Math.pow(randomNumber, 2)));

         */
		//        2.4
		/*
        int inputNumber = scanner.nextInt();
        switch (inputNumber/100){
            case 0:
                System.out.println(String.valueOf(random.nextInt(50)));
            break;
            default:
                System.out.println(String.valueOf(random.nextInt(inputNumber-50)+50));;
        }

		 */

		//		2.5
		/*
		int randomInt1 = random.nextInt();
		int randomInt2 = random.nextInt();
		System.out.println("Please enter +, - or / to perform the action with two random numbers");
		switch (scanner.next()){
			case "+":
				System.out.println(randomInt1+randomInt2);
				break;
			case "-":
				System.out.println(randomInt1-randomInt2);
				break;
			case "/":
				System.out.println(randomInt1/randomInt2);
				break;
			default:
				System.out.println("Please enter +, - or /");
		}
*/
		//		2.6
		/*
		System.out.println("Input numbers from 1 to 7 and get corresponding day");
		switch(scanner.nextInt()){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Please enter values from 1-7");
		}

		 */

		//		2.7
		/*
		System.out.println("Input the name of the month to get number of days in it");

		switch (scanner.next()){
			case "January":
			case "March":
			case "May":
			case "July":
			case "August":
			case "October":
			case "December":
				System.out.println("31 days");
				break;
			case "April":
			case "June":
			case "September":
			case "November":
				System.out.println("30 days");
				break;
			case "February":
				System.out.println("Usually 28 days");
			default:
				System.out.println("Invalid month");
		}

		 */
		//		2.8
		/*
		int radius = 5;
		System.out.println("------------MENU-----------\n ---> enter 1 for calculating area of the circle\n---> enter 2 for calculating perimeter of the circle\n---> enter 3 for exit.");
		int choice = scanner.nextInt();
		switch (choice){
			case 1:
				System.out.println(Math.PI*Math.pow(radius, 2));
				break;
			case 2:
				System.out.println(2*Math.PI*radius);
			case 3: return;
			default:
				System.out.println("Invalid input");
		}

		 */

		//		3.1
		/*
		for (int i = 1; i <21 ; i++) {
			System.out.println(i);
		}

		 */
		//		3.2
		/*
		for (int i = 1; i <21 ; i++) {
			if(i%3==0)continue;
			System.out.println(i);
		}

		 */
		//		3.3
		/*
		for (int i = -20; i <61 ; i++) {
			if(i%2!=0) continue;
			System.out.println(i);
		}

		 */
		//		3.4
		/*
		for (int i = -20; i <= 60; i++) {
			if (i % 2 == 0) continue;
			System.out.println(i);
		}

		 */
		//		3.5
		/*
		int sumOfHundred = 0;
		for (int i = 0; i <= 100; i++) {
			sumOfHundred += i;
		}
		System.out.println(sumOfHundred);
		//		Gauss
		System.out.println(100 * (100 + 1) / 2);

		 */
		//		3.6
		/*
		int limit = 100;
		int firstNumber = 1;
		int lastNumber = limit-firstNumber;
		int difference = 2;
		int numberOfTerms = (lastNumber-firstNumber)/difference +1;
		int sumOfOdd = (firstNumber+lastNumber)*numberOfTerms/2;
		System.out.println(sumOfOdd);

		 */
		//		3.7
/*
		int lastNumber = 100;
		int firstNumber = 2;
		System.out.println((firstNumber+lastNumber)/2);

 */
		//		3.8
		/*
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum+=scanner.nextInt();
		}
		System.out.println(sum);
		System.out.println(sum/10);

		 */
		//		3.9
/*
		System.out.print("Input number of terms : ");
		int limit = scanner.nextInt();
		for (int i = 1; i <= limit; i++) {
			System.out.printf("Number is : %d and cube of the %d is : %d %n", i, i, (int)Math.pow(i,3));
		}

 */
		//3.10
		/*
		int input = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d %n", input, i, input*i);
		}

		 */
		//		3.11
		/*
		int numToCheck = scanner.nextInt();
		int invocationCount = (int) Math.sqrt(numToCheck) + 1;
		int divCount = 0;
		for (int i = 2; i < invocationCount; i++) {
			if (numToCheck % i == 0 && numToCheck != 2) {
				divCount++;
				break;
			}
		}
		if (divCount > 0||numToCheck<2) {System.out.printf("%d is not prime", numToCheck);
		} else {
			System.out.printf("%d is prime", numToCheck);}
			 */
		//3.12
/*
		int tillElement = scanner.nextInt();
		int fibonacciFirst = 0;
		int fibonacciNext = 1;
		String fibonacci = fibonacciFirst+" "+fibonacciNext;
		for (int i = 0; i < tillElement-2; i++) {
			int temp = fibonacciFirst+fibonacciNext;
			fibonacciFirst=fibonacciNext;
			fibonacciNext=temp;
			fibonacci=fibonacci+" "+temp;
		}
		switch (tillElement){
			case 1:
				System.out.println("0");
				break;
			case 2:
				System.out.println("0 1");
				break;
			default:
				System.out.println(fibonacci);
		}
*/
		//		3.13
		/*
		String in="ROBOTS_WILL_KILL_ALL_HUMANZ";
		String out = "";
		for (int i = 0; i < in.length(); i++) {
			out+=in.charAt(in.length()-i-1);
		}
		System.out.println(out);

		 */
		scanner.close();
	}
}
