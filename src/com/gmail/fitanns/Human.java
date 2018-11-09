package com.gmail.fitanns;

import java.io.Serializable;

public class Human implements Serializable {
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	char sex;
	public Human(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

}
