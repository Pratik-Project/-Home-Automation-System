package com.System;

public class SmartLight implements iSmartLight{
	
	//public SmartSystem smartsystem;
	
	protected int brightness;
	protected String colour;
	protected boolean isOn=true;
	
	public SmartLight(int brightness, String colour) {
		
		this.brightness = brightness;
		this.colour = colour;
	}
	@Override
	public void turnOn() {
		
		if(isOn=true) {
			System.out.println("Light Turned On");
			}else {
				System.out.println("Light is off");
			}
	
	} 

	@Override
	public void turnOff() {
		if(isOn=true) {
		System.out.println("Light Turned Off");
		}else {
			System.out.println("Light is ON");
		}
	}

	@Override
	public void setBrightness(int brightness) {
		this.brightness = brightness;
		
	}

	@Override
	public void setColour(String colour) {
		
		this.colour=colour;
		
		
	}
	@Override
	public String toString() {
		return "SmartLight [brightness=" + brightness + ", colour=" + colour + "]";
	}

	
	
	
	

}
