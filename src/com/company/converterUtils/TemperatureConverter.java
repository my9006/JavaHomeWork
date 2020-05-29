package com.company.converterUtils;

public class TemperatureConverter {

	public double convertFarenheitToCelsius(int farenheit) {
		return (farenheit - 32) * 5 / 9;
	}

	public double convertCelsiusToFarenheit(int celsius) {
		return celsius * 9 / 5 + 32;
	}

	public double convertCelsiusToKelvin(int celsius) {
		return celsius + 273.15;
	}

	public double convertFarenheitToKelvin(int farenheit) {
		return convertFarenheitToCelsius(farenheit) + 273.15;
	}

	public double convertKelvinToCelsius(int kelvin) {
		return kelvin - 273.15;
	}

	public double convertKelvinToFarenheit(int kelvin) {
		return (kelvin - 273.15) * 9 / 5 + 32;
	}

}
