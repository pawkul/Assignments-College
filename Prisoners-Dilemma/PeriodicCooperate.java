class PeriodicCooperate extends Periodic{

	public PeriodicCooperate(String name){
		super(name);
	}

	public boolean play(){
		return playThree(true);
	}
}