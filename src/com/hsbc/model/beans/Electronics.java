package com.hsbc.model.beans;

/**
 * @author sourabh wattamwar
 *Purpose : It stores information about the Electronic Items and extends the Product class
 */

public class Electronics extends Product{
	private int warranty;

	public Electronics(int itemCode, String itemName, double unitPrice, int quantity, int warranty) {
		super(itemCode, itemName, unitPrice, quantity);
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Electronics [warranty=" + warranty + ", toString()=" + super.toString() + "]";
	}
	
}
