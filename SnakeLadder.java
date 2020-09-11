public class SnakeLadder{
	
	public static int rollDie(){
		
		int dieValue = (int)(Math.random()*6 + 1);
		System.out.println( "The die value is " + dieValue);
		return dieValue;
	}
	
	public static int optionValue(){
		int optionValue = (int)(Math.random()*3 + 1);
		return optionValue;
	}	

	public static int playTurn(int playerPos){
	
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
					System.out.println("Ladder, so moving ahead by die value " + dieValue);
					playerPos = playerPos + dieValue;
				}
				break;
			case 3:
				
				if (playerPos < dieValue) {
					System.out.println("Snake, but stops at starting position");
					playerPos = 0;
				} else {
					System.out.println("Snake, moving backward by die value " +dieValue);
					playerPos = playerPos - dieValue;
				}
				
		}
      
		System.out.println("Player position: " +playerPos);
   		return playerPos;
	}

	public static void playGame(){
		int playerPos = 0;
		while (playerPos < 100) {
			
			System.out.println("-------------------------------");
			playerPos = playTurn(playerPos);
			
				
		}
				
	}
	
	public static void main(String[] args){
		playGame();
	}
}
