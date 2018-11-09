package com.gmail.fitanns;

import java.io.Serializable;

public class Group implements Serializable {

	private Human[] group;
	private static final long serialVersionUID = 1L;

	Group() {
		group = new Human[0];
	}

	public void addHuman(String name, int age, char sex) {
		Human[] a = new Human[group.length + 1];
		System.arraycopy(group, 0, a, 0, group.length);
		a[a.length - 1] = new Human(name, age, sex);
		group = a;
	}

	public void printGroup() {
		for (Human d : group) {
			System.out.println(d);
		}
	}
}
