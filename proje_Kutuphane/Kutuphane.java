package proje_Kutuphane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kutuphane {
	/*
	 * ====================PAZAR PROJEMIZ============================== bir kitapci
	 * icin program yazalim kitap no 1000'den baslayacak sirali no olsun program
	 * baslayinca menu isminde bir method calissin 1-kitap ekle 2-numara ile kitap
	 * goruntule 3-bilgi ile kitap goruntule 4-numara ile kitap sil 5-tum kitaplari
	 * listele 6-cikis
	 ************************************
	 * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
	 * yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer
	 * olmali yani bir list'te tutmamiz gerek 2-kitap numarasi 1000'den
	 * baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
	 * count=1000;
	 * 
	 * menu isminde bir method olusturmaliyim,
	 * 
	 * 3-kitap ekle diye bir method olusturmaliyim,
	 * 
	 * bu method farkli bir classda
	 * 
	 * 4-kullanicidan kitap adi yazar adi ve fiyat bilgileri istenmeli
	 */

	public int kitapNo;
	public String kitapAdi;
	public String yazarAdi;
	public double kitapFiyati;
	
	
	
	
	@Override
	public String toString() {
		return kitapNo + "    \t " + kitapAdi + " \t      " + yazarAdi + " \t      " + kitapFiyati;
	}




	public Kutuphane(int kitapNo, String kitapAdi, String yazarAdi, double kitapFiyati) {
		super();
		this.kitapNo = kitapNo;
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.kitapFiyati = kitapFiyati;
	}




	public Kutuphane() {
		
	}
	
	
	
	
	
	
	
}
