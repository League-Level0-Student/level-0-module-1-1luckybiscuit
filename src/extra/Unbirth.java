package extra;

import javax.swing.JOptionPane;

public class Unbirth {
	public static void main(String[] args) {
		String date = JOptionPane.showInputDialog(null, "When is your birthday?");
		if(date.equalsIgnoreCase("May 2") || date.equals("5/2")) {
			JOptionPane.showMessageDialog(null, "I hope you receive happy emotions on the current date of your entrance into the world!");
		}else {
			JOptionPane.showMessageDialog(null, "Yaaaay you aren't special today");
		}
	}
}
