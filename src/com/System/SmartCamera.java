package com.System;

public class SmartCamera implements iSmartCamera {
	
	protected int brightness;
	protected boolean isON=true;
	protected boolean recording;
	

	public SmartCamera(int brightness) {
		
		this.brightness = brightness;
	}

	@Override
	public void turnOn() {
		if(isON=true) {
		System.out.println("Camera Turned On");
		}else {System.out.println("Camera is false");
	}
	}
	@Override
	public void turnOff() {
		if(isON=false) {
		System.out.println("Camera Turned On");
		}else{	System.out.println("Camera Turned Off");
	}
	}
	
	@Override
	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
	
	public int getBrightness() {
		return brightness;
	}
	@Override
	public void turnOnRecording() {
		recording=true;
		System.out.println("Recording has been Started");
	}
	@Override
	public void turnOffRecording() {
		recording=false;
		System.out.println("Recording has been Stopped");
	}


	@Override
	public String toString() {
		return "SmartCamera [brightness=" + brightness + "]";
	}
	
	
	

}
