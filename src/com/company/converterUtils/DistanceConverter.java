package com.company.converterUtils;

public class DistanceConverter {
	private double mileToMeterCoefficient = 1609.34;

	public double convertMetersToMiles(int meters){
		return meters/mileToMeterCoefficient;
	}

	public double convertMilesToMeters(int miles){
		return miles*mileToMeterCoefficient;
	}

}
