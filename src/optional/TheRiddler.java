package optional;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		int score = 0;

		String answer1 = JOptionPane.showInputDialog("Who makes it, has no need of it.?\n"
				+ "Who buys it, has no use for it?\n" + "Who uses it can neither see nor feel it?\n" + "What is it?");

		if (answer1.equals("a coffin")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! It is a coffin.");
		}

		String answer2 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		if (answer2.equals("a stamp")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! It is a stamp.");
		}
		String answer3 = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
		if (answer3.equals("a candle")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! It is a candle.");
		}

		JOptionPane.showMessageDialog(null, "Your score is " + score);

	}

}
