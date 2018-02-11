
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	int HL = 0;

	public static void main(String[] args) {
		JOptionPane.showOptionDialog(null, "What kind of pet do you want to own?", null, 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Dog", "Cat", "Rock", "Sloth", "Lamp", "Iguana",
						"Chameleon", "Parrot", "Cow", "Ferret" },
				null);
		String name = JOptionPane.showInputDialog("What do you want to name your pet?");

		int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", null, 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Feed", "Walk", "Pet", "Ignore" }, null);
		if (task==0) {
		feed(name);
		}else if (task==1) {
		walk(name);
		}
	}
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.

		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	static void feed(String name){
		int HL =+1;
		JOptionPane.showMessageDialog(null, name+ " has been fed.");
		JOptionPane.showMessageDialog(null, name+ "'s happiness has gone up by 4");
	}
	static void walk(String name) {
		JOptionPane.showMessageDialog(null, "You have taken " +name+ "for a walk");
		JOptionPane.showMessageDialog(null, name+ "'s happiness level has gone up by 5");
	}
	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

		
	}
