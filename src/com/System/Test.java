package com.System;

public class Test {

	public static void main(String[] args) {

		iSmartLight s = new SmartLight(60, "Blue");

		s.turnOn();
		s.turnOff();

		System.out.println(s);
		s.setBrightness(14);
		s.setColour("yellow");
		System.out.println(s);

		iSmartThermostat t = new SmartThermostat(64);
		t.turnOn();
		t.turnOff();
		System.out.println(t);

		t.setTemperature(41);
		System.out.println(t);
		
		iSmartCamera c= new SmartCamera(60);
		
		c.turnOn();
		c.turnOff();
		System.out.println(c);
		c.setBrightness(46);;
		System.out.println(c);
		c.turnOnRecording();
		c.turnOffRecording();
		
		DeviceInfo device=new DeviceInfo(1, "Camera");
		System.out.println(device);
		device.addDevice("Mobile");
		device.showNewDevices();
		System.out.println(device);
		device.addDevice("laptop");
		device.getDevice(device);
		

	}

}
