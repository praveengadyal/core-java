class SuperMarket1{
static String biscuts[] = {"Oreo", "Bourboun", "Parle G", "Hide & Seek", "Mom's Magaic","Good Day", "Dark Fantasy"};
static String vegetables[] = {"Beans", "Tomato", "Potato", "Cocumber", "Lemon", "Zinger", "Mint", "Pudina"};
static String biscutName;
static String vegetableName;

public static void main(String a[])
{
  getBiscut("Dark Fantasy");
  System.out.println("the selected biscut is "+ biscutName);
  getVegetable("Lemon");
}

public static String getBiscut(String biscut)
{
  for(int i=0 ; i<biscuts.length; i++)
  {
    if(biscuts[i] == biscut)
	{
	   biscutName = biscuts[i];
	}
  }
  return biscutName;
}

public static String getVegetable(String vegetable)
{
	for(int i=0; i < vegetables.length; i++)
	{
		if(vegetables[i] == vegetable)
		{
			vegetableName = vegetables[i];
		}
	}
	return vegetableName;
} 
}