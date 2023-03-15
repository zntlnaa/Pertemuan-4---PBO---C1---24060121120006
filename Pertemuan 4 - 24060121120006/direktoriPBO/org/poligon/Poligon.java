/**
* File : Poligon.java 15/03/2023
* Penulis : Zenit Laena Fathonah
* Deskripsi : Representasi dasar dari Poligon
*/

package org.poligon;

public class Poligon{
	protected int jumlahSisi;
	
	/*konstruktor*/
	public Poligon(){
		this.jumlahSisi = 0;
	}
	
	public void setJumlahSisi(int jumlahSisi){
		this.jumlahSisi = jumlahSisi;
	}

	public int getJumlahSisi(){
		return this.jumlahSisi;
	}

}