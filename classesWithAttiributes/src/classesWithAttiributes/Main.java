package classesWithAttiributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		//Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"siyah");

		product.name="Laptop";
		product.setId(1);
		product.description="Asus Laptop";
		product.price=5000;
		product.stockAmount=3;
		product.
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
        System.out.println(product.getKod());
	}

}
