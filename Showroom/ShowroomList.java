package com.ankit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ShowroomList {
	public static void main(String[] args) {
		CarClass car1 = new CarClass("Toyota",12,"Black-Olive");
		CarClass car2 = new CarClass("Itios",13,"Olive");
		CarClass car3 = new CarClass("Jazz",14,"Orange-Olive");
		CarClass car4 = new CarClass("WagonR",15,"Cucumber-Olive");
		
		HashMap<Integer,Showroom> cars=new HashMap<>();
		
		HashSet<CarClass> show1 = new HashSet<>();
		show1.add(car1);show1.add(car2);
		
		HashSet<CarClass> show2 = new HashSet<>();
		show2.add(car3);show2.add(car4);
		
		Showroom showroom1 = new Showroom("Highway-Honda",134,show1);
		Showroom showroom2 = new Showroom("Highway",135,show2);
		
		cars.put(showroom1.getId(), showroom1);
		cars.put(showroom2.getId(), showroom2);
		
		System.out.println("-----------------------");


		Set<Integer> keys=cars.keySet();
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext())
		{
			System.out.println(cars.get(itr.next()));
			

		}
		
	}
}
