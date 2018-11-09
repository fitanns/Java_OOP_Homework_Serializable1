package com.gmail.fitanns;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Group ED_112 = new Group();
		ED_112.addHuman("Pinchuk", 21, 'm');
		ED_112.addHuman("Kovbasa", 21, 'm');
		ED_112.addHuman("Iskrizhickiy", 21, 'm');

		Group BEM_14 = new Group();
		BEM_14.addHuman("Pinchuk", 21, 'm');
		BEM_14.addHuman("Poleshko", 22, 'm');
		BEM_14.addHuman("Stepanchuk", 22, 'm');

		Group MgIT1_18 = new Group();
		MgIT1_18.addHuman("Pinchuk", 21, 'm');
		MgIT1_18.addHuman("Vostokova", 21, 'j');
		MgIT1_18.addHuman("Gula", 21, 'm');

		File a = new File("Ed.doc");
		try {
			a.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}

		File b = new File("Bem.doc");
		try {
			b.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
		File c = new File("Mgit.doc");
		try {
			c.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}

		try (ObjectOutputStream abc = new ObjectOutputStream(new FileOutputStream(a))) {
			abc.writeObject(ED_112);
		} catch (IOException e) {
			System.out.println("Error write group");
		}

		try (ObjectOutputStream dce = new ObjectOutputStream(new FileOutputStream(b))) {
			dce.writeObject(BEM_14);
		} catch (IOException e) {
			System.out.println("Error write group");
		}

		try (ObjectOutputStream zxc = new ObjectOutputStream(new FileOutputStream(c))) {
			zxc.writeObject(MgIT1_18);
		} catch (IOException e) {
			System.out.println("Error write group");
		}

		Group graduatedEd112 = null;
		Group graduatedBem14 = null;
		Group graduatedMgit118 = null;

		try (ObjectInputStream asd = new ObjectInputStream(new FileInputStream(a))) {
			graduatedEd112 = (Group) asd.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error read group");
		}

		try (ObjectInputStream xza = new ObjectInputStream(new FileInputStream(b))) {
			graduatedBem14 = (Group) xza.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error read group");
		}

		try (ObjectInputStream qwe = new ObjectInputStream(new FileInputStream(c))) {
			graduatedMgit118 = (Group) qwe.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error read group");
		}

		graduatedEd112.printGroup();
		System.out.println();
		graduatedBem14.printGroup();
		System.out.println();
		graduatedMgit118.printGroup();
	}
}
