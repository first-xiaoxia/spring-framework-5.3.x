package com.nj.design.pattern.bridge;

public class ReadDrawCircle implements DrawCircleApi{
	/**
	 * 画一个红色的圆
	 */
	@Override
	public void draw(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color:red ,radius:"+radius + " x:" + x + " y:" + y + " ]");
	}
}
