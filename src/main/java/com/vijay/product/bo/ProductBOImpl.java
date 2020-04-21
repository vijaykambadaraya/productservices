package com.vijay.product.bo;

import com.vijay.product.dao.ProductDAO;
import com.vijay.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private com.vijay.product.dao.ProductDAO dao;
	
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	public ProductDAO getDao() {
		return dao;
	}
	
	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}
}