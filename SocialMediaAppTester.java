class SocialMediaAppTester{

public static void main(String a[]){

Instagram in=new Instagram();
in.id="praveen.gadyal";
in.login="praveengadyal.xworkz@gmail.com";
in.userName="praveen";
in.status="let see";
in.comment="good";
in.noOfLikes=100;
in.connectsPeople();
in.providesPlatform();

System.out.println(in.id +"  "+in.login+"  "+in.userName+"   "+in.status+"   "+in.comment+"  "+in.noOfLikes);
}
}