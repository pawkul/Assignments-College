abstract class Periodic extends Prisoner{

	int count;

	public Periodic(String name){
		super(name);
	}

	public boolean playThree(boolean bool){
		if (count < 2){
			count += 1;
			return bool;
		}
		else{
			count = 0;
			return !bool;
		}

	}

	public boolean playAlternate(boolean bool){
		if (count > 0){
			count = 0;
			return !bool;
		}
		else{
			count += 1;
			return bool;
		}

	}
}