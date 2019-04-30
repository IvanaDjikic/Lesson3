package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
	public static void main(String[] args) {
		Random r = new Random();
		int number = r.nextInt(100);
		System.out.println(number);
		int x = 0;
		for (int i = 0; i < 5; i++) {
			String answer = JOptionPane.showInputDialog("Guess number");
			int guess = Integer.parseInt(answer);

			if (guess == number) {
				JOptionPane.showMessageDialog(null, "Correct. Congratulation!");
				System.exit(0);
			} else if (guess >= number - 5 && guess < number) {
				JOptionPane.showMessageDialog(null, "Close, but low. You have " + (4 - i) + " tries.");
				x++;
			} else if (guess < number - 5) {
				JOptionPane.showMessageDialog(null, "Too low. You have " + (4 - i) + " tries.");
				x++;
			} else if (guess <= number + 5 && guess > number) {
				JOptionPane.showMessageDialog(null, "Close, but high. You have " + (4 - i) + " tries.");
				x++;
			} else if (guess > number + 5) {
				JOptionPane.showMessageDialog(null, "Too high. You have " + (4 - i) + " tries.");
				x++;
				
			}
			if (x == 5) {
				JOptionPane.showInternalMessageDialog(null, "You lose. More luck next time :)");
			}
		}
		

	}

}
