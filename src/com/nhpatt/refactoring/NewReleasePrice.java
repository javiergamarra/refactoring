package com.nhpatt.refactoring;

public class NewReleasePrice extends Price {

	@Override
	public double getCharge(final int daysRented) {
		return daysRented * 3;
	}

	@Override
	int getPoints(final int daysRented) {
		return daysRented > 1 ? 2 : 1;
	}

}
