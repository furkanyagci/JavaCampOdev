package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bug?n hava ?ok g?zel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int toplam = topla(3,5);
		System.out.println(toplam);
		// Variable Arguments 
		int toplam2 = topla2(1,2,3,4,50);
		System.out.println(toplam2);
	}
	
	public static void ekle() {
		System.out.println("eklendi");
	}
	
	public static void sil() {
		System.out.println("silindi");
	}
	
	public static void guncelle() {
		System.out.println("g?ncellendi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar) {// Variable Arguments - Birden fazla de?er g?nderebiliyoruz.
		int toplam=0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}

}
