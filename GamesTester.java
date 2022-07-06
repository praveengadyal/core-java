class GamesTester{

public static void main(String[] args){

Games gs=new Games();
gs.setId(467);
gs.setName("Battleground Mobile India");
gs.setMode("multiplayer");
gs.setNoOfPlayers(100);
gs.setNoOfDownloads("5 cr");

System.out.println(gs.getId()+"   "+gs.getName()+"   "+gs.getMode()+"   "+gs.getNoOfPlayers()+"   "+gs.getNoOfDownloads());
}


}