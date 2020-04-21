package com.vijay.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vijay.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("iphone");
		product.setDescription("a phone");
		product.setPrice(1000);
		dao.create(product);
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("iphone",result.getName());
		//assertEquals("Iphone",result.getName());
		
	}

}
