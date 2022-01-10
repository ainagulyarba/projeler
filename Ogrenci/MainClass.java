package javaProjects.OgrenciIsleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	static List<Ogrenci> ogrenciKaydi = new ArrayList<>();

	static Scanner scan = new Scanner(System.in);

	static int ogrenciNo = 100;

	public static void main(String[] args) {

		anaMenu(ogrenciKaydi);

	}

	public static void anaMenu(List<Ogrenci> ogrenciKaydi) {

		System.out.println("========OGRENCI KAYDI========\n1-Ogrenci Kaydi\n2-Ogrenci Listeleme"

				+ "\n3-Ogrenci Kayit Silme\n0-Cikis");

		System.out.println("Isleminizi seciniz: ");

		int secim = scan.nextInt();

		switch (secim) {

		case 1:
			ogrenciKaydi(ogrenciKaydi);
			break;

		case 2:
			ogrenciListeleme(ogrenciKaydi);
			break;

		case 3:
			ogrenciKayitSilme(ogrenciKaydi);
			break;

		case 0:
			cikis();
			break;
			
		default:

			System.out.println("Yanlis giris yaptiniz. Tekrar deneyin.");
			anaMenu(ogrenciKaydi);
			break;
		}

	}

	public static void cikis() {

		System.out.println(" =======Hoscakalin====== ");

	}

	private static void ogrenciKayitSilme(List<Ogrenci> ogrenciKaydi) {

		System.out.println("Silinecek ogrenci No'ya giriniz: ");

		int silinecekNo = scan.nextInt();

		for (Ogrenci ogrenci : ogrenciKaydi) {

			if (ogrenci.getOgrenciNo() == silinecekNo) {

				ogrenciKaydi.remove(ogrenci);

				ogrenciListeleme(ogrenciKaydi);

				anaMenu(ogrenciKaydi);
			}

		}

		System.out.println("Silinecek ogrenci No bulunamadi");
		anaMenu(ogrenciKaydi);
	}

	
	public static void ogrenciListeleme(List<Ogrenci> ogrenciKaydi) {

		System.out.println("Ogrenci No\t Ogrenci Adi\t Ogrenci Soyadi\t Ortalamasi");

		for (Ogrenci ogrenci : ogrenciKaydi) {

			System.out.println(ogrenci.toString());

		}

		anaMenu(ogrenciKaydi);
	}

	private static void ogrenciKaydi(List<Ogrenci> ogrenciKaydi) {

		System.out.println("Adinizi giriniz: ");
		scan.nextLine();// dummy
		String ogrenciAdi = scan.nextLine();

		System.out.println("Soyadinizi giriniz: ");
		String ogrenciSoyadi = scan.nextLine();

		System.out.println("Ilk notu giriniz: ");
		double not1 = scan.nextDouble();

		System.out.println("Ikinci notu giriniz: ");
		double not2 = scan.nextDouble();

		double ortalama = (not1 + not2) / 2;

		Ogrenci ogrenci = new Ogrenci(ogrenciNo++, ogrenciAdi, ogrenciSoyadi, ortalama);

		ogrenciKaydi.add(ogrenci);

		System.out.println("Ogrenci No\t Ogrenci Adi\t Ogrenci Soyadi\t Ortalamasi");

		System.out.println(ogrenci.toString());

		anaMenu(ogrenciKaydi);
	}

}
