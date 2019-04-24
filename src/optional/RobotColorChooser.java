package optional;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

import sun.security.util.PendingException;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot r = new Robot();
		int x = 200;
		int y = 200;
		r.setSpeed(100);

		for (int i = 0; i < 6; i++) {

			String answer = JOptionPane.showInputDialog("What color would you like the tortoise to draw?");

			if (answer.contentEquals("red")) {
				r.setPenColor(255, 0, 0);
			} else if (answer.contentEquals("green")) {
				r.setPenColor(0, 128, 0);
			} else if (answer.contentEquals("yellow")) {
				r.setPenColor(255, 255, 0);
			} else if (answer.contentEquals("blue")) {
				r.setPenColor(0, 0, 255);
			} else if (answer.contentEquals("black")) {
				r.setPenColor(0, 0, 0);
			} else if (answer.contentEquals("white")) {
				r.setPenColor(255, 255, 255);
			} else if (answer.contentEquals("magenta")) {
				r.setPenColor(255, 0, 255);
			} else if (answer.contentEquals("cyan")) {
				r.setPenColor(0, 255, 255);
			}

			else {
				r.setRandomPenColor();
			}

			r.setPos(x, y);
			r.setPenWidth(10);

			r.penDown();

			for (int n = 0; n < 4; n++) {
				r.move(200);
				r.turn(90);
			}
			x += 20;
			y += 20;

		}

	}
}
