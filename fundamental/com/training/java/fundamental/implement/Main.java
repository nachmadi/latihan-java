package com.training.java.fundamental.implement;

public class Main {

	/**
	 * @param args
	 */
	static AppService appServ = new PersonServiceImpl();
	public static void main(String[] args) {
		Person p = new Person();
		p.setNama("noer");
		appServ.callObject(p);

	}

}
