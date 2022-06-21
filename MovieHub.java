class MovieHub
{
static String movies[]={"major","charlie777","vikram","bb2","prithviraj"};

public static void main(String... a){
 String value= getMovie("prithviraj");
System.out.println(" come .. will watch " + value);
}




 public static String getMovie(String movie){

String movieName=null;
for(int i=0; i<movies.length;i++){

  if(movies[i]==movie){
        movieName=movies[i];
    }
  }
return movieName;
}
}