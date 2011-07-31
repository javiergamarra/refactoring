package com.nhpatt.refactoring;

public class Movie {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private final String title;
	private Price price;

	public Movie(final String title, final int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
	}

	public String getTitle() {
		return title;
	}

	public void setPriceCode(final int priceCode) {
		switch (priceCode) {
		case REGULAR:
			price = new RegularPrice();
			break;
		case CHILDRENS:
			price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		default:
			break;
		}
	}

	double getCharge(final int daysRented) {
		return price.getCharge(daysRented);
	}

	int getPoints(final int daysRented) {
		return price.getPoints(daysRented);
	}

}
