package com.nj.design.pattern.bridge;

public abstract class AbstractDrawCircle {

	protected DrawCircleApi drawCircleApi;

	protected AbstractDrawCircle(DrawCircleApi drawCircleApi) {
		this.drawCircleApi = drawCircleApi;
	}

	abstract void draw();
}
