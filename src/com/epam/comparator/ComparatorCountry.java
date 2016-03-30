package com.epam.comparator;

import java.util.Comparator;

public class ComparatorCountry implements Comparator<CountryCapital> {

	@Override
	public int compare(CountryCapital c1, CountryCapital c2) {
		return c1.getCountry().compareTo(c2.getCountry());
	}

}
