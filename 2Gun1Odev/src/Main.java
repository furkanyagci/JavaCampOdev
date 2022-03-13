
public class Main {

	public static void main(String[] args) {
		Kurs kurs1 = new Kurs(1, 1, 1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JavaScript)","1,5 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.", 69.99);
		Kurs kurs2 = new Kurs(2, 2, 2, "Orcale Veri Taban�", "2 ay s�recek �cretsiz ve profesyonel bir veri taban� ��reniyoruz.", 59.99);
		
		KursManager kursManager = new KursManager();
		kursManager.add(kurs1);
		kursManager.add(kurs2);
		
		EgitmenManager egitmenManager = new EgitmenManager();
		Egitmen egitmen1 = new Egitmen(1,"Engin","Demiro�");
		Egitmen egitmen2 = new Egitmen(2,"Furkan","Ya�c�");
		
		egitmenManager.add(egitmen1);
		egitmenManager.add(egitmen2);
		
		Kategori kategori1 = new Kategori(1,"Programlama");
		Kategori kategori2 = new Kategori(2,"Veri taban�");
		
		KategoriManager kategoriManager = new KategoriManager();
		kategoriManager.add(kategori1);
		kategoriManager.add(kategori2);
		
		System.out.println("--- Kategoriler ---");
		for (Kategori kategori : kategoriManager.getAll()) {
			System.out.println(kategori.id + " - " + kategori.name);
		}
		
		System.out.println("--- E�itmenler ---");
		for (Egitmen egitmen : egitmenManager.getAll()) {
			System.out.println(egitmen.id + " - " + egitmen.firstName + " - " + egitmen.lastName);
		}
		
		System.out.println("--- Kurslar ---");
		
		for (Kurs kurs : kursManager.getAll()) {
			System.out.println(kurs.id + " - " + kurs.name + " - " + kategoriManager.getById(kurs.egitmenId) + " - " + egitmenManager.getById(kurs.egitmenId) + " - " + kurs.unitPrice +" tl" + " - " + kurs.description );
		}
		
	}
}
