package optional;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("How many hours did you spend coding this week?");
		int i = Integer.parseInt(answer);
		if (i <= 2) {
			JOptionPane.showMessageDialog(null, "Stop watching YouTube and write code instead.");
		} else if (i >= 3 && i < 5) {
			JOptionPane.showMessageDialog(null, "You are a Code Ninja");
		}

		else if (i >= 5) {
			playBatmanTheme();
		}

	}

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
