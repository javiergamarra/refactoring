package com.nhpatt.refactoring;

public class Movie {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private final String title;
	private int priceCode;

	public Movie(final String title, final int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(final int priceCode) {
		this.priceCode = priceCode;
	}

	double getCharge(final int daysRented) {
		double result = 0;
		// determine amounts for each line
		switch (getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (daysRented > 2) {
				result += (daysRented - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			result += daysRented * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (daysRented > 3) {
				result += (daysRented - 3) * 1.5;
			}
			break;
		}
		return result;
	}

	int getPoints(final int daysRented) {
		if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1) {
			return 2;
		}
		return 1;
	}

}
