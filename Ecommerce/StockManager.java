package Ecommerce;

import java.util.HashMap;

public class StockManager {
	private HashMap<Integer,Product>  productList = new HashMap<>();
	private CustomerCart customerCart = CustomerCart.getInstance();
	public Product product = Product.getInstance();
	//public StockManager(String productName, int productQuantity) {
	public StockManager() {
	}

	public void setStockInt() {
		
		Product watch = new Product("Rolex", 10);
		Product car = new Product("Lambogini", 100);
		Product shoes = new Product("Nike", 2000);
		
		productList.put(1, watch);
		productList.put(2, car);
		productList.put(3, shoes);
		
	}
	public HashMap<Integer,Product> getStockManager() {
		System.out.println(productList);
		return productList;
	}
	
	public Product getId(Integer inputedID) {
		//System.out.println("output="+productList.get(inputedID));
		return productList.get(inputedID);		
	}
	
	public void setStock() {
		
	}
	
	
	
	@Override
	public String toString() {
		return "StockManager [productList=" + productList + "]";
	}
	
	
	
}







