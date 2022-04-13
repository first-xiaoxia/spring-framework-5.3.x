package com.nj.design.pattern.bridge;

public class BlueDrawCircle implements DrawCircleApi{
	/**
     * 画一个蓝色的圆
	 */
	@Override
	public void draw(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color:blue ,radius:"+radius + " x:" + x + " y:" + y + " ]");
	}
}
