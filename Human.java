class Human{
	
	static String Name;
	static String PetName;
	static int Age;
	static double Height;
	static double Weight;
	static double Salary;
	static long MobileNo;
	static int MembersOfFamily;
	static String MotherTongue;
	static String LaptopBrand;
	static int NoOfContacts;
	static String Company;
	static int ShirtSize;
	static int NoOfDebitCards;
	static int PantSize;
	static int NoOfFriends;
	static long AccountNo;
	static String[] Vehicles;
	static String[] Colors;
	static String[] Occupation;
	static String[] Behaviour;
	static String[] LanguagesKnown;
	static String[] HairColor;
	static String[] TypesOfAccounts;
	static String[] Hobbies;
	static String[] Skills;
	static String[] VisitedPlaces;
	static String[] MobilesUsed;
	static String[] Religion;
	
	static void displayDetails()
	{
		
		System.out.println(Name);
		System.out.println(PetName);
		System.out.println(Age);
		System.out.println(Height);
		System.out.println(Weight);
		System.out.println(Salary);
		System.out.println(MobileNo);
		System.out.println(MembersOfFamily);
		System.out.println(MotherTongue);
		System.out.println(LaptopBrand);
		System.out.println(NoOfContacts);
		System.out.println(Company);
		System.out.println(ShirtSize);
		System.out.println(PantSize);
		System.out.println(NoOfFriends);
		System.out.println(AccountNo);
		
		if (Vehicles!=null)
		{
			for (int gadi=0;gadi<Vehicles.length;gadi++){
				String ref1=Vehicles[gadi];
				System.out.println(ref1);
				
			}
			
		}
		
		if(Colors!=null)
		{
			for(int banna=0;banna<Colors.length;banna++){
				String ref2=Colors[banna];
				System.out.println(ref2);
				
			}
			
		}
		
		if(Occupation!=null)
		{
			for(int kelsa=0;kelsa<Occupation.length;kelsa++){
				String ref3=Occupation[kelsa];
				System.out.println(ref3);
				
			}
			
		}
		
		if(Behaviour!=null)
		{
			for(int naduvalike=0;naduvalike<Behaviour.length;naduvalike++){
				String ref4=Behaviour[naduvalike];
				System.out.println(ref4);
				
			}
			
		}
		
		if (LanguagesKnown!=null)
		{
			for (int bhashe=0;bhashe<LanguagesKnown.length;bhashe++){
				String ref5=LanguagesKnown[bhashe];
				System.out.println(ref5);
				
			}
			
		}
		
		if(HairColor!=null)
		{
			for(int kudlu=0;kudlu<HairColor.length;kudlu++){
				String ref6=HairColor[kudlu];
				System.out.println(ref6);
				
			}
			
		}
		
		if(TypesOfAccounts!=null)
		{
			for(int balance=0;balance<TypesOfAccounts.length;balance++){
				String ref7=TypesOfAccounts[balance];
				System.out.println(ref7);
				
			}
			
		}
		
		if(Hobbies!=null)
		{
			for(int havyasa=0;havyasa<Hobbies.length;havyasa++){
				String ref8=Hobbies[havyasa];
				System.out.println(ref8);
				
			}
			
		}
		
		if(Skills!=null)
		{
			for(int kushala=0;kushala<Skills.length;kushala++){
				String ref9=Skills[kushala];
				System.out.println(ref9);
				
			}
			
		}
		
		if(VisitedPlaces!=null)
		{
			for(int stala=0;stala<VisitedPlaces.length;stala++){
				String ref10=VisitedPlaces[stala];
				System.out.println(ref10);
				
			}
			
			
		}
		
		if(MobilesUsed!=null)
		{
			for(int phone=0;phone<MobilesUsed.length;phone++){
				String ref11=MobilesUsed[phone];
				System.out.println(ref11);
				
			}
			
		}
		
		if(Religion!=null)
		{
			for(int jathi=0;jathi<Religion.length;jathi++){
				String ref12=Religion[jathi];
				System.out.println(ref12);
				
			}
			
		}
		
		
		else {
			
			System.out.println("Array not pointing to memory");
		}
		
		
	}
	
}
