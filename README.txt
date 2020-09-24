DATA ACCESS LAYER : ProductDao.java (Interface)
					ProductDaoImpl.java (Implements the interface to manipulate data)
					
Service Layer : ProductService.java (Interface)
				ProductServiceImpl.java (Implements the interface and calls dao layer to manipulate data)
				
Exception : ItemCodeNOtFoundException.java (If Item not present)
			ProductNotFoundException.java (If Product not present)
			ReportNotFoundException.java (If Report not present)
			
Beans : Product.java (It is the super class for the below classes)
		FoodItems.java (Food Item class)
		Appareal.java (Appareal item class)
		Electronics.java (Electronic item class)
		
Controller : MainApp.java (main() method)

Utility : 	ProductFactory.java (gets the instances as required)
	SortByQuantity.java (sorts the list)
	Type.java (enum variables)