class Building{
  BuildingType typeOfBuilding; 
  public Building(BuildingType bt){
    this.typeOfBuilding = bt;
  }
  public Building(){
    System.out.println("New building created");
  }
  public BuildingType getTypeOfBuilding(){
    return(typeOfBuilding);
  }
}
