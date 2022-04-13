package com.nj.design.pattern.adapter;

import java.io.*;

public class TestAdapter {
	public static void main(String[] args) throws IOException {
		//字节流
		InputStream is = new FileInputStream("path");
		//适配器
		InputStreamReader isr = new InputStreamReader(is);
		//字符流
		BufferedReader reader = new BufferedReader(isr);
		String line = reader.readLine();
		if (line != null && !"".equals(line)) {
			System.out.println(line);
		}
		reader.close();
		isr.close();
		is.close();
	}
}
