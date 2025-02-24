package com.System;

abstract class SmartSystem implements iSmartDevice {
	
	protected int id;
	protected String name;
	public SmartSystem(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "SmartSystem [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
