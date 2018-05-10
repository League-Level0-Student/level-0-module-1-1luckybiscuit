//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String lukas = "coming up with superpowers";
		String eman = "being Italian";
		String hah = "hiding his name";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String put = JOptionPane.showInputDialog("Who's your favorite XGeek?");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
		if(put.equals("Lukas")) {
			JOptionPane.showMessageDialog(null, "Lukas's superpower is "+lukas);
		}else if(put.equals("Emanuele")) {
			JOptionPane.showMessageDialog(null, "Emanuele's superpower is "+eman);
		}else if(put.equals("hah")) {
			JOptionPane.showMessageDialog(null, "\"Hah's\" superpower is "+hah);
		}else {
			JOptionPane.showMessageDialog(null, "That's not a member of the XGeeks...");
		}

	}
}

