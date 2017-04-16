class Building{
  BuildingType typeOfBuilding; 
  Room[] theRooms;
  public Building(BuildingType bt){
    this.typeOfBuilding = bt;
  }
  public Building(){
    System.out.println("New building created");
  }
  public BuildingType getTypeOfBuilding(){
    return(typeOfBuilding);
  }
  public void createRooms(int number_of_rooms){
    theRooms = new Room[number_of_rooms];
    for (int i=0;i<number_of_rooms;i++){
      theRooms[i]=new Room();
      switch (i) {
	      case 0:  theRooms[i].typeOfRoom=RoomType.LIVINGROOM;
		       break;
	      case 1:  theRooms[i].typeOfRoom=RoomType.DININGROOM;
		       break;
	      default: theRooms[i].typeOfRoom=RoomType.BEDROOM;
		       break;
        }
    }
    System.out.println(number_of_rooms + " rooms created.");
  }
  public RoomType getTypeOfRoom(int room){
    return(theRooms[room].getTypeOfRoom());
  }
}
