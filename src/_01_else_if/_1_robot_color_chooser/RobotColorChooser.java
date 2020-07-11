
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot jerry = new Robot();
		
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		jerry.penDown();
		jerry.setSpeed(50);
		jerry.setAngle(0);
		jerry.move(200);
		jerry.setAngle(90);
		jerry.move(200);
		jerry.setAngle(180);
		jerry.move(200);
		jerry.setAngle(-90);
		jerry.move(200);
		//3. Set the pen width to 10
		jerry.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("Which color do you like to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equalsIgnoreCase("blue")) {
			jerry.setPenColor(Color.BLUE);
		}
		if(color.equalsIgnoreCase("red")) {
			jerry.setPenColor(Color.red);
		}
		if(color.equalsIgnoreCase("black")) {
			jerry.setPenColor(Color.black);
		}
		if(color.equalsIgnoreCase("yellow")) {
			jerry.setPenColor(Color.YELLOW);
		}
		if(color.equalsIgnoreCase("green")) {
			jerry.setPenColor(Color.GREEN);
		}
		else {
			jerry.setRandomPenColor();
		}
		jerry.setAngle(0);
		jerry.move(200);
		jerry.setAngle(90);
		jerry.move(200);
		jerry.setAngle(180);
		jerry.move(200);
		jerry.setAngle(-90);
		jerry.move(200);
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
