package com.company.converterUtils;

public class CurrencyConverter {
	private double dollarToDram = 483.7;
	private double dollarToEur = 0.9;
	private double dollarToRub = 70.37;
	private double eurToRub = 78.08;
	private double eurToDram = 536.93;
	private double dramToRub = 0.15;

	public double convertDollarToEuro(int dollar) {
		return dollar * dollarToEur;
	}

	public double convertDollarToDram(int dollar) {
		return dollar * dollarToDram;
	}

	public double convertDollarToRuble(int dollar) {
		return dollar * dollarToRub;
	}

	public double convertEuroToDollar(int euro) {
		return euro / dollarToEur;
	}

	public double convertEuroToDram(int euro) {
		return euro * eurToDram;
	}

	public double convertEuroToRuble(int euro) {
		return euro * eurToRub;
	}

	public double convertDramToDollar(int dram) {
		return dram / dollarToDram;
	}

	public double convertDramToEuro(int dram) {
		return dram / eurToDram;
	}

	public double convertDramToRuble(int dram) {
		return dram * dramToRub;
	}

	public double convertRubleToDollar(int rub) {
		return rub / dollarToRub;
	}

	public double convertRubleToEuro(int rub) {
		return rub / eurToRub;
	}

	public double convertRubleToDram(int rub) {
		return rub / dramToRub;
	}
}