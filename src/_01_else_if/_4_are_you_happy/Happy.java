package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {

	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are you happy?");
		if(happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep it up!!!");
		}
		else {
			String happy2 = JOptionPane.showInputDialog("Do you want to be happy?");
			if(happy2.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Make a change that will makes you happy!");
			 
				
			}
			else if(happy2.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Good Luck^_^");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
