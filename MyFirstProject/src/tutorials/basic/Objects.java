package tutorials.basic;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
	public static void main(String[] args) {
		int number = 5;
		
		// create a window variable that holds jframe object, create new jframe to assign to variable
		JFrame window = new JFrame();
		// set the title of the window
		window.setTitle("My Window");
		// set the size of the window
		window.setSize(800, 600);
		// set the visible property to true
		window.setVisible(true);
		
		//label variable to hold jlabel object
		JLabel label = new JLabel();
		
		// create a label 
		label.setText("My Label");
		
		// add the label object to the window
		window.add(label);
		
		String s = "hi";
		label.setText(s);
		label.setToolTipText("HI TEXT");
	}
}
