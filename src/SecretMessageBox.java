//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		// 1. Set a password in a String variable
		String pswrd = JOptionPane.showInputDialog("Do you have a secret message for me? Very well then.");
		// 2. Using a pop-up, ask the first person for a secret message and store it in a variable

		// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
		//    if they can guess the passcode
		String pswrdt = JOptionPane.showInputDialog("You wish to join the Top Secret Secretive Top Organization? Well, you know what they say:");
		// 4. If their guess matches the password, show them the secret message
		if(pswrd == pswrdt) {
			JOptionPane.showMessageDialog(null, "Welcome to club!");
		}else {
			JOptionPane.showMessageDialog(null,"Turns out you don't know what they say >:(");
		}
		// 5. If the password does not match, pop-up "INTRUDER!!"

	}
	
}
