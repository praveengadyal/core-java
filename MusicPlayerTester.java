class MusicPlayerTester{

public static void main(String[] args){

MusicPlayerDTO mp=new MusicPlayerDTO();
mp.setId(128);
mp.setName("spotify");
mp.setTotalSongs("82 million");
mp.setTotalDownloads("100 cr");
mp.setRatings(4.3);

System.out.println(mp.getId()+"  "+mp.getName()+"  "+mp.getTotalSongs()+"  "+mp.getTotalDownloads()+"  "+mp.getRatings());
} 


}