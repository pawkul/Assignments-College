class Pavlov extends Prisoner{

	public Pavlov(String name){
		super(name);
	}

	public boolean play(){
		if (previousMoveOpponent == ownPreviousMove){
			return true;
		}
		return false;
	}
}