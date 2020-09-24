package com.hsbc.model.dao;

import com.hsbc.exception.ProductNotFoundException;
import com.hsbc.exception.ReportNotFoundException;
import com.hsbc.model.beans.Product;

public interface ProductDao {
	public Product store(Product product); // stores the product
	public Product[] getReport() throws ReportNotFoundException; // gives the top 3 reports
	public Product updateProduct(int itemCode, Product product)throws ProductNotFoundException; // updates the quantity of the item
	public Product getProduct(int itemCode) throws ProductNotFoundException; // returns the product by getting the itemCode
}
