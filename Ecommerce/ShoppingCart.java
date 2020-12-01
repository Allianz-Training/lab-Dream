package Ecommerce;

import java.util.ArrayList;

import Ecommerce.Product;

public class ShoppingCart {
	private ArrayList<Product> productCart;
	private int productCount;
	private static Product temp;
	public ShoppingCart() {
		productCart = new ArrayList<Product>();
		productCount = 0;	
	}
	public void addToCart(String title, int quantity) {
		temp = new Product(title,quantity);
		productCart.add(temp);
		productCount += 1;
	}
	public void deleteFromCart(String title) {
		for(int i =0;i<productCart.size();i++) {
			if(productCart.get(i).getTitle().equalsIgnoreCase(title)) {
				productCart.get(i).quantity--;
				if(productCart.get(i).quantity<=0) {
					productCart.remove(i);
				}
			}
		}
	}
	
	@Override
	public String toString() {
		return "ShoppingCart [productCart=" + productCart + ", productCount=" + productCount + "]";
	}
	
}

