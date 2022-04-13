package com.nj.selfEditor;

import lombok.Data;

@Data
public class Address {

	private String province;
	private String city;

	private String town;

	@Override
	public String toString() {
		return "Address{" +
				"province='" + province + '\'' +
				", city='" + city + '\'' +
				", town='" + town + '\'' +
				'}';
	}
}
