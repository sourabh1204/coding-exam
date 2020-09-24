package com.hsbc.model.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hsbc.exception.ProductNotFoundException;
import com.hsbc.model.beans.Product;
import com.hsbc.model.utility.SortByQuantity;

/**
 * @author sourabh wattamwar
 * Purpose : It implements the ProductDao interface and acts like a DAO Layer
 *
 */
public class ProductDaoImpl implements ProductDao {
	private static List<Product> productList = new ArrayList<Product>();
	
	@Override
	public Product store(Product product) {
		productList.add(product);
		return null;
	}

	@Override
	public Product[] getReport() {
		Product[] productArray = new Product[3];
		Collections.sort(productList,new SortByQuantity());
		return null;
	}

	@Override
	public Product updateProduct(int itemCode, Product product) throws ProductNotFoundException{
		for(Product item : productList) {
			if(item.getItemCode() == itemCode) {
				item = product;
				return item;
			}
		}
		throw new ProductNotFoundException();
	}

	@Override
	public Product getProduct(int itemCode) throws ProductNotFoundException {
		for(Product product : productList) {
			if(product.getItemCode() == itemCode) 
				return product;
		}
		throw new ProductNotFoundException();
	}

}
