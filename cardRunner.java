class cardRunner{
	
	public static void main(String[] wood){
		
		System.out.println("Start");
		
		card.displayDetails();
		
		card.type="wedding card";
		card.height=15;
		card.width=7.5;
		card.price=22;
		String[] look={"Red","Yellow"};
		card.color=look;
		
		card.displayDetails();
		System.out.println("end");
		
		
	}
}