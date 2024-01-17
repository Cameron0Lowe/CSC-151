//Lowe 1 10 24 Chapter 1 Web Assist Assignment 1
import javax.swing.JOptionPane;
public class RandomGuess {

	public static void main(String[] args) {
		System.out.println("Think of a number, 1 to 10.");
		JOptionPane.showMessageDialog(null,"The number is "+
				(1 + (int)(Math.random() * 10)));

	}

}
