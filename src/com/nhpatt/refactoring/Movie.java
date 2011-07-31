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

}
