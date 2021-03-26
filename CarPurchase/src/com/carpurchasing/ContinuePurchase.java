package com.carpurchasing;

public class ContinuePurchase {
	public void continuePurchase() {
		System.out.println("Do you want to purchase more cars");
		System.out.println();
		System.out.println("Press Yes to buy more cars");
		String moreCars = MainClass.scan.next();
		System.out.println();
		if (moreCars.equalsIgnoreCase("yes")) {
			SelectCar select = new SelectCar();
			select.selectCar();
		} else {
			System.out.println("Thank you..!! Please visit Agian");
			System.exit(0);
		}

	}

}
