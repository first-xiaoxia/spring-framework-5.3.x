package com.nj.selfElement;

import lombok.Data;

import java.io.Serializable;

@Data
public class ValueSet implements Serializable {

	private String name;

	private String value;

	private Car car;
}
