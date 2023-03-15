/**
* File : Kubus.java 15/03/2023
* Penulis : Zenit Laena Fathonah
* Deskripsi : Representasi dasar dari Kubus
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;

	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}

	public double hitungLuasAlas(){
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi * panjangSisi;
	}
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi * panjangSisi * panjangSisi;
	}
}