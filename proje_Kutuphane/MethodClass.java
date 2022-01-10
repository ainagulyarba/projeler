package proje_Kutuphane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodClass {

	static List<Kutuphane> kitapci = new ArrayList<>();

	static Scanner scan = new Scanner(System.in);

	static int kitapNo = 1000;
	static boolean flag;

	public static void main(String[] args) {

		menu(kitapci);

	}

	public static void menu(List<Kutuphane> kitapci) {

		System.out.println("=============HOSGELDINIZ=============\n1-Kitap ekle \n2-Numara ile kitap goruntule "
				+ "\n3-Bilgi ile kitap goruntule \n4-Kitap sil \n5-Tum kitaplari listele \n6-Cikis");

		System.out.println("Seciminizi yapiniz: ");

		int secim = scan.nextInt();

		switch (secim) {
		case 1:
			kitapEkle(kitapci);
			break;
		case 2:
			numaraKitap(kitapci);
			break;
		case 3:
			bilgiKitap(kitapci);
			break;
		case 4:
			kitapSil(kitapci);
			break;
		case 5:
			kitapListele(kitapci);
			break;
		case 6:
			cikis();
			break;

		default:
			System.out.println("Yanlis secim yaptiniz.Tekrar deneyin");
			menu(kitapci);
			break;
			
		}

	}

	private static void cikis() {
		System.out.println("==================Gule Gule==========Yine Bekleriz===================");

	}

	private static void kitapListele(List<Kutuphane> kitapci) {
		System.out.println("Kitap No \tKitap Adi \tYazar Adi \tKitap Fiyati");
		for (Kutuphane kutuphane : kitapci) {
			System.out.println(kutuphane.toString());
		}
		menu(kitapci);
	}

	private static void kitapSil(List<Kutuphane> kitapci) {

		System.out.println("Silmek istediginiz kitap No giriniz: ");
		
		int silKitapNo =scan.nextInt();
		flag=true;
		for (Kutuphane kitap : kitapci) {
			if (kitap.kitapNo==silKitapNo) {
				kitapci.remove(kitap);
				flag=false;
				break;
			} 
		}
		if (flag) {
			System.out.println("Silinecek kitap No bulunamadi");
		}
		
		kitapListele(kitapci);
		menu(kitapci);
	}

	private static void bilgiKitap(List<Kutuphane> kitapci) {

		System.out.println("Kitap Adi giriniz:");
		scan.nextLine();
		String kitapIsmi = scan.nextLine();
		flag=true;
		for (Kutuphane kutuphane : kitapci) {

			if (kutuphane.kitapAdi.equalsIgnoreCase(kitapIsmi)) {
				flag=false;
				System.out.println("Kitap No \tKitap Adi \tYazar Adi \tKitap Fiyati");

				System.out.println(kutuphane.toString());
				break;
			}
		}
		if (flag) {
			System.out.println("Bu isimle kitap bulunamadi");
		}

		menu(kitapci);
	}

	private static void numaraKitap(List<Kutuphane> kitapci) {

		System.out.println("Kitap No giriniz:");

		int kitapNum = scan.nextInt();
		
		flag=true;
		
		for (Kutuphane kitap : kitapci) {

			if (kitap.kitapNo == kitapNum) {
				flag=false;
				System.out.println("Kitap No \tKitap Adi \tYazar Adi \tKitap Fiyati");
				System.out.println(kitap.toString());
			
			} 
		}
		if (flag) {
			System.out.println("Bu numarada kitap bulunamadi");
		
		}
			
		menu(kitapci);
	}

	private static void kitapEkle(List<Kutuphane> kitapci) {
		System.out.println("=============Kitap Ekle===============");
		System.out.println("Kitabin adini giriniz: ");
		scan.nextLine();
		String kitapAdi = scan.nextLine();

		System.out.println("Kitabin yazarini giriniz: ");
		String yazarAdi = scan.nextLine();

		System.out.println("Kitabin fiyatini giriniz: ");
		double kitapFiyati = scan.nextDouble();

		Kutuphane kitap = new Kutuphane(kitapNo++, kitapAdi, yazarAdi, kitapFiyati);
		kitapci.add(kitap);
		System.out.println("Kitap No  \tKitap Adi       \tYazar Adi      \tKitap Fiyati");
		System.out.println(kitap.toString());
		menu(kitapci);

	}

}