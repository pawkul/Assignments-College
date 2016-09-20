class PeriodicAlternateDefect extends Periodic{

	public PeriodicAlternateDefect(String name){
		super(name);
	}

	public boolean play(){
		return playAlternate(false);
	}
}