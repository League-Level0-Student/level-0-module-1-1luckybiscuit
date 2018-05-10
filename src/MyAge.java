import javax.swing.JOptionPane;

public class MyAge {
	public static void main(String[] args) {
		int year = 2018;
		String age = JOptionPane.showInputDialog("How old are you?");
		for(int aje = Integer.parseInt(age);aje > 0;aje--) {
			JOptionPane.showMessageDialog(null, "In " +year+" you were " +aje+ " years old.");
			year--;
			//to modify, make if statement for one years old
			//to modify, make if statement for current age
		}
	}
}
