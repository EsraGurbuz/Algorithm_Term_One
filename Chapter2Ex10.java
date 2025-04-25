//Import JOptionPane
import javax.swing.JOptionPane;

public class Chapter2Ex10{
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null, "Today is Thursday");

		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, name);

		String age = JOptionPane.showInputDialog("Enter your age");
		//I want to know how old I will be 5 years later.
		int myAge = Integer.parseInt(age);
		//System.out.println(myAge + 5)
		JOptionPane.showMessageDialog(null, (myAge+5));
	}
}