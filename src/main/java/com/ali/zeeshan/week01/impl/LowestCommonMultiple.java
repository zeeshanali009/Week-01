package com.ali.zeeshan.week01.impl;

import com.ali.zeeshan.week01.iface.Function;

/**
 * This class will work as a method to find lowest common multiple.
 */
public class LowestCommonMultiple implements Function {
	/**
	 * This is the unary method
	 */
	public int compute(int a) {
		return a;

	}

	/**
	 * This is the binary method
	 */
	public int compute(int a, int b) {
		int x, y, t, lcm;
		x = a;
		y = b;

		while (y != 0) {
			t = y;
			y = x % y;
			x = t;
		}

		lcm = (a * b) / x;
		return lcm;
	}

	/**
	 * This is the ternary method
	 */
	public int compute(int a, int b, int c) {

		return compute(compute(a, b), c);

	}

	public static void main(String[] args) {

		LowestCommonMultiple o = new LowestCommonMultiple();
		int a = 25;
		int b = 10;
		int c = 40;
		System.out.println("The lcm according to the three methods are "
				+ o.compute(a) + ", " + o.compute(a, b) + " and "
				+ o.compute(a, b, c));
	}

}
