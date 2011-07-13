package com.training.java.fundamental.implement;

public class PersonServiceImpl implements AppService{

	@Override
	public void callObject(Object o) {
		Person p = new Person();
		
		System.out.println(p.getNama());
		
	}
	

}
