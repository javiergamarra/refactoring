package com.nhpatt.refactoring;

public class ChildrensPrice extends Price {

	@Override
	public double getCharge(final int daysRented) {
		double result = 1.5;
		if (daysRented > 3) {
			result += (daysRented - 3) * 1.5;
		}
		return result;
	}

}
