class Bout{

	public void run(int iterations, Prisoner[] prisoners){

		for (int e = 0; e < prisoners.length; e++){
			for (int i = e; i < prisoners.length; i++){
				for (int n = 0; n < iterations; n ++){
					play(prisoners[e], prisoners[i]);
				}

				prisoners[e].reset();
				prisoners[i].reset();

			}
		}

		for (int e = 0; e < prisoners.length; e++){
			System.out.println(prisoners[e].getName() + ": " + prisoners[e].getScore());
		}
	}

	public void play(Prisoner prisoner1, Prisoner prisoner2){
		if (prisoner1 != prisoner2){
			boolean p1;
			boolean p2;
			p1 = prisoner1.play();
			p2 = prisoner2.play();

			if (p1 && p2){
				prisoner1.increaseScore(3);
				prisoner2.increaseScore(3);
			}

			else if (p1 && !p2){
				prisoner2.increaseScore(5);
			}

			else if (p2 && !p1){
				prisoner1.increaseScore(5);
			}

			else{
				prisoner1.increaseScore(1);
				prisoner2.increaseScore(1);

			}

			prisoner1.changePreviousMove(p2, p1);
			prisoner2.changePreviousMove(p1, p2);

		}
		else{
			playSame(prisoner1, prisoner2);
		}
	}
	
	public void playSame(Prisoner prisoner1, Prisoner prisoner2){
		boolean p1;
		boolean p2;
		p1 = prisoner1.play();
		p2 = prisoner2.play();

		if (p1 && p2){
			prisoner1.increaseScore(3);
		}

		else if (p1 || p2){
			prisoner2.increaseScore(5);
		}

		else{
			prisoner1.increaseScore(1);

		}
	}
}