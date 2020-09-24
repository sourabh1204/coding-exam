package com.hsbc.model.utility;

import java.util.Comparator;

import com.hsbc.model.beans.Product;

/**
 * @author sourabh wattamwar
 *Purpose : to sort the list
 */
public class SortByQuantity implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		return o1.getQuantitySold() - o2.getQuantitySold();
	}

}
