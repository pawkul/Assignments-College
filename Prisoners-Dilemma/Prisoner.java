abstract class Prisoner {
	// False = defect True = cooperate 
	protected boolean previousMoveOpponent;
	protected boolean ownPreviousMove;
	protected int majorityOpponent;
	private int score;
	private String name;

	public Prisoner(String name){
		this.name = name;
	}

	public int getScore(){
		return score;
	}

	public String getName(){
		return name;
	}

	public void increaseScore(int num){
		score += num;
	}

	public void changeMajority(boolean move){
		if(move){
			majorityOpponent += 1;
		}
		else{
			majorityOpponent -= 1;
		}
	}

	public void changePreviousMove(boolean moveOpponent, boolean ownMove){
		previousMoveOpponent = moveOpponent;
		ownPreviousMove = ownMove;
		changeMajority(moveOpponent);
	}

	public void reset(){
		majorityOpponent = 0;
	}

	public abstract boolean play();

}