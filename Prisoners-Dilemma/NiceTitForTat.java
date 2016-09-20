class NiceTitForTat extends TitForTat{

	public NiceTitForTat(String name){
		super(name);
	}

	public boolean play(){
		if (firstMove){
			firstMove = false;
			return true;
		}
		else{
			return playSuper();

		}
	}
}
