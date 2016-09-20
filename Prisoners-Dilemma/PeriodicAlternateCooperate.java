class PeriodicAlternateCooperate extends Periodic{

	public PeriodicAlternateCooperate(String name){
		super(name);
	}

	public boolean play(){
		return playAlternate(true);
	}
}