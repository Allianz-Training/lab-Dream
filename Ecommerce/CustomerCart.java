package Ecommerce;

import java.util.LinkedHashMap;


public class CustomerCart {
  private int cartQuantity;
  private String cartTitle;
  private static CustomerCart instance = null;

  private CustomerCart() {}

  public static CustomerCart getInstance() {
    if (instance == null) {
      instance = new CustomerCart();

    }
    return instance;
  }

  LinkedHashMap<String, Integer> shopCart = new LinkedHashMap<>();

  public void addItem(Product p) {
    // System.out.println(shopCart.containsKey(p));
    System.out.println("======Cart======");
    System.out.println(p.toString());
    if (shopCart.containsKey(p.getTitle())) {
      shopCart.put(p.getTitle(), shopCart.get(p.getTitle()) + 1);
    } else {
      shopCart.put(p.getTitle(), 1);
      System.out.println("First pick");
    }

  }

  public void removeItem(Product p) {
    if (shopCart.get(p.getTitle()) > 1) {
      shopCart.put(p.getTitle(), shopCart.get(p.getTitle()) - 1);
    } else {
      shopCart.remove(p.getTitle());
    }
  }

  public void clearCart() {
    shopCart.clear();
  }

  public void cartList() {
    System.out.println(shopCart);
    System.out.println("================");
  }



}
