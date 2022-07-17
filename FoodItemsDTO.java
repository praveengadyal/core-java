class FoodItemsDTO{

public FoodItemsDTO(){
System.out.println("inside FoodItemsDTO const...........");
}

private int id;
private String name;
private int price;
private String type;

public int getId(){return id;}

public void setId(int id){this.id=id;}

public String getName(){return name;}

public void setName(String name){this.name=name;}

public int getPrice(){return price;}

public void setPrice(int price){this.price=price;}

public String getType(){return type;}

public void setType(String type){this.type=type;}

@Override
public String toString(){
return "[FoodItemsDTO : id="+this.id+",name="+this.name+",price="+this.price+",type="+this.type+"]";
}

}