
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(10-1)+1;
		
		// 2. Print out the random variable above
		
		for (int i = 0; i <10; i++) {
			
			
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String guess = JOptionPane.showInputDialog("guess a number between 1-10");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guess2 = Integer.parseInt(guess);
			// 5. if the guess is correct
			if(guess2 == random) {
				JOptionPane.showMessageDialog(null, "You win!!!");
			}
			else if(guess2 > random) {
				JOptionPane.showMessageDialog(null, "It is too high");
			}
			else if(guess2 < random) {
				JOptionPane.showMessageDialog(null, "It is too low");
			}
			
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low
		// 11. Repeat steps 1 to 10 ten times

		// 13. Tell them they lose
		
	}
		JOptionPane.showMessageDialog(null, "You lost!!!");
}
}

