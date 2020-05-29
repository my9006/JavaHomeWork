package com.company.shapes;

public class Trangle {
	int sideA;
	int sideB;
	int sideC;

	public Trangle(int sideA, int sideB, int sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public Trangle() {
	}

	public int getSideA() {
		return sideA;
	}

	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

	public int getSideC() {
		return sideC;
	}

	public void setSideC(int sideC) {
		this.sideC = sideC;
	}

	public int calculatePerimeterOfTriangle() {
		return sideA + sideB + sideC;
	}

	public double calculateAreaOfTriangle() {
		int s = (sideA + sideB + sideC) / 2;
		return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	}


}
