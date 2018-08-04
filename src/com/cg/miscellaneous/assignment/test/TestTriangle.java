package com.cg.miscellaneous.assignment.test;
/*
 * This class implements the methods defined in Triangle class and determines the type of the triangle
 */
import java.util.Scanner;

import com.cg.miscellaneous.triangle.Triangle;

public class TestTriangle {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//the length od the sides of the triangle is taken by the user
		System.out.println("How many triangles do you want to input?");
		int number = scanner.nextInt();

		Triangle triangle[] = new Triangle[number];

		for (int i = 0; i < number; i++) {
			triangle[i] = new Triangle();
			System.out.println("Enter the sides of triangle " + i);
			triangle[i].setSide1(scanner.nextInt());
			triangle[i].setSide2(scanner.nextInt());
			triangle[i].setSide3(scanner.nextInt());
		}

		//the conditions for each type is checked and the type is displayed
		for (int i = 0; i < number; i++) {
			if (triangle[1].isEquilateral(triangle[i]))
				System.out.println("The triangle with sides " + triangle[i].getSide1() + "," + triangle[i].getSide2()
						+ "," + triangle[i].getSide3() + " is equilateral triangle");

			else if (triangle[i].isIsosceles(triangle[i]))
				System.out.println("The triangle with sides " + triangle[i].getSide1() + "," + triangle[i].getSide2()
						+ "," + triangle[i].getSide3() + " is isosceles triangle");

			else if (triangle[i].isRight(triangle[i]))
				System.out.println("The triangle with sides " + triangle[i].getSide1() + "," + triangle[i].getSide2()
						+ "," + triangle[i].getSide3() + " is right angled triangle");

			else
				System.out.println("The triangle with sides " + triangle[i].getSide1() + "," + triangle[i].getSide2()
						+ "," + triangle[i].getSide3() + " is scalene triangle");
		}
	}
}
