import java.util.ArrayList;
import java.util.List;

public class KursManager {
	List<Kurs> kurslar = new ArrayList<Kurs>();
	
	public void add(Kurs kurs) {
		kurslar.add(kurs);
	}
	
	public List<Kurs> getAll(){
		return kurslar;
	}
	
	
}
