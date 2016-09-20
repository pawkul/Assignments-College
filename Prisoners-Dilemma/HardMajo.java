class HardMajo extends Majo{

	public HardMajo(String name){
		super(name);
	}

	public boolean play(){
		if (majorityOpponent == 0){
			return false;
		}
		else{
			return playSuper();
		}
	}
}