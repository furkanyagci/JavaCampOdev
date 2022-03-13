
public class Kurs {
	int id;
	int egitmenId;
	int kategoriId;
	String name;
	String description;
	double unitPrice;
	
	public Kurs(int id, int egtimenId, int kategoriId, String name, String description, double unitPrice) {
		this.id = id;
		this.egitmenId = egtimenId;
		this.kategoriId = kategoriId;
		this.name = name;
		this.description= description;
		this.unitPrice = unitPrice;
	}
	
}
