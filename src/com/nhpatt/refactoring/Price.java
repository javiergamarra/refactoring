package com.nhpatt.refactoring;

abstract class Price {

	abstract double getCharge(final int daysRented);

	int getPoints(final int daysRented) {
		return 1;
	}

}
