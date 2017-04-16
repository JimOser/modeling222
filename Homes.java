public class Homes{
  public static void  main(String[] args){
    System.out.println("My home");
    Building home =  new Building(BuildingType.HOME);
    System.out.println(home.getTypeOfBuilding());
  }
}
