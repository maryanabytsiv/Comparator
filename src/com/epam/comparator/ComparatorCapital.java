package com.epam.comparator;

import java.util.Comparator;

public class ComparatorCapital implements Comparator<CountryCapital> {

	@Override
	public int compare(CountryCapital c1, CountryCapital c2) {
		return c1.getCapital().compareTo(c2.getCapital());
	}

}
