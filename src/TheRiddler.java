import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int scr = 5;
		JOptionPane.showMessageDialog(null, "You have been abducted by an alien species observing human progress on Earth.\nThey are questioning you to figure out if the human race should continue to exist.\nShow them your powers!");
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		if(JOptionPane.showInputDialog("Are you the yeast of thoughts and mind?").equalsIgnoreCase("Indubitably so")) {
			JOptionPane.showMessageDialog(null, "\"This being shows signs of high intelligence.\"");
			scr++;
		}else {
			JOptionPane.showMessageDialog(null, "\"This being shows signs of low intelligence.\"");
		}
		JOptionPane.showMessageDialog(null, "Your IQ level is " + scr*10 + ".");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(JOptionPane.showInputDialog("How cool are you?").equalsIgnoreCase("Very cool")) {
			JOptionPane.showMessageDialog(null, "\"This being shows signs of high intelligence.\"");
			scr++;
		}else {
			JOptionPane.showMessageDialog(null, "\"This being shows signs of low intelligence.\"");
		}
		JOptionPane.showMessageDialog(null, "Your IQ level is " + scr*10 + ".");
		// 5. Otherwise, say "wrong" and tell them the answer
		if(JOptionPane.showInputDialog("How low can you go?").equalsIgnoreCase("1")) {
			JOptionPane.showMessageDialog(null, "\"This being shows signs of high intelligence.\"");
			scr++;
		}else {
			JOptionPane.showMessageDialog(null, "\"This being shows signs of low intelligence.\"");
		}
		JOptionPane.showMessageDialog(null, "Your IQ level is " + scr*10 + ".");
		if(JOptionPane.showInputDialog("Are you self aware?").equalsIgnoreCase("What?")) {
			JOptionPane.showMessageDialog(null, "\"This being shows signs of high intelligence.\"");
			scr++;
		}else {
			JOptionPane.showMessageDialog(null, "\"This being shows signs of low intelligence.\"");
		}
		JOptionPane.showMessageDialog(null, "Your IQ level is " + scr*10 + ".");
		// 6. Add some more riddles
		if(JOptionPane.showInputDialog("What is 420 times 69 times 42 times the Fifth Dimension?").equalsIgnoreCase("No")) {
			JOptionPane.showMessageDialog(null, "\"This being shows signs of high intelligence.\"");
			scr++;
		}else {
			JOptionPane.showMessageDialog(null, "\"This being shows signs of low intelligence.\"");
		}
		JOptionPane.showMessageDialog(null, "Your IQ level is " + scr*10 + ".");
		if(scr*10 >= 90) {
			JOptionPane.showMessageDialog(null, "\"You have showed signs of high intelligence. The human race will continue its progress...\n\n\n\n\n\n...until next week. We get very impatient sometimes.\"");
		}else {
			JOptionPane.showMessageDialog(null, "\"The human race is not worth continuing. Prepare to be exterminated.\"");
		}
		// 2. Make a pop up to show the score.
		
	}
}

