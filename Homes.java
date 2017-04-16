public class Homes{
  public static void  main(String[] args){
    System.out.println("My home");
    Building home =  new Building(BuildingType.HOME);
    // Create 10 room home
    int rooms = 10;
    home.createRooms(rooms);
    System.out.println(home.getTypeOfBuilding());
    for (int i=0;i<rooms;i++){
      System.out.println("room " + i + " is " + home.getTypeOfRoom(i));
    }
  }
}
