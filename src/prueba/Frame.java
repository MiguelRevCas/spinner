package prueba;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame{
		public Frame() {
			setVisible(true);
			setLayout(new BorderLayout());
			add(Spinner.getSpinner(),BorderLayout.NORTH);
			
			JLabel loading=new JLabel("Loading...");
			loading.setFont(new Font(getName(),Font.BOLD,32));
			add(loading,BorderLayout.CENTER);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setSize(1200,600);
		}
		public static void main(String[] args) {
			Frame ventana=new Frame();
		}
}
