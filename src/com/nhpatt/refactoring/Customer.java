package com.nhpatt.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private final String name;
	private final List<Rental> rentals = new ArrayList<Rental>();

	public Customer(final String name) {
		this.name = name;

	}

	public void addRental(final Rental arg) {
		rentals.add(arg);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		String result = "Rental Record for " + getName() + "\n";
		for (final Rental rental : rentals) {
			// add frequent renter points
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE
					&& rental.getDaysRented() > 1) {
				frequentRenterPoints++;
			}
			// show figures for this rental
			result += "\t" + rental.getMovie().getTitle() + "\t"
					+ String.valueOf(rental.getCharge()) + "\n";
			totalAmount += rental.getCharge();
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)
				+ " frequent renter points";
		return result;
	}

}
