public class SnakeLadder{
	public static int rollDie(){				//method to get random value for die
		
		int dieValue = (int)(Math.random()*6 + 1);
		System.out.println("The die value is " +dieValue);
		return dieValue;
	}
	public static int optionValue(){
		int optionValue = (int)(Math.random()*3 + 1);
		return optionValue;
	}
	public static void playTurn(){

		int dieValue = rollDie();
		int optionValue = optionValue();
		int playerPos = 0;

		switch(optionValue){
			case 1:
				System.out.println("No Play");
				break;
			case 2:
				System.out.println("Ladder, so moving ahead by die value " + dieValue);
				playerPos = playerPos + dieValue;
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
   	}
		
	public static void main(String[] args){
		playTurn();
	}
}
