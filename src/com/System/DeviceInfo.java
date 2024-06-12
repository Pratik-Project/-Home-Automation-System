package com.System;

public class DeviceInfo extends SmartSystem {

	public String device;
	public SmartSystem firstDevice;
	public SmartSystem secondDevice;
	
	public DeviceInfo(int id, String name) {
		super(id, name);
		
	}

	public String addDevice(String device) {

		return device;

	}

	public void showNewDevices() {

		if (device != null) {
			System.out.println(device);

		}

	}

	
	public void addDevice1(SmartSystem device) {
        this.firstDevice = firstDevice;
    }
    
    public void addDevice2(SmartSystem device) {
        this.secondDevice = secondDevice;
    }
	
	
	public SmartSystem getDevice(SmartSystem device) {
		
		
		return firstDevice;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub

	}

}
