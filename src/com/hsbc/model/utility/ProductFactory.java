package com.hsbc.model.utility;

import com.hsbc.model.business.ProductServiceImpl;
import com.hsbc.model.dao.ProductDaoImpl;

/**
 * @author sourabh wattamwar
 * Purpose : It creates the Object for the DAO and Service Layer as required
 *
 */
public class ProductFactory {
	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAO : 
			obj = new ProductDaoImpl();
			break;
		case SERVICE :
			obj = new ProductServiceImpl();
			break;
		}
		return obj;
	}
}
