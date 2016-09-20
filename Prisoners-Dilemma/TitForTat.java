abstract class TitForTat extends Prisoner{

	protected boolean firstMove = true;

	public TitForTat(String name){
		super(name);
	}

	public boolean playSuper(){
		return previousMoveOpponent;
	}
}