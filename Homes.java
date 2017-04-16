public class Homes{
  private enum BuildingType {
    HOME, APARTMENT, TENT 
  }
  class Building{
    BuildingType typeOfBuilding; 
    public Building(BuildingType bt){
      typeOfBuilding = bt;
    }
    private BuildingType getTypeOfBuilding(){
      return(typeOfBuilding);
    }
  }
  public static void  main(String[] args){
    System.out.println("My home");
     Building home = new Building(BuildingType.HOME);
    System.out.println(home.getTypeOfBuilding());
  }
}
