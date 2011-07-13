package com.training.java.fundamental.polimorfisme;

public class ContactDaoText implements ContactDao {

	@Override
	public void saveGudang(Gudang g) {
		System.out.println("Simpan Gudang :" + g.getKode()+" ke Text ...!!!");

	}

}
