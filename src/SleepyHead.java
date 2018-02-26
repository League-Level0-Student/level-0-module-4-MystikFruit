
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		int isWeekday, isVacation;

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */
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
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
}
