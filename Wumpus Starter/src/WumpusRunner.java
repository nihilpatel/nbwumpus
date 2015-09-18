
public class WumpusRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean testingMode = true;
		if (testingMode)
		{
			System.out.println("Start tests");
			Room tempRoom;
			tempRoom = new Room(7,9,15,16);
			System.out.println(tempRoom.toString());
			System.out.println("End tests");
		}
		else
		{
			Referee ref = new Referee();
			System.out.println("Start game");
			ref.playGame();
			System.out.println("End game");
		}	
	}

}
