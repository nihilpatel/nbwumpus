/**
 * A maze is a collection of twenty linked Rooms.
 *
 */
public class Maze {

	// TODO: decide which private member variables Maze needs and set them up here.
	private Room [] rooms;
	/**
	 * constructor
	 * Sets up the twenty rooms, intializing them with their links.
	 */
	// TODO: You write the Maze's constructor
	public Maze()
	{
		rooms = new Room[20];
		rooms[0] = new Room(0,6,12,18);
		rooms[1] = new Room(1,11,17,19);
		rooms[2] = new Room(2,15,16,18);
		rooms[3] = new Room(3,10,13,17);
		rooms[4] = new Room(4,12,14,17);
		rooms[5] = new Room(5,8,13,15);
		rooms[6] = new Room(6,0,14,16);
		rooms[7] = new Room(7,9,15,19);
		rooms[8] = new Room(8,5,10,18);
		rooms[9] = new Room(9,7,11,16);
		rooms[10] = new Room(10,3,8,12);
		rooms[11] = new Room(11,1,9,14);
		rooms[12] = new Room(12,0,4,10);
		rooms[13] = new Room(13,3,5,19);
		rooms[14] = new Room(14,4,6,11);
		rooms[15] = new Room(15,2,5,7);
		rooms[16] = new Room(16,2,6,9);
		rooms[17] = new Room(17,1,3,4);
		rooms[18] = new Room(18,0,2,8);
		rooms[19] = new Room(19,1,7,13);
	}
	
	/**
	 * getDescriptionForRoom - returns a description of the given room 
	 * and its tunnels.
	 * @param which room number
	 * @return the description.
	 */
	// TODO: You write the Maze's getDescriptionForRoom method
	public String getDescriptionForRoom(int whichRoom)
	{
		return rooms[whichRoom].toString();
	}
	
	/**
	 * getAvailableTunnels - returns an array of room numbers that are
	 * connected to the given room.
	 * @param which room number
	 * @return an array of room numbers attached to this room.
	 */
	// TODO: You write the Maze's getAvailableTunnels method
	public int [] getAvailableTunnels(int whichRoom)
	{
		return rooms[whichRoom].getTunnels();
	}
	/**
	 * toString - not used in the game, but maybe helpful in debugging
	 * @return a list of the entire maze of rooms.
	 */
	// TODO: You write the Maze's toString method (optional)
	public String toString()
	{
		String result = "";
		for(Room r:rooms)
		{
			result += r.toString() + "\n";
		}
		return result;
	}
}
