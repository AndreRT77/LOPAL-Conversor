package br.dev.andre.temperatura.model;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Temperatura {

	private double celsius;

	
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

// Cálculo para converter graus celsius em fahrenheit
	public double converterFahrenheit(){
		double Fahrenheit = celsius * 1.8 + 32;
		return Fahrenheit;
	}
// Cálculo para converter graus celsius em kelvin
	public double converterKelvin(){
		double Kelvin = celsius + 273.15;
		return Kelvin;
		
	}


	public String[] mostrarTemperatura() {
		return null;
	}
}
