import java.util.Random;

class Rand extends Prisoner{
	Random rand = new Random();

	public Rand(String name){
		super(name);
	}

	public boolean play(){
		return rand.nextBoolean();
	}

}