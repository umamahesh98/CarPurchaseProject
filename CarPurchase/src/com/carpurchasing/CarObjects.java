package com.carpurchasing;

import java.util.*;

public class CarObjects {

	static LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();

	public static void availableCars() {
		map.put("Toyota", "9.20Lakhs");
		map.put("BMW", "65.50Lakhs");
		map.put("Audi", "70Lakhs");
		map.put("Chevrolet", "20Lakhs");
		map.put("Honda", "10.20Lakhs");
		map.put("Fiat", "25Lakhs");
		map.put("Ferari", "45Lakhs");
		map.put("Mercedes", "50Lakhs");
		map.put("Jaguar", "34.50Lakhs");
		map.put("Lamborgini", "98Lakhs");

		System.out.println("The Available cars are");
		System.out.println();
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
			System.out.println();
		}
		SelectCar select = new SelectCar();
		select.selectCar();
	}

}
