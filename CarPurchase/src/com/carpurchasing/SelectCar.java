package com.carpurchasing;

import java.util.*;

public class SelectCar implements SelectCarInterFace {

	@Override
	public void selectCar() {
		System.out.println("Enter the car name you want to buy");
		String carWant = MainClass.scan.next();
		System.out.println();
		if (CarObjects.map.containsKey(carWant)) {
			System.out.println("RECEIPT");
			System.out.println();
			System.out.print("Thank you, You have purchased " + carWant + " company car and cost is ");
			System.out.print(CarObjects.map.remove(carWant));
			System.out.println();
		} else {
			System.out.println("Sorry Car does not exists, please try another car");
			System.out.println();
			SelectCar select = new SelectCar();
			select.selectCar();
		}
		System.out.println();
		System.out.println("The Reamining cars are");
		System.out.println();
		for (Map.Entry m : CarObjects.map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
			System.out.println();
		}
		ContinuePurchase buymoreobj = new ContinuePurchase();
		buymoreobj.continuePurchase();

	}
}
