class LaptopxDTO{

private String series;
private double size;
private String color;                
private String cpu;
private int hardDisk;
private int ram;
private int price;

public String getSeries(){
return series;
}

public void setSeries(String series){
this.series=series;
}

public double getSize(){
return size;
}

public void setSize(double size){this.size=size;}

public String getColor(){return color;}

public void setColor(String color){this.color=color;}

public String getCpu(){return cpu;}

public void setCpu(String cpu){this.cpu=cpu;}

public int getHardDisk(){return hardDisk;}

public void setHardDisk(int hardDisk){this.hardDisk=hardDisk;}

public int getRam(){return ram;}

public void setRam(int ram){this.ram=ram;}

public int getPrice(){return price;}

public void setPrice(int price){this.price=price;}
}

