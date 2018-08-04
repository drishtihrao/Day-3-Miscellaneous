package com.cg.miscellaneous.country;
/*
 * This is a class which takes area and population of a country and calculates the population density of that country
 * The user can also compare the population densities of two countries
 */
public class CountryDensityCalculator {
	private String countryName;
	private double area;
	private double population;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	//defining a method to compare the area of countries and determining the country with largest area
	public String largestArea(int num, CountryDensityCalculator country[]) {
		int i, flag = 0;
		double maxArea = country[0].getArea();
		for (i = 0; i < num; i++) {
			if (country[i].getArea() > maxArea) {
				maxArea = country[i].getArea();
				flag = i;
			}
		}
		return country[flag].getCountryName();
	}

	//defining a method to compare the population of countries and determining the country with largest population
	public String largestPopulation(int num, CountryDensityCalculator country[]) {
		int i, flag = 0;
		double maxPopulation = country[0].getPopulation();
		for (i = 0; i < num; i++) {
			if (country[i].getPopulation() > maxPopulation) {
				maxPopulation = country[i].getPopulation();
				flag = i;
			}
		}
		return country[flag].getCountryName();
	}

	//defining a method to compare the population density of countries and determining the country with largest population density
	public String largestDensity(int num, CountryDensityCalculator country[]) {
		int i, flag = 0;
		double maxDensity = (country[0].getPopulation() / country[0].getArea());
		for (i = 0; i < num; i++) {
			if ((country[i].getPopulation() / country[0].getArea()) > maxDensity) {
				maxDensity = (country[i].getPopulation() / country[0].getArea());
				flag = i;
			}
		}
		return country[flag].getCountryName();
	}

	@Override
	public String toString() {
		return "CountryName =" + countryName + ", area =" + area + ", population =" + population + ".";
	}
}
