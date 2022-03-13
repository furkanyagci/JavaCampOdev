import java.util.ArrayList;
import java.util.List;

public class EgitmenManager {
	List<Egitmen> egitmenler = new ArrayList<Egitmen>();
	
	public void add(Egitmen kurs) {
		egitmenler.add(kurs);
	}
	
	public String getById(int id){
		String egitmenim = egitmenler.get(id -1).firstName + " " + egitmenler.get(id -1).lastName;
		return egitmenim;
	}
	
	public List<Egitmen> getAll(){
		return egitmenler;
	}
}
