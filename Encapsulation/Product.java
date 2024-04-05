package Encapsulation;

public class Product {

	private int id;
	private String ProductName;
	private float Price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
			
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", ProductName=" + ProductName + ", Price=" + Price + "]";
	}
	public static void main(String[] args) {
		Product product=new Product();
		product.setId(101);
		product.setProductName("Iphone");
		product.setPrice(50000);
		
		System.out.println(product);

		
		
	}
}	
	


