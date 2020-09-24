package com.hsbc.model.beans;
/**
 * @author sourabh wattamwar
 *Purpose : It stores information about the Apparel and extends the Product class
 */

public class Apparel extends Product{
	private String size;
	private String material;
	
	public Apparel(int itemCode, String itemName, double unitPrice, int quantity, String size, String material) {
		super(itemCode, itemName, unitPrice, quantity);
		this.material = material;
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Apparel [size=" + size + ", material=" + material + ", toString()=" + super.toString() + "]";
	}
	
	
}
