package com.training.java.fundamental.object;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       Gudang g = new Gudang("2","Kursi","10");
       System.out.println("Kode = "+g.getKode()+" Nama Barang = "+ g.getNama()+" Kapasitas = "+ g.getKapasitas());
       
       g.setKode("1");
       g.setNama("Meja Belajar");
       g.setKapasitas("10");
       
       System.out.println("Kode = "+g.getKode()+" Nama Barang = "+ g.getNama()+" Kapasitas = "+ g.getKapasitas());
		
	}

}
