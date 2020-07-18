package com.dxc.shopping.service;

import com.dxc.shopping.exception.ProductException;
import com.dxc.shopping.model.Product;

public interface CartOperation {
	float getInvoiceAmount(); // method declaration or unimplemented method
	
	float addToCart(Product p);
	
	void removeFromCart(Product p)throws ProductException;
	int getProductContainerSize() ;
}


	


