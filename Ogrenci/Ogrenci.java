package javaProjects.OgrenciIsleri;

public class Ogrenci {

	private int ogrenciNo;
	private String ogrenciAdi;
	private String ogrenciSoyadi; 
	private double ortalama;
	
	

	public Ogrenci (int ogrenciNo,String ogrenciAdi,String ogrenciSoyadi,double ortalama){
			this.ogrenciNo=ogrenciNo;
			this.ogrenciAdi=ogrenciAdi;
			this.ogrenciSoyadi=ogrenciSoyadi;
			this.ortalama=ortalama;
			
	}
	
	public Ogrenci () {
		
	}
	
	public int getOgrenciNo() {
		return ogrenciNo;
	}
	
	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}
	
	public String getOgrenciAdi() {
		return ogrenciAdi;
	}
	
	public void setOgrenciAdi(String ogrenciAdi) {
		this.ogrenciAdi = ogrenciAdi;
	}
	
	public String getOgrenciSoyadi() {
		return ogrenciSoyadi;
	}
	
	public void setOgrenciSoyadi(String ogrenciSoyadi) {
		this.ogrenciSoyadi = ogrenciSoyadi;
	}
	
	public double getOrtalama() {
		return ortalama;
	}
	
	public void setOrtalama(int ortalama) {
		this.ortalama = ortalama;
	}
	
	 @Override
	public String toString() {  //bu method obj fields'ini yazdirir.
		
		return ogrenciNo + "     \t      " +ogrenciAdi+"    \t       "
				+ogrenciSoyadi+"   \t     "+ortalama;
		
		
	}
	
	
}
