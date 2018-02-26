
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		int isWeekday, isVacation;

		isWeekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		if (isWeekday == 0) {
			isVacation = JOptionPane.showConfirmDialog(null, "Is it a Vacation?", "", JOptionPane.YES_NO_OPTION);
			if (isVacation == 0) {
				JOptionPane.showMessageDialog(null, "Then sleep in.");
			} else {
				JOptionPane.showMessageDialog(null, "Then get up lazybones!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Then sleep in.");
		}
	}
}
