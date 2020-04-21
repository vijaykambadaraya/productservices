package com.vijay.product.bo;

import com.vijay.product.dto.Product;

public interface ProductBO {

	public void create(Product product);
	
	public Product findProduct(int id);
}
