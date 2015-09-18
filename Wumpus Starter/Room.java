// A room has an id number and three "tunnels" that lead to other rooms.
// These tunnels can be represented by numbers. So one room might have
// id = 9 and tunnels leading to 11, 16 and 7. Note that the "tunnel numbers"
// should be the same as the room numbers they lead to - I am using them
// Interchangeably in the documentation.
public class Room {

	// TODO: Decide which private member variables Room needs and set them up here.
	private int roomID;
	private int [] tunnels;
	/**
	 * constructor 
	 * @param id
	 * @param tunnel1
	 * @param tunnel2
	 * @param tunnel3
	 */
	// TODO: You write the Room's constructor.
	public Room(int id, int t1, int t2, int t3)
	{
		tunnels = new int[3];
		roomID = id;
		tunnels[0] = t1;
		tunnels[1] = t2;
		tunnels[2] = t3;
		
	}
	/**
	 * getTunnels - returns an array of tunnel numbers for this room.
	 * @return an array of room numbers
	 */
	// TODO: You write the Room's getTunnels method.
	// note: it is ok to return an array of some type. If you were returning
	//    an array of Strings (you shouldn't - this is an example), you would
	//    have a return type of String[].
	public int [] getTunnels()
	{
		return tunnels;
	}
	
	/**
	 * toString - returns a description of this room and its tunnels.
	 * for example:
	 *    You are in room 9. Tunnels lead to rooms 11, 16 and 7.
	 * @return - the description of the room.
	 */
	// TODO: You write the Room's toString method.
	public String toString()
	{
		return "You are in Room "+roomID+". Tunnels lead to rooms "+tunnels[0]+", "+tunnels[1]+" and "+tunnels[2];
	}
}
