package com.company;

import com.company.machine.VendingMachine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.printCurrentBoard();
		System.out.println("_________________________________");
		System.out.println("What do you want from me?");
		Scanner scanner = new Scanner(System.in);

		System.out.println(vm.getProduct(scanner.next()).getClass().getSimpleName());
		System.out.println("_________________________________");
		vm.printCurrentBoard();
	}
}
