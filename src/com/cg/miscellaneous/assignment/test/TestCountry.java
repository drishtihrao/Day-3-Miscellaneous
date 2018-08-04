package com.cg.miscellaneous.assignment.test;
/*
 * This class calls the CountyDensityCalculator class to determine the population density of various countries
 * The area and population of the country is given as an input
 */
import java.util.Scanner;

import com.cg.miscellaneous.country.CountryDensityCalculator;

public class TestCountry {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of countries");
		int number = scanner.nextInt();

		CountryDensityCalculator country[] = new CountryDensityCalculator[number];

		for (int i = 0; i < number; i++) {
			country[i] = new CountryDensityCalculator();

			System.out.println("Enter country name");
			country[i].setCountryName(scanner.next());

			System.out.println("Enter country area");
			country[i].setArea(scanner.nextDouble());

			System.out.println("Enter country population");
			country[i].setPopulation(scanner.nextDouble());

		}

		//deternmining the countries with largest area, population and population density as per the user inputs and printing them
		System.out.println("Country with largest area is " + country[0].largestArea(number, country));
		System.out.println("Country with largest population is " + country[0].largestPopulation(number, country));
		System.out.println("Country with largest density is " + country[0].largestDensity(number, country));
	}
}
