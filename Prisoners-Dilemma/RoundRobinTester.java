class RoundRobinTester{

	public static void main(String[] args) {

		Bout bout = new Bout();
		
		Prisoner[] prisoners = {	new HardMajo("hard_majo"),
									new SoftMajo("soft_majo"),
									new NastyTitForTat("nasty_tit_for_tat"),
									new NiceTitForTat("nice_tit_for_tat"),
									new Rand("rand") 
								};

		bout.run(1000, prisoners);

	}
}