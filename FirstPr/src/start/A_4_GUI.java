package start;
import javax.swing.JOptionPane;

public class A_4_GUI {
	
	public static void main (String[] args) {
		
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		// parseInt : change String type to Int type
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		 
		// parseDouble : change String type to double
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
		JOptionPane.showMessageDialog(null, "I am "+height+" cm tall");
	}
}
