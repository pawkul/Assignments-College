class PeriodicDefect extends Periodic{

	public PeriodicDefect(String name){
		super(name);
	}

	public boolean play(){
		return playThree(false);
	}
}