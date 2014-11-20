package de.oose.inner.point;

import java.awt.Point;

public class Overwrite {
	public static void main(String[] args) {
		Point p = new Point(10, 12) {
			@Override
			public String toString() {
				return String.format("(%d, %d)", x, y);
			}
		};

		System.out.println(p); // (10,12)
	}
}
