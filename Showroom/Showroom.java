package com.ankit;

import java.util.Set;

public class Showroom {

	String name;
	int id;
	Set<CarClass> carClass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<CarClass> getCarClass() {
		return carClass;
	}
	public void setCarClass(Set<CarClass> carClass) {
		this.carClass = carClass;
	}
	public Showroom(String name, int id, Set<CarClass> carClass) {
		super();
		this.name = name;
		this.id = id;
		this.carClass = carClass;
	}
	@Override
	public String toString() {
		return "[" + carClass + "]";
	}
	


}
