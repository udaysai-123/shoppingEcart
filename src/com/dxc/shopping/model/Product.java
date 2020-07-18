package com.dxc.shopping.model;

public class Product {
	private String name;
	private float price;
	private int quantity;
	public Product(String name,float price,int quantity) {
		super();
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	
	}
	public String getName() {
		return name;
	}
  public float getPrice() {
	  return price;
  }
  public int getQuantity() {
	  return quantity;
  }
      
      public String toString() {
	  return name;
	   }
}
