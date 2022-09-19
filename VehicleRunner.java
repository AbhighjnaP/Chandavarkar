class VehicleRunner{
	
	public static void main(String[] travel){
		double distance=Vehicle.transport("banglore","mysore");
		System.out.println("distance="+distance);
		Vehicle.transport("mysore","yes");
		Vehicle.transport("mysore","no");
		Vehicle.transport("not reached");
		Vehicle.transport("reached");
		Vehicle.transport("banglore",true);
		Vehicle.transport("banglore",false);
		Vehicle.transport(true);
		Vehicle.transport(false);
		
		
		
	}

}