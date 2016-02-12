
/* Level 0 Exam: Coding  Exercise #1 */
import java.awt.Color;

import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Colors.Reds;
import org.teachingextensions.logo.PenColors.Yellows;
import org.teachingextensions.logo.Tortoise;

public class CodingExercise1 {
	public static void main(String[] args) {
		// 3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog("What color do you want the tortoise to be?");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if (color.equals("red")) {
			Tortoise.setPenColor(Color.red);
		} else {
			Tortoise.setPenColor(Color.CYAN);
		}
		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape
		for (int i = 0; i < 4; i++) {
			Tortoise.move(100);
			Tortoise.turn(90);
		}
	}
}