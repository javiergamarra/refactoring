package com.nhpatt.refactoring;

public class Movie {

	private final String title;
	private Price price;

	public Movie(final String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public static Movie regular(final String title) {
		final Movie movie = new Movie(title);
		movie.price = new RegularPrice();
		return movie;
	}

	public static Movie childrens(final String title) {
		final Movie movie = new Movie(title);
		movie.price = new ChildrensPrice();
		return movie;
	}

	public static Movie newRelease(final String title) {
		final Movie movie = new Movie(title);
		movie.price = new NewReleasePrice();
		return movie;
	}

	double getCharge(final int daysRented) {
		return price.getCharge(daysRented);
	}

	int getPoints(final int daysRented) {
		return price.getPoints(daysRented);
	}

}
