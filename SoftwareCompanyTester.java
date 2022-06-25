class SoftwareCompanyTester {


public static void main(String a[]){

Infosys in=new Infosys();

in.noOfEmpolyees=276319;
in.revenue="102673 cr";
in.operates="worldwide";
in.established="02 july 1981";
in.headQuarters="mumbai";
in.website=" www.infosys.com ";
in.provideService();
in.provideNewTech();

System.out.println(in.noOfEmpolyees +"   "+ in.revenue +"   "+ in.operates +"   "+ in.established +"    "+ in.headQuarters +"   "+ in.website );
}

}