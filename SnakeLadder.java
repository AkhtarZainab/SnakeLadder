public class SnakeLadder{
   
	public static int STARTPOS = 0;
	public static int ENDPOS = 100;
	public static int DIEMIN = 1;
	public static int DIEMAX = 6;
	public static int OPTIONMIN = 1;
	public static int OPTIONMAX = 3;
		
	public int rollDie(){
		int dieValue;
		dieValue = (int)(Math.random() * (DIEMAX - DIEMIN + 1) + 1);
		return dieValue;
	}

	public int optionValue(){
		int optionValue;
		optionValue = (int)(Math.random()*(OPTIONMAX - OPTIONMIN + 1) + 1);		
		return optionValue;
	}
	
	public int playTurn(int player, int playerPos){
		
		int dieValue = rollDie();
		int optionValue = optionValue();
		
		switch(optionValue){
			case 1:
				System.out.println("No Play");
				break;
			case 2:
				if ((playerPos + dieValue) > 100){
					System.out.println("Sorry, you must reach exactly 100 or lower position with the die roll") ;
				} else {
					playerPos = playerPos + dieValue;
					System.out.println("Ladder, so moving ahead by die value " + dieValue);
				}
				break;
			case 3:
				System.out.println("Snake, moving backward by die value " +dieValue);
				if (playerPos < dieValue) {
					playerPos = 0;
				} else {
					playerPos = playerPos - dieValue;
				}
		}
      
		System.out.println("Player " +player + " position: " +playerPos);
   	return playerPos;
	}		

	public void playGame(){
		int playerPos1 = STARTPOS;
		int playerPos2 = STARTPOS;
		int roundCount = 0;
		String winner;
		
		while (playerPos1 < ENDPOS && playerPos2 < ENDPOS) {
			
			//countRoll = countRoll + 1;
			roundCount = roundCount + 1;
			System.out.println("-------------------------------");
			System.out.println("Round " +roundCount+" begins!"); 
			playerPos1 = playTurn(1, playerPos1);
			if (playerPos1 != ENDPOS) {
				playerPos2 = playTurn(2, playerPos2);
			}
				
		}
		System.out.println("----------------------------------");
		System.out.println("Total no. of rounds is: " +roundCount);
		if (playerPos1 == ENDPOS) {
			winner = "Player 1";
		} else {
			winner = "Player 2";
		}
		System.out.println("And the winner is: " + winner);
		
	}



	public static void main(String[] args){
		
		SnakeLadder s = new SnakeLadder();
		s.playGame();
      
		
	}

}

