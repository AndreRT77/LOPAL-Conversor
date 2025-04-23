package br.dev.andre.temperatura.model;

public class Temperatura {

	private double celsius;

	
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}


	public double converterFahrenheit(){
		double Fahrenheit = celsius * 1.8 + 32;
		return Fahrenheit;
	}
	public double converterKelvin(){
		double Kelvin = celsius + 273.15;
		return Kelvin;
		
		
	}
}
