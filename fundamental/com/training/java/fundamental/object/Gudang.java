/**
 * 
 */
package com.training.java.fundamental.object;

/**
 * @author nachmadi
 *
 */
public class Gudang {
	private String kode;
	private String nama;
	private String kapasitas;
	
	public Gudang(String kode, String nama, String kapasitas) {
		super(); // mengarah ke classnya sendiri
		this.kode = kode;
		this.nama = nama;
		this.kapasitas = kapasitas;
	}
	
	public String getKode() {
		return kode;
	}
	public void setKode(String kode) {
		this.kode = kode;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getKapasitas() {
		return kapasitas;
	}
	public void setKapasitas(String kapasitas) {
		this.kapasitas = kapasitas;
	}
	
}
