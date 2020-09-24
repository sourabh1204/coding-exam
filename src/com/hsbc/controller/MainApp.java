package com.hsbc.controller;

import java.util.Scanner;

import com.hsbc.model.business.ProductService;
import com.hsbc.model.utility.ProductFactory;
import com.hsbc.model.utility.Type;

/**
 * @author sourabh wattamwar
 * Purpose : This serves as the main application where the main() method runs
 *
 */
public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ProductService service = (ProductService) ProductFactory.getInstance(Type.SERVICE);
		int option = 0;
		do {
			
		}while(option != 4);

	}

}
