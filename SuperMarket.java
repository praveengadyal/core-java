class SuperMarket{

static String vegetables[]={"tomato","carrot","onion","cucumber","garlic","potato","cabbage"};
static String groceries[]={"egg","milk","rice","flour","dal","salt","sugar"};
static String soaps[]={"dove","dettol","lifebuoy","medimix","lux","himalaya","santoor"};
static String detergents[]={"wheel","tide","surf excel","nirma","ghari","rin","ariel"};
static String coolDrinks[]={"maaza","sprite","frooti","7up","coke","pepsi","thums up"};
static String chacolets[]={"snickers","amul dark","cadbury","nestle classic","ferrero rocher","dairy milk","cocoacraft"};
static String biscuits[]={"parle-g","good day","unibic","oreo","patanjali","sunfeast","priya gold"};
static String fruits[]={"apple","mango","banana","orange","pineapple","papaya","blackberry"};
static String deoas[]={"fogg","denver","wildstone","axe","park avenue","set wet","envy"};
static String cookingOils[]={"mustard","sunflower","olive","rice bran","groundnut","coconut","soybean"};
static String homeAppliences[]={"refrigerator","wahing machine","microwave","dishwasher","coffee maker","vacuum cleaner","iron"};
static String sportsProducts[]={"bat","ball","net","discs","skates","skis","golf"};
static String iceCreams[]={"kulfi","sorbet","gelato","cassata","strawberry","granita","mochi"};

public static void main(String args[])
{

String value=getIceCream("kulfi");
System.out.println(value);

String value1=getSportsProduct("skis");
System.out.println(value1);

String value2=getHomeApp("iron");
System.out.println(value2);

String value3=getVegetable("potato");
System.out.println(value3);

String value4=getGrocery("flour");
System.out.println(value4);

String value5=getSoap("himalaya");
System.out.println(value5); 

String value6=getDetergent("ghari");
System.out.println(value6);

String value7=getCoolDrink("pepsi");
System.out.println(value7);

String value8=getChacolet("cadbury");
System.out.println(value8);

String value9=getBiscuit("oreo");
System.out.println(value9);

String value10=getFruit("blackberry");
System.out.println(value10);

String value11=getDeoa("envy");
System.out.println(value11);

String value12=getCookingOil("coconut");
System.out.println(value12);

}

public static String getCoolDrink(String coolDrink)
{
String coolDrinkName=null;
for(int i=0;i<coolDrinks.length;i++)
   {
if(coolDrinks[i]==coolDrink)
{ 
 coolDrinkName=coolDrinks[i];
}
   }
return coolDrinkName;
}


public static String getHomeApp(String homeApplience)
{
String homeApplienceName=null;
for(int i=0;i<homeAppliences.length;i++)
  {
if(homeAppliences[i]==homeApplience)
{ 
 homeApplienceName=homeAppliences[i];
}
  }
return homeApplienceName;
}

public static String getSoap(String soap)
{
String soapName=null;
for(int i=0;i<soaps.length;i++)
  {
if(soaps[i]==soap)
{ 
 soapName=soaps[i];
}
  }
return soapName;
}


public static String getDeoa(String deoa)
{
String deoaName=null;
for(int i=0;i<deoas.length;i++)
  {
if(deoas[i]==deoa)
{ 
 deoaName=deoas[i];
}
   }
return deoaName;
}


public static String getFruit(String fruit)
{
String fruitName=null;
for(int i=0;i<fruits.length;i++)
{
if(fruits[i]==fruit)
  { 
 fruitName=fruits[i];
  }
}
return fruitName;
}


public static String getIceCream(String iceCream)
{
String iceCreamName=null;
for(int j=0;j<iceCreams.length;j++)
   {
if(iceCreams[j]==iceCream)
 {  
iceCreamName=iceCreams[j];
}
 }
return iceCreamName;
}


public static String getCookingOil(String cookingOil)
{
String cookingOilName=null;
for(int i=0;i<cookingOils.length;i++)
  {
if(cookingOils[i]==cookingOil)
{ 
 cookingOilName=cookingOils[i];
}
  }
return cookingOilName;
}


public static String getVegetable(String vegetable)
{
String vegetableName=null;
for(int i=0;i<vegetables.length;i++)
{
if(vegetables[i]==vegetable)
   { 
 vegetableName=vegetables[i];
   }
}
return vegetableName;
}


public static String getGrocery(String grocery)
{
String groceryName=null;
for(int i=0;i<groceries.length;i++)
{
if(groceries[i]==grocery)
   {
  groceryName=groceries[i];
  }
}
return groceryName;
}



public static String getDetergent(String detergent)
{
String detergentName=null;
for(int i=0;i<detergents.length;i++)
{
if(detergents[i]==detergent)
  {
  detergentName=detergents[i];
  }
}
return detergentName;
}



public static String getBiscuit(String biscuit)
{
String biscuitName=null;
for(int i=0;i<biscuits.length;i++)
   {
if(biscuits[i]==biscuit)
{
  biscuitName=biscuits[i];
}
    }
return biscuitName;
}


public static String getChacolet(String chacolet)
{
String chacoletName=null;
for(int i=0;i<chacolets.length;i++)
{
if(chacolets[i]==chacolet)
{ 
 chacoletName=chacolets[i];
}
}
return chacoletName;
}



public static String getSportsProduct(String sportsProduct)
{
String sportsProductName=null;
for(int i=0;i<sportsProducts.length;i++)
 {
if(sportsProducts[i]==sportsProduct)
   {  
sportsProductName=sportsProducts[i];
   }
}
return sportsProductName;
}

}