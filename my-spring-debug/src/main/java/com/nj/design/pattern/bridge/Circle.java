package com.nj.design.pattern.bridge;

public class Circle extends AbstractDrawCircle{

	private int radius,x,y;

	public Circle(DrawCircleApi drawCircleApi, int radius, int x, int y) {
		super(drawCircleApi);
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	@Override
	void draw() {
		drawCircleApi.draw(radius,x,y);
	}
}
