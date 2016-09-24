#Prisoner's dilemma Simulation

A Prisoner will have a name and a total score. In each bout of the game that the prisoner plays, s/he will have to decide whether to Cooperate or Defect. There are several types of prisoner, each playing different strategies:

  * **rand**: a prisoner who plays this strategy chooses randomly between Cooperate and Defect, each having a probability of 0.5.
  * **nice_tit_for_tat**: both prisoners start Cooperating, and then they both copy each other's previous move.
  * **nasty_tit-for_tat**: as per nice_tit_for_tat but the first move is Defect.
  * **soft_majo**: a prisoner who plays this strategy will choose his/her opponent's majority move, i.e. if the majority of the              opponent's moves so far have been Cooperates, then Cooperate is chosen; if the majority have been Defects, then Defect is              chosen; if it's a tie, then Cooperate is chosen.
  * **hard_majo**: as per soft_majo but, in the event of a tie, Defect is chosen.
