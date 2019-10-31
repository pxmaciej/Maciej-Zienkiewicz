import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


class WinnerWasCalled extends Exception {
}


class Properties{
		private	int maxPawns;
		private	int eye;
		private int maxPool;
		private int turns;

	public Properties(){
		this.maxPawns=0;
		this.eye=0;
		this.maxPool=0;
		this.turns=0;
	}

	public int getEye(){
		return this.eye;
	}
	public void setEye(int eye){
		this.eye=eye;
	}

	public int getMaxPool(){
		return this.maxPool;
	}
	public void setMaxPool(int maxPool){
		this.maxPool=maxPool;
	}
	public int getTurns(){
		return this.turns;
	}
	public void setTurns(int turns){
		this.turns=turns;
	}
	public int getPawns(){
		return this.maxPawns;
	}
	public void setPawns(int maxPawns){
		this.maxPawns=maxPawns;
	}


}

class Log {

	public static void info() {
		System.out.println("");
	}

	public static void info(String message) {
		System.out.println(message);
	}

}

class Dice {
	public int eye;
	private int result;

	public  Dice(int eye){
		if(eye > 0 && eye % 2 == 0){
		this.eye = eye;
		}else{
			Log.info();
			Log.info("Your Dice cant be < 0 and must be even number ");
			System.exit(0);
		}
	}

	public void roll() {
		Random rand = new Random();
 	    this.result = rand.nextInt(eye) + 1;
		Log.info("Dice roll: " + result);		
	}

	public int getResult(){
		return result;
	}

	
}

class Pawn {
	private  String[] names= new String[] {"Krzysziek","Alan","Maciej","Grzesiek","Paweł","Sebastian","Robert","Elrzbieta","Jan","Franek"};
	public int position;
	public String name;


	public Pawn(int x) {
	
		this.position = 0;
		this.name = names[x];
		
		Log.info(this.name + " joined the game.");
	}
	

}

class Board {

	private int max_position;
	private ArrayList<Pawn> pawns;
	public Dice dice;
	public Pawn winner;
	private int turnsCounter;
	public int maxPawns;

	

	public Board(int max_position){
		this.max_position=max_position;
		this.pawns = new ArrayList<Pawn>();
		this.dice = null;
		this.winner = null;
		this.turnsCounter = 0;
	}


	  public void checkPawns(int maxPawns){
		Random rand = new Random();
		this.maxPawns = maxPawns;
		if(maxPawns>=3 && maxPawns<=10){
			for(int x=0; x<maxPawns; x++){
		pawns.add(new Pawn(rand.nextInt(9)));
			}
		}else{
			Log.info();
			Log.info("Enter the number between 3 and 10 ");
			System.exit(0);

		}
	}

	public  void performTurn(int turns) throws WinnerWasCalled {
		this.turnsCounter++;
		if(turnsCounter  <= turns){
			Log.info();
			Log.info("Turn " + this.turnsCounter);
			
			for(Pawn pawn : this.pawns) {
				this.dice.roll();
				int rollResult = this.dice.getResult();
				pawn.position += rollResult;
				Log.info(pawn.name + " new position: " + pawn.position);
				if(pawn.position >=this.max_position) {
					this.winner = pawn;
					throw new WinnerWasCalled();
				}
			}
		}else{
			Log.info();
			Log.info("No one Winnig");
			System.exit(0);
		}
	}
	



}

public class Main {

	public static void main(String[] args) {
		Properties properties = new Properties();
		Scanner scan = new Scanner(System.in);

	

		Log.info("Max pool on board");
		properties.setMaxPool(scan.nextInt()); 
		Board board = new Board(properties.getMaxPool());
		
		Log.info("Max moves");
		properties.setTurns(scan.nextInt());

		Log.info("Get number of eye your dice");
		properties.setEye(scan.nextInt());
		board.dice = new Dice(properties.getEye());
		
		Log.info("Number of Players");
		properties.setPawns(scan.nextInt());
		board.checkPawns(properties.getPawns());
	
	
		try {
			while(true) {
				board.performTurn(properties.getTurns());
				
			}
		} catch(WinnerWasCalled exception) {
			Log.info();
			Log.info(board.winner.name + " won.");
		} 
	}

}
