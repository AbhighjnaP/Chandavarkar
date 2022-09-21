class ToothPasteRunner{
	
	public static void main(String[] ehh)
	{
		
		ToothPaste.setTaste("Sweet");
		ToothPaste.setColor("white");
		ToothPaste.setLength(14);
		ToothPaste.setWeight(15.20D);
		ToothPaste.setPrice(30);
		ToothPaste.setCompany("Colgate");
		ToothPaste.setComponents("fluoride");
		ToothPaste.setWidth(5.2D);
		ToothPaste.setPh(4.2D);
		ToothPaste.setType("foaming");
		ToothPaste.setFlavour("mint");
		ToothPaste.setDensity(1.499D);
		ToothPaste.setBoilingPoint(120);
		ToothPaste.setMeltingPoint(55);
		ToothPaste.setMolarMass(289.54D);
		
		String taste=ToothPaste.getTaste();
		String color=ToothPaste.getColor();
		int length=ToothPaste.getLength();
		double weight=ToothPaste.getWeight();
		int price=ToothPaste.getPrice();
		String company=ToothPaste.getCompany();
		String components=ToothPaste.getComponents();
		double width=ToothPaste.getWidth();
		double pH=ToothPaste.getPh();
		String type=ToothPaste.getType();
		String flavour=ToothPaste.getFlavour();
		double density=ToothPaste.getDensity();
		int boilingPoint=ToothPaste.getBoilingPoint();
		int meltingPoint=ToothPaste.getMeltingPoint();
		double molarMass=ToothPaste.getMolarMass();
		
		
		if (taste=="Sweet" && boilingPoint==120)
		{
			System.out.println("ToothPaste is Colgate");
		}
		else {
			System.out.println("not colgate");
		}
		
		
		
		if (taste=="Bitter" && meltingPoint==120)
		{
			System.out.println("ToothPaste is Colgate");
		}
		else {
			System.out.println("not colgate");
		}
		
		
	}
	
	
}