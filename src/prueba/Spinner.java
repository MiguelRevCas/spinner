package prueba;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Spinner {
	public static JPanel getSpinner() {
		JPanel panel = new JPanel();
		JLabel spinner=new JLabel();
		spinner.setIcon(new ImageIcon(Spinner.class.getResource("/img/a.gif")));
		panel.add(spinner);
		return panel;
	}
}
