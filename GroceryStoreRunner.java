class GroceryStoreRunner{
	
	public static void main (String[] oil){
		
		GroceryStore.setItems("Rice");
		GroceryStore.setPrice(50.5D);
		GroceryStore.setQuantity(2);
		GroceryStore.setQuality("high");
		GroceryStore.setTypeOfItems("red rice");
		GroceryStore.setWeight(2.45D);
		GroceryStore.setVarities("raw rice");
		GroceryStore.setPlacements("shelf");
		GroceryStore.setIncome(25800);
		GroceryStore.setCustomerPerDay(250);
		GroceryStore.setTax(0.18D);
		GroceryStore.setCarryBag("cloth bag");
		GroceryStore.setResponsibility("Customer friendly");
		GroceryStore.setArea("Rajajinagar");
		GroceryStore.setLocation("first phase");
		
		String items=GroceryStore.getItems();
		double price=GroceryStore.getPrice();
		int quantity=GroceryStore.getQuantity();
		String quality=GroceryStore.getQuality();
		String typeOfItems=GroceryStore.getTypeOfItems();
		double weight=GroceryStore.getWeight();
		String varities=GroceryStore.getVarities();
		String placements=GroceryStore.getPlacements();
		int income=GroceryStore.getIncome();
		int customerPerDay=GroceryStore.getCustomerPerDay();
		double tax=GroceryStore.getTax();
		String carryBag=GroceryStore.getCarryBag();
		String responsibility=GroceryStore.Responsibility();
		String area=GroceryStore.getArea();
		String location=GroceryStore.getLocation();
		
		
		if(items=="Rice" && carryBag=="cloth bag")
		{
			System.out.println("GroceryStore is More");
		}
		else {
			System.out.println("Dont know");
		}
		
		
		
		
	}
	
	
	
	
}