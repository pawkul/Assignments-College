abstract class Majo extends Prisoner{

	public Majo(String name){
		super(name);
	}

	public boolean playSuper(){
		// Less than 0 Defect
		// More than 0 Cooperate
		if(majorityOpponent < 0){
			return false;
		}
		else{
			return true;
		}
	}
}