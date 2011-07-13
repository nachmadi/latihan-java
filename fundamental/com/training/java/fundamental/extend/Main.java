package com.training.java.fundamental.extend;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s =new Student();
		s.setJenisKelamin(true);
		s.setNama("Ilyas");
		s.setNoInduk("123");
		
		System.out.println(s.getNama()+" "+s.isJenisKelamin()+" "+s.getNoInduk());
		
	}

}
