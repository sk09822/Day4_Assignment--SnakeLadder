import java.util.Random;

public class SnakeLaderUC3 {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int START = 0;
	public static void main(String[] args){
		int position = 0;
		System.out.println("Starting position of player is: " + START);
		Random rand = new Random();
		int roll = rand.nextInt(6);
		
		System.out.println("Number on rolled dice is : " +roll);
		Random rand1 = new Random();
		int con = rand1.nextInt(3);
	switch (con){
		case NO_PLAY:
			System.out.println("You are in No_Play Condition");
			System.out.println("New Position is: " + position);
			break;
		case LADDER:
			System.out.println("You are in LADDER condition, move ahead");
                	position = position + roll;
                  	System.out.println("New Position is: " + position);
                  	break;
		case SNAKE:
                	position = position - roll;
			System.out.println("Snake bit you");
			if ( position >= 0)
                  		System.out.println("New Position is: " + position);
			else
				position = 0;
				System.out.println("New Position is: " + position);
                  		break;
		default:
				System.out.println("Default");
				break;
			}
	}
}

