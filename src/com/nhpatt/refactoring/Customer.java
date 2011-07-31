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
		String result = "Rental Record for " + getName() + "\n";
		for (final Rental rental : rentals) {
			result += "\t" + rental.getMovie().getTitle() + "\t"
					+ String.valueOf(rental.getCharge()) + "\n";
		}
		result += "Amount owed is " + getTotalAmount().toString() + "\n";
		result += "You earned "
				+ String.valueOf(getTotalFrequentRenterPoints())
				+ " frequent renter points";
		return result;
	}

	public Double getTotalAmount() {
		Double totalAmount = 0D;
		for (final Rental rental : rentals) {
			totalAmount += rental.getCharge();
		}
		return totalAmount;
	}

	public int getTotalFrequentRenterPoints() {
		int totalPoints = 0;
		for (final Rental rental : rentals) {
			totalPoints += rental.getFrequentRenterPoints();
		}
		return totalPoints;
	}

}
