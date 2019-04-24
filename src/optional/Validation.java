package optional;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

			int randomNumber = new Random().nextInt(5);

			System.out.println(randomNumber);

			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "You're really something special.");
			} else if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "Your creative potential seems limitless");
			} else if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "You've got an awesome sense of humor!");
			} else if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "Hanging out with you is always a blast.");
			} else if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null, "There's ordinary, and then there's you.");
			}

		}

	}
}
