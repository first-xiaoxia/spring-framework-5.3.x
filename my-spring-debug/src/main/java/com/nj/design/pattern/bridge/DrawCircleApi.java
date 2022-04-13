package com.nj.design.pattern.bridge;

/**
 * 一个api用来执行draw的一个动作
 */
public interface DrawCircleApi {

	void draw(int radius, int x, int y);
}
