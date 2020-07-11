package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class story {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "It happened in sandiego,\n it was a cloudy day and jerry was walking\n on a street and suddenly he heard two men\n is argueing and they pull out a gun shot at\n each other 10 times that blood flows everywhere.\n jerry was shocked and he ran over\n to them and he see a bag of money\n laying on the ground");
		String answer = JOptionPane.showInputDialog("take the money or not(yes or no)");
			if(answer.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Jerry was considered the murder of the two men\n and send in jail for all of his life...");
			}
			else if(answer.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Jerry call the police and he tells the police \n and the reporters what happenned\n and as a result they give jerry hundreds of dollars\n for the information!");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


