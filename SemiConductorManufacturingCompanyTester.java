class SemiConductorManufacturingCompanyTester{

public static void main(String a[]){


TSMC t=new TSMC();

t.founded=1987;
t.headQuarters="taiwan";
t.founder="morris chang";
t.type="public";
t.noOfEmployees=65152;
t.revenue="57.22 billion";
t.provideCompactness();
t.provideReliability();
t.powerEfficiency();

System.out.println(t.founded+"  "+t.headQuarters+"   "+t.founder+"   "+t.type+"   "+t.noOfEmployees+"   "+t.revenue);
} 

}