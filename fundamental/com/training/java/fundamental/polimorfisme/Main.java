package com.training.java.fundamental.polimorfisme;

public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		ContactDao contactDao = new ContactDaoDatabases();
		ContactDao contactTxt = new ContactDaoText();
		
		Gudang g = new Gudang();
		g.setKode("12345");
	
		contactDao.saveGudang(g);
		contactTxt.saveGudang(g);
		

	}

}
