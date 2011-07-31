package com.nhpatt.refactoring;

public class Rental {

	private final Movie movie;
	private final int daysRented;

	public Rental(final Movie movie, final int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}

	double getCharge() {
		return movie.getCharge(daysRented);
	}

	int getFrequentRenterPoints() {
		return movie.getPoints(daysRented);
	}

}
