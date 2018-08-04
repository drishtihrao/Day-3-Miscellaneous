package com.cg.miscellaneous.triangle;
/*
 * This class is used to check the type of a triangle
 * Based on the length of sides, there are four possible types of triangles
 * In Scalene triangle, all sides are unequal
 * In Equilateral triangle, all sides are equal
 * In Right Triangle, the square of one side of triangle is equal to the sum of squares of other two sides
 * In Iscosceles triangle, any two sides have equal lengths
 */
public class Triangle {
	private int side1;
	private int side2;
	private int side3;
	boolean flag = false;

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public int getSide3() {
		return side3;
	}

	public void setSide3(int side3) {
		this.side3 = side3;
	}

	public boolean isRight(Triangle triangle) {
		if ((Math.pow(triangle.getSide1(), 2) == Math.pow(triangle.getSide2(), 2) + Math.pow(triangle.getSide3(), 2))
				|| (Math.pow(triangle.getSide2(), 2) == Math.pow(triangle.getSide1(), 2)
						+ Math.pow(triangle.getSide1(), 3))
				|| (Math.pow(triangle.getSide3(), 2) == Math.pow(triangle.getSide2(), 2)
						+ Math.pow(triangle.getSide1(), 2))) {
			flag = true;
		} else
			flag = false;
		return flag;
	}

	public boolean isIsosceles(Triangle triangle) {
		if (triangle.getSide1() == triangle.getSide2() || triangle.getSide1() == triangle.getSide3()
				|| triangle.getSide2() == triangle.getSide3()) {
			flag = true;
		} else
			flag = false;
		return flag;
	}

	public boolean isScalene(Triangle triangle) {
		if (triangle.getSide1() != triangle.getSide2() && triangle.getSide1() != triangle.getSide3())
			flag = true;
		else
			flag = false;
		return flag;
	}

	public boolean isEquilateral(Triangle triangle) {
		if (triangle.getSide1() == triangle.getSide2() && triangle.getSide1() == triangle.getSide3())
			flag = true;
		else
			flag = false;
		return flag;
	}

}
