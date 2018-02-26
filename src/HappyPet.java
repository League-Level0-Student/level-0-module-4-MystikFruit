
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	static int HL = 0;
	static int FL = 0;
	static int FL2 = 0;
	static int WL = 0;

	public static void main(String[] args) {
		JOptionPane.showOptionDialog(null, "What kind of pet do you want to own?", null, 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Dog", "Cat", "Rock", "Sloth", "Lamp", "Iguana",
						"Chameleon", "Parrot", "Cow", "Ferret" },
				null);
		String name = JOptionPane.showInputDialog("What do you want to name your pet?");
		for (int i = 0; i < 999999999; i++) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", null, 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Walk", "Pet", "Ignore", "Play", "Check Happiness Level" }, null);
			if (task == 0) {
				feed(name);
			} else if (task == 1) {
				walk(name);
			} else if (task == 2) {
				pet(name);
			} else if (task == 3) {
				ignore(name);
			} else if (task == 4) {
				play(name);
			} else if (task == 5) {
				checkHL(name);
			}
			if (HL >= 50) {
				JOptionPane.showMessageDialog(null, name + "'s happiness level has reached its max!");
				JOptionPane.showMessageDialog(null, name + " is going to go take a nap now."); break;

			}

		}
	}

	static void feed(String name) {
		if (FL < 2) {
			FL += 1;
			JOptionPane.showMessageDialog(null, name + " has been fed.");
			JOptionPane.showMessageDialog(null, name + "'s happiness has gone up by 8!");
			HL += 8;
		} else {
			if (FL == 2) {
				JOptionPane.showMessageDialog(null, name + " isn't hungry anymore.");
			}
		}
	}

	static void walk(String name) {
		if (WL < 2) {
			WL += 1;
			JOptionPane.showMessageDialog(null, "You have taken " + name + " for a walk.");
			JOptionPane.showMessageDialog(null, name + "'s happiness level has gone up by 10!");
			HL += 10;
		} else {
			if (WL == 2) {
				JOptionPane.showMessageDialog(null, name + " doesn't want to take another walk.");
			}
		}
	}

	static void pet(String name) {
		JOptionPane.showMessageDialog(null, "You have pet " + name + ".");
		JOptionPane.showMessageDialog(null, name + "'s happiness has gone up by 4!");
		HL += 4;
	}

	static void ignore(String name) {
		JOptionPane.showMessageDialog(null, name + " doesn't like to be ignored.");
		JOptionPane.showMessageDialog(null, name + "'s happiness level has gone down by 2");
		HL -= 2;
	}

	static void checkHL(String name) {
		JOptionPane.showMessageDialog(null, name + "'s happiness level is currently at " + HL);
	}

	static void play(String name) {
		JOptionPane.showMessageDialog(null, "You have played with " + name + ".");
		JOptionPane.showMessageDialog(null, name + "'s happiness has gone up by 4!");
		HL += 4;
	}
}
