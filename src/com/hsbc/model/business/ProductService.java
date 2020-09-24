package com.hsbc.model.business;

import com.hsbc.exception.ItemCodeExistsException;
import com.hsbc.exception.ProductNotFoundException;
import com.hsbc.exception.ReportNotFoundException;
import com.hsbc.model.beans.Product;

public interface ProductService {
	public Product storeProduct(Product product) throws ItemCodeExistsException;
	public Product[] getTop3() throws ReportNotFoundException;
	public Product updateQuantity(int itemCode, int quantity) throws ProductNotFoundException;
}
