package exercises;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class SpeakAndSpell {

	public static void main(String[] args) {

		String[] wordsToSpell = { "wisedom", "elevator", "building", "mushroom", "dinner" };
		int score = 0;
		for (int i = 0; i < wordsToSpell.length; i++) {
			speak("spell " + wordsToSpell[i]);
			String answer = JOptionPane.showInputDialog("spell the word");

			if (answer.equals(wordsToSpell[i])) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score++;
			} else {
				JOptionPane.showMessageDialog(null, "Wrong!");
			}

		}

		JOptionPane.showMessageDialog(null, "Your score is " + score);

	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
