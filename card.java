class card{
		
	static String type;
	static int height;
	static double width;
	static int price;
	static String[] color;
		
	
	
	static void displayDetails()
	{
		
		System.out.println(type);
		System.out.println(height);
		System.out.println(width);
		System.out.println(price);
		if(color!=null)
		{
			System.out.println("Array pointing to memory");
			for(int look=0;look<color.length;look++){
				
				String ref=color[look];
				System.out.println(ref);
			}
			
		}
		else {
			
			System.out.println("Array not pointing to memory");
			
		}
		
	}


}