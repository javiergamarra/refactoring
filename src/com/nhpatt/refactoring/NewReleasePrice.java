package com.nhpatt.refactoring;

public class NewReleasePrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

}
