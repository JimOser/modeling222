class Building{
    
    private BuildingType typeOfBuilding;
    private ArrayList<Room> theRooms = new ArrayList<Room>();
    
    public Building(BuildingType bt) {
        this.typeOfBuilding = bt;
        System.out.println("New building created");
    }
    
    public BuildingType getTypeOfBuilding(){
        return(typeOfBuilding);
    }
    
    public RoomType getTypeOfRoom(int numRoom){
        return(theRooms.get(numRoom).getTypeOfRoom());
    }
    
    public getRoom(int numRoom) {
        return theRooms.get(numRoom);
    }
    
    public ArrayList<Room> getRooms() {
        return theRooms;
    }
    
    public void createRooms(int numberOfRooms) {
        for(int i=0;i<numberOfRooms;i++) {
            switch(i) {
                case 0: theRooms.add(new Room(RoomType.BEDROOM)); break;
                case 1: theRooms.add(new Room(RoomType.LIVINGROOM)); break;
                case 2: theRooms.add(new Room(RoomType.KITCHEN)); break;
                case 3: theRooms.add(new Room(RoomType.DININGROOM)); break;
                case 4: theRooms.add(new Room(RoomType.GARAGE)); break;
                case 5: theRooms.add(new Room(RoomType.BATHROOM)); break;
                default: theRooms.add(new Room(RoomType.OTHER));
            }
        }
        System.out.println(numberOfRooms + " rooms created.");
    }
    
    /**
    This method generates one room per roomtype
    Diese Methode generiert einen Raum pro Raumtyp
    **/
    public void createOneRoomPerType() {
        int count = 0;
        for(RoomType r:RoomType.values())
            if(r!=RoomType.OTHER) {
                theRooms.add(new Room(r));
            }
        }
    }
}