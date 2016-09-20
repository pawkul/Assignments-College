class NastyTitForTat extends TitForTat{
	
	public NastyTitForTat(String name){
		super(name);
	}

	public boolean play(){
		if (firstMove){
			firstMove = false;
			return false;
		}
		else{
			return playSuper();
		}
	}
}