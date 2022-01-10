package proje_Market;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Market  {
	/*
	 * /* ====================PROJEMIZ=================================== ilk
	 * programa girildiginde bizi bir menu karsilasin bu secenekler 1 manav, 2
	 * sarkuteri, 3 market secimi gor , 4-urunleri listele ve 5-fiyatlari gelsin
	 * 
	 * Basrili Market alış-veriş programı. 1. Adım: Ürünler ve fiyatları içeren
	 * listeleri oluşturunuz. No Ürün Fiyat ==== ======= ========= 00 Domates 2.10
	 * TL , 01 Patates 3.20 TL , 02 Biber 1.50 TL , 03 Soğan 2.30 TL ,04 Havuç 3.10
	 * TL 05 Elma 1.20 TL 06 Muz 1.90 TL 07 Çilek 6.10 TL 08 Kavun 4.30 TL 09 Üzüm
	 * 2.70 TL 10 Limon 0.50 TL
	 * 
	 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz. 3.
	 * Adım: Kaç kg satın almak istediğini sorunuz. 4. Adım: Alınacak bu ürünü
	 * sepete ekleyiniz ve Sepeti yazdırınız. 5. Başka bir ürün alıp almak
	 * istemediğini sorunuz. 6. Eğer devam etmek istiyorsa yeniden ürün seçme
	 * kısmına yönlendiriniz. 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
	 * ödeme sonrasında programı bitiriniz
	 */
	static List<String> manav = new ArrayList<>(Arrays.asList("Domates ", "Patates", "Biber ", " Soğan", "Havuç ",
			"Elma  ", "Muz   ", "Çilek ", "Kavun ", "Üzüm  "));
	static List<String> sarkuteri = new ArrayList<>(Arrays.asList("Et ", "Kusbasi et", "Kemikli et", "Kemiksiz et",
			"Jambon", "Fume", "Kavurma", "Sucuk", "Pastirma", "Sosis"));
	static List<String> bakliyat = new ArrayList<>(Arrays.asList("Un ", "Makarna", "Seker", "Pirinc", "Bulgur", "Salca",
			"Nohut", "Fasulye", "Mercimek", "Sehriye"));

	static List<Double> fiyatlarManav = new ArrayList<>(
			Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70));
	static List<Double> fiyatlarSarkuteri = new ArrayList<>(
			Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70));
	static List<Double> fiyatlarBakliyat = new ArrayList<>(
			Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70));
	static Scanner scan = new Scanner(System.in);

	static List<String> sepetUrunleri = new ArrayList<>();
	static List<Double> sepetFiyatlari = new ArrayList<>();
	static List<Double> sepetKg = new ArrayList<>();

	static double toplamFiyat = 0;

	public static void main(String[] args) {
		anaMenu();
	}

	private static void anaMenu() {
		System.out.println(
				"===========Marketimize Hosgeldiniz==========\n1-Manav\n2-Sarkuteri\n3-Bakliyat\n4-Odeme\n5-Cikis");
		System.out.println("Seciminizi yapiniz:");
		int secim = scan.nextInt();
		System.out.println();

		switch (secim) {
		case 1:
			manav(manav, fiyatlarManav);
			break;
		case 2:
			sarkuteri(sarkuteri, fiyatlarSarkuteri);
			break;
		case 3:
			bakliyat(bakliyat, fiyatlarBakliyat);
			break;
		case 4:
			odeme(sepetFiyatlari);
			break;
		case 5:
			System.out.println("======Alis-veris icin tesekkurler.Tekrar bekleriz======");
			break;
		default:
			System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz.");
			anaMenu();
			break;
		}

	}

	private static void odeme(List<Double> sepetFiyatlari) {

		System.out.println("odemeniz gereken miktar : " + toplamFiyat);
		double nakit = 0;
		do {
			System.out.print("lutfen nakit odemenizi giriniz : ");
			nakit += scan.nextDouble();
			if (nakit < toplamFiyat) {
				System.out.println("eksik odeme yaptiniz " + (toplamFiyat - nakit) + " daha odeme yapiniz");
			}
		} while (nakit < toplamFiyat);

		double paraUstu = nakit - toplamFiyat;
		if (paraUstu > 0) {
			System.out.println("para ustunuz : " + paraUstu);
		}
		System.out.println("Tesekkurler. Yine bekleriz");
	}

	private static void bakliyat(List<String> bakliyat2, List<Double> fiyatlarBakliyat2) {
		System.out.println("======Bakliyat Urunlerimiz======");
		System.out.println(" No\t Urunler \t Fiyatlar");
		System.out.println("====\t ======== \t =======");
		System.out.println();

		for (int i = 0; i < bakliyat.size(); i++) {
			System.out.println(i + " \t   " + bakliyat.get(i) + "  \t   " + fiyatlarBakliyat.get(i));
		}
		
		String tercih = "";
		do {
			System.out.print("Sectiginiz urun kodunu giriniz : ");
			int urunNo = scan.nextInt();

			System.out.print("Kac kilo alacaksiniz : ");
			double kg = scan.nextDouble();
			sepetUrunleri.add(bakliyat.get(urunNo));
			sepetKg.add(kg);
			sepetFiyatlari.add(fiyatlarBakliyat.get(urunNo) * kg);
			for (Double fiyat : sepetFiyatlari) {
				toplamFiyat += fiyat;
			}
			System.out.println("Yanlis urun girdiniz");
			System.out.println("toplam odemeniz gereken miktar : " + toplamFiyat + " aliginiz urun miktari :" + sepetKg);

			System.out.println("alis-verise devam etmek isterseniz 'E'ye basiniz, istemiyorsaniz baska bir tusa basiniz");
			tercih = scan.next();
		}	while (tercih.equalsIgnoreCase("E"));
			anaMenu();
	}

	private static void sarkuteri(List<String> sarkuteri, List<Double> fiyatlarSarkuteri) {
		System.out.println("======Sarkuteri Urunlerimiz======");
		System.out.println(" No\t Urunler \t Fiyatlar");
		System.out.println("====\t ======== \t =======");
		System.out.println();
		for (int i = 0; i < sarkuteri.size(); i++) {
			System.out.println(i + "  \t   " + sarkuteri.get(i) + "  \t   " + fiyatlarSarkuteri.get(i));
		}

		String tercih = "";
		do {

			System.out.print("Sectiginiz urun kodunu giriniz : ");
			int urunNo = scan.nextInt();

			System.out.print("Kac kilo alacaksiniz : ");
			double kg = scan.nextDouble();
			sepetUrunleri.add(sarkuteri.get(urunNo));
			sepetKg.add(kg);
			sepetFiyatlari.add(fiyatlarSarkuteri.get(urunNo) * kg);
			for (Double fiyat : sepetFiyatlari) {
				toplamFiyat += fiyat;
			}
			System.out
					.println("toplam odemeniz gereken miktar : " + toplamFiyat + " aliginiz urun miktari :" + sepetKg);

			System.out
					.println("alis-verise devam etmek isterseniz 'E'ye basiniz, istemiyorsaniz baska bir tusa basiniz");
			tercih = scan.next();
		} while (tercih.equalsIgnoreCase("E"));
		anaMenu();
	}

	private static void manav(List<String> manav, List<Double> fiyatlarManav) {
		System.out.println("======Manav Urunlerimiz======");
		System.out.println(" No\t Urunler \t Fiyatlar");
		System.out.println("====\t ======== \t =======");
		System.out.println();

		for (int i = 0; i < manav.size(); i++) {
			System.out.println(i + "\t " + manav.get(i) + " \t " + fiyatlarManav.get(i));
		}

		String tercih = "";
		do {

			System.out.print("Sectiginiz urun kodunu giriniz : ");
			
				int urunNo = scan.nextInt();
				
				System.out.print("Kac kilo alacaksiniz : ");
				double kg = scan.nextDouble();
				sepetUrunleri.add(manav.get(urunNo));
				sepetKg.add(kg);
				sepetFiyatlari.add(fiyatlarManav.get(urunNo) * kg);
				for (Double fiyat : sepetFiyatlari) {
					toplamFiyat += fiyat;
				}
				System.out
						.println("toplam odemeniz gereken miktar : " + toplamFiyat + " aliginiz urun miktari :" + sepetKg);

				System.out
						.println("alis-verise devam etmek isterseniz 'E'ye basiniz, istemiyorsaniz baska bir tusa basiniz");
				tercih = scan.next();
				
		} while (tercih.equalsIgnoreCase("E"));
		anaMenu();

	}

}
