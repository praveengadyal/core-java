class OrderDTO{

public OrderDTO(){
System.out.println("inside orderdto const.......");
}

private int id;
private int price;
private String personName;
private String address;
private int noOfItems;

public int getId(){return id;}

public void setId(int id){this.id=id;}

public int getPrice(){return price;}

public void setPrice(int price){this.price=price;}

public String getPersonName(){return personName;}

public void setPersonName(String personName){this.personName=personName;}

public String getAddress(){return address;}

public void setAddress(String address){this.address=address;}

public int getNoOfItems(){return noOfItems;}

public void setNoOfItems(int noOfItems){this.noOfItems=noOfItems;}


@Override
public String toString(){
return "[OrderDTO : id=" +this.id +",price="+this.price+",personName="+this.personName+",address="+this.address+",noOfItems="+this.noOfItems+"]";
}
}