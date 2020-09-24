package com.hsbc.model.beans;

import java.time.LocalDate;

/**
 * @author sourabh wattamwar
 *Purpose : It stores information about the Food Items and extends the Product class
 */
public class FoodItems extends Product{
	private LocalDate doManufacture;
	private LocalDate doExpiry;
	private boolean veg;
	
	public FoodItems(int itemCode, String itemName, double unitPrice, int quantity, LocalDate doManufacture, LocalDate doExpiry, boolean veg) {
		super(itemCode, itemName, unitPrice, quantity);
		this.doManufacture = doManufacture;
		this.doExpiry = doExpiry;
		this.veg = veg;
	}

	public LocalDate getDoManufacture() {
		return doManufacture;
	}

	public void setDoManufacture(LocalDate doManufacture) {
		this.doManufacture = doManufacture;
	}

	public LocalDate getDoExpiry() {
		return doExpiry;
	}

	public void setDoExpiry(LocalDate doExpiry) {
		this.doExpiry = doExpiry;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	@Override
	public String toString() {
		return "FoodItems [doManufacture=" + doManufacture + ", doExpiry=" + doExpiry + ", veg=" + veg + ", toString()="
				+ super.toString() + "]";
	}
	
}
