import java.util.ArrayList;
import java.util.List;

public class KategoriManager {
	List<Kategori> kategoriler = new ArrayList<Kategori>();
	
	public void add(Kategori kategori) {
		kategoriler.add(kategori);
	}
	
	public String getById(int id){
		String egitmenim = kategoriler.get(id -1).name;
		return egitmenim;
	}
	
	public List<Kategori> getAll(){
		return kategoriler;
	}
}
