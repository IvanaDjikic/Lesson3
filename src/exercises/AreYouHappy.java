package exercises;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Are you happy?");
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");

		} else if (answer.equals("no")) {
			String answer2 = JOptionPane.showInputDialog("Do you want to be happy?");
			if (answer2.contentEquals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			} else if (answer2.contentEquals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
			}

			else {
				JOptionPane.showMessageDialog(null, "You must input yes or no ");
			}

		} else {
			JOptionPane.showMessageDialog(null, "You must input yes or no ");
		}

	}
}