package com.System;

public class SmartThermostat implements iSmartThermostat {

	protected int temperature;
	protected boolean isON = true;

	public SmartThermostat(int temperature) {

		this.temperature = temperature;
	}

	@Override
	public void turnOn() {

		if (isON = true) {
			System.out.println("Thermostat Turned On");
		} else {
			System.out.println("Thermostat Turned Off");

		}
	}

	@Override
	public void turnOff() {
		if (isON = false) {
			System.out.println("Thermostat Turned On");
		} else {
			System.out.println("Thermostat Turned Off");
		}
	}

	@Override
	public void setTemperature(int temperature) {

		this.temperature = temperature;

	}

	public int getTemperature() {
		return temperature;
	}

	@Override
	public String toString() {
		return "SmartThermostat [temperature=" + temperature + "]";
	}

}
