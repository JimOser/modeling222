class Room{
  RoomType typeOfRoom; 
  public void Building(RoomType rt){
    this.typeOfRoom = rt;
  }
  public Room(){
//    System.out.println("New room created");
  }
  public RoomType getTypeOfRoom(){
    return(typeOfRoom);
  }
}
