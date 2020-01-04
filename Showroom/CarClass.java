package com.ankit;

public class CarClass {
	String name;
	int model;
	String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public CarClass(String name, int model, String color) {
		super();
		this.name = name;
		this.model = model;
		this.color = color;
	}
	@Override
	public String toString() {
		return "CarClass [name=" + name + ", model=" + model + ", color=" + color + "]";
	}
	
	
}
