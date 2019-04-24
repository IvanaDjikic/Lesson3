package optional;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		String momsBirthday = "October 12th";
		String dadsBirthday = "September 2nd";
		String myBirthday = "October 18th";

		String wantedBirthday = JOptionPane.showInputDialog("Birthday to show?");

		System.out.println(wantedBirthday + "\'s birtday is :");

		if (wantedBirthday.contentEquals("mom")) {
			System.out.println(momsBirthday);
		}

		else if (wantedBirthday.contentEquals("dad")) {
			System.out.println(dadsBirthday);
		}

		else if (wantedBirthday.contentEquals("Ivana")) {
			System.out.println(myBirthday);
		}

		else {
			System.out.println("Sorry, i don't remember that person's birthday!");
		}
	}
}
