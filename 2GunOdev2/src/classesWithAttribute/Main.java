package classesWithAttribute;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"laptop","Asus laptop",3000,2);
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		System.out.println(product.getName());
		
		ProductManager manager = new ProductManager();
		manager.Add(product);
	}

}
