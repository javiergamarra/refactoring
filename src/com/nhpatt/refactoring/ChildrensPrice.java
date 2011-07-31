package com.nhpatt.refactoring;

public class ChildrensPrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}

}
