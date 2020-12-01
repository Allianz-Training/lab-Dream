package Ecommerce;


public class Product{
	private int quantity;
	private String title;
	//private int Id;
	private static Product instance = null;
	
	private Product() {}
	
	public static Product getInstance() {
		if (instance == null) {
			instance = new Product();
		}
		return instance;
	}	
	
	public Product(String titleInput,int quantityInput) {
		title = titleInput;
		quantity = quantityInput;
		//Id = IdInput;
		
	}
	public int getQuantity() {
	     return quantity;
	}
	 public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTitle() {
	     return title;
	}
	 public void setTitle(String title) {
		this.title = title;
	}
	 
	public String toString() {
		return " Title: " + title + " Quantity: " + quantity  ;
	}
	 
	
}
