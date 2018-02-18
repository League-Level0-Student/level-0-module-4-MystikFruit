
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	static int HL = 0;
	static int FL = 0;
	static int FL2 = 0;
	static int FL3 = 0;
	public static void main(String[] args) {
		JOptionPane.showOptionDialog(null, "What kind of pet do you want to own?", null, 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Dog", "Cat", "Rock", "Sloth", "Lamp", "Iguana",
						"Chameleon", "Parrot", "Cow", "Ferret" },
				null);
		String name = JOptionPane.showInputDialog("What do you want to name your pet?");
		for (int i = 0; i < 999999999; i++) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", null, 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Walk", "Pet", "Ignore", "Check Happiness Level" }, null);
			if (task == 0) {
				feed(name);
			} else if (task == 1) {
				walk(name);
			} else if (task == 2) {
				pet(name);
			} else if (task == 3) {
				ignore(name);
			} else if (task == 4) {
				checkHL(name);
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
				FL3 +=1;
			}
			if (FL3 >= 2) {
				JOptionPane.showMessageDialog(null, name + " is still full.");
			}
		}
	}

	static void walk(String name) {
		JOptionPane.showMessageDialog(null, "You have taken " + name + " for a walk.");
		JOptionPane.showMessageDialog(null, name + "'s happiness level has gone up by 10!");
		HL += 10;
	}

	static void pet(String name) {
		JOptionPane.showMessageDialog(null, "You have pet " + name + ".");
		JOptionPane.showMessageDialog(null, name + "'s happiness has gone up by 4!");
		HL += 4;
	}

	static void ignore(String name) {
		JOptionPane.showMessageDialog(null, name + " doesn't like to be ignored.");
		JOptionPane.showConfirmDialog(null, name + "'s happiness level has gone down by 2");
		HL -= 2;
	}

	static void checkHL(String name) {
		JOptionPane.showMessageDialog(null, name + "'s happiness level is currently at " + HL);
	}

}
