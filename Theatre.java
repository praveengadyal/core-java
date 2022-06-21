class Theatre{

 String name;
 int id;
 String address;
 String ownerName;
 long contactNo;
String[] runningMovies=new String[3];

public Theatre(){
System.out.println("theatre is created");
}

public static void main(String ... a){

Theatre theatre=new Theatre();
theatre.name="veeresha";
theatre.id=123;
theatre.address="magadi road";
theatre.contactNo=8956214584L;
theatre.ownerName="darshan";
theatre.runningMovies[0]="vikram";
theatre.runningMovies[1]="charlie";
theatre.runningMovies[2]="jurassic world";

System.out.println("Theatre name is " + theatre.name);
System.out.println("theatre id is " + theatre.id);
System.out.println("address is " + theatre.address);
System.out.println("theatre owner " + theatre.ownerName);
System.out.println("theatre contact number " + theatre.contactNo);
System.out.println("the running movies are ......." );
theatre.getRunningMovies();

System.out.println("");

Theatre th=new Theatre();
th.name="urvasi";
th.id=45;
th.address="sudam nagar";
th.contactNo=5897458561L;
th.ownerName="ravishankar kr";
th.runningMovies[0]="jurassic world";
th.runningMovies[1]="vikram";

System.out.println("Theatre name is " + th.name);
System.out.println("theatre id is " + th.id);
System.out.println("address is " + th.address);
System.out.println("theatre owner " + th.ownerName);
System.out.println("theatre contact number " + th.contactNo);
System.out.println("the running movies are " );
th.getRunningMovies();

System.out.println("");

Theatre th1=new Theatre();
th1.name="prasanna";
th1.id=98;
th1.address="magadi road";
th1.contactNo=8658657892L;
th1.ownerName="pavan jain";
th1.runningMovies[0]="vikram";
th1.runningMovies[1]="charlie";

System.out.println("Theatre name is " + th1.name);
System.out.println("theatre id is " + th1.id);
System.out.println("address is " + th1.address);
System.out.println("theatre owner " + th1.ownerName);
System.out.println("theatre contact number " + th1.contactNo);
System.out.println("the running movies are .. " );
th1.getRunningMovies();

System.out.println("");

Theatre th2=new Theatre();
th2.name="pvr gt world";
th2.id=56;
th2.address="gt world mall";
th2.contactNo=8800900009L;
th2.ownerName="xyz";
th2.runningMovies[0]="prithviraja";
th2.runningMovies[1]="vikram";
th2.runningMovies[2]="chrlie";
System.out.println("Theatre name is " + th2.name);
System.out.println("theatre id is " + th2.id);
System.out.println("address is " + th2.address);
System.out.println("theatre owner " + th2.ownerName);
System.out.println("theatre contact number " + th2.contactNo);
System.out.println("the running movies are .. " );
th2.getRunningMovies();


}

public  void getRunningMovies(){
for(int i=0;i<runningMovies.length;i++)
   System.out.println(runningMovies[i]);
}

}