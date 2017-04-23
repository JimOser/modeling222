class Room{
  private RoomType typeOfRoom; 

  public Room(RoomType rt) {
     this.typeOfRoom = rt;
     System.out.println("New room created");
  }
    
  public RoomType getTypeOfRoom(){
    return(typeOfRoom);
  }
}