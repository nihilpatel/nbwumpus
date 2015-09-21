
public class WumpusRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean testingMode = true;
		if (testingMode)
		{
			System.out.println("Start tests");
			Maze tempMaze;
			tempMaze = new Maze();
			System.out.println(tempMaze.getDescriptionForRoom(1));
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
