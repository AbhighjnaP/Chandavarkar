class Vehicle{
	static double transport(String source,String destination){
		
		System.out.println("entered source and destination");
		if(source=="banglore" &&destination=="mysore")
		{
			System.out.println("source="+source+"destination="+destination);
			return 143.5;	
		}
		if(source=="mysore"&&destination=="Shimoga")
		{
			
			System.out.println("source="+source+"destination="+destination);
			return 250;
			
		}
		else 
			System.out.println("distance not calculated");
		
		return 0;
	
	}
	static boolean transport(String destination){
		
		System.out.println("entered transport destination");
		if(destination=="reached"){
			System.out.println("destination reached");
		return true;
		}
		if(destination=="not reached"){
			System.out.println("destination not reached");
			
		}
		return false;
	}


	static boolean transport(String destination,boolean onTime){
		System.out.println("entered destination and onTime");
		System.out.println("destination"+destination);
		if(onTime==true){
			System.out.println("reached onTime");
			return true;
			
		}
		if (onTime==false){
			System.out.println("not reached onTime");
			return false;
			
		}
	}
	static boolean transport( boolean onTime){
		
		System.out.println("entered transport reached onTime");
		
		if(onTime==true){
			System.out.println("reached onTime");
			return true;
			
		}
		if (onTime==false){
			System.out.println("not reached onTime");
			return false;
			
		}
		
	}
		
		
		
		
		
		
		



}