package com.nj.design.pattern.bridge;

public class DemoBridge {

	public static void main(String[] args) {
		Circle redC = new Circle(new ReadDrawCircle(),5,10,7);
		Circle blueC = new Circle(new BlueDrawCircle(),6,9,9);

		redC.draw();
		blueC.draw();
	}
}
