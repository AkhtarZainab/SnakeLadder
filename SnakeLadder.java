public class SnakeLadder{
	public static void rollDie(){				//method to get random value for die
		
		int dieValue = (int)(Math.random()*6 + 1);
		System.out.println("The die value is " +dieValue);
	}
	public static void main(String[] args){
		rollDie();
	}
}
