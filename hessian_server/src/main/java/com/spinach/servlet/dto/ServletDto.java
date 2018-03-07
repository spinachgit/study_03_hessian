package com.spinach.servlet.dto;

import java.io.Serializable;

/**
 * Created by lepdou on 14-12-19.
 */
public class ServletDto implements Serializable {
	private String name;
	private String value;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "UserDTO{" + "name='" + name + '\'' + ", age=" + age + ", value=" + value+'}';
	}
}
