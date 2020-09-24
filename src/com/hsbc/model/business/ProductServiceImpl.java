package com.hsbc.model.business;

import com.hsbc.exception.ItemCodeExistsException;
import com.hsbc.exception.ProductNotFoundException;
import com.hsbc.exception.ReportNotFoundException;
import com.hsbc.model.beans.Product;
import com.hsbc.model.dao.ProductDao;
import com.hsbc.model.utility.ProductFactory;
import com.hsbc.model.utility.Type;

/**
 * @author sourabh wattamwar
 * Purpose: Implements the ProductService Interface and serves as Service Layer
 *
 */
public class ProductServiceImpl implements ProductService {

	private ProductDao dao;
	
	public ProductServiceImpl() {
		dao = (ProductDao) ProductFactory.getInstance(Type.DAO);
	}
	
	@Override
	public Product storeProduct(Product product) throws ItemCodeExistsException {
		Product createdProduct = dao.store(product);
		return createdProduct;
	}

	@Override
	public Product[] getTop3() throws ReportNotFoundException {
		return dao.getReport();
	}

	@Override
	public Product updateQuantity(int itemCode, int quantity) throws ProductNotFoundException {
		Product product;
		product = dao.getProduct(itemCode);
		product.setQuantity(quantity);
		return dao.updateProduct(itemCode, product);
		
	}

}
