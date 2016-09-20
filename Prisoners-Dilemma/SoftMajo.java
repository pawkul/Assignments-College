class SoftMajo extends Majo{

	public SoftMajo(String name){
		super(name);
	}

	public boolean play(){
		if (majorityOpponent == 0){
			return true;
		}
		else{
			return playSuper();
		}
	}
}