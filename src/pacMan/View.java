package pacMan;

import java.awt.Color;

import javax.swing.JFrame;

public class View extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public View (Fenetre fenetre,Jeu game) {
		
		JFrame frame = new JFrame("PAC-MAN");
		frame.add(fenetre);
		frame.setSize(fenetre.getSize());
		frame.setBackground(Color.black);
		frame.setResizable(false);
		frame.setLocation(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		PacmanListener myListener = new PacmanListener(game,fenetre);
		addKeyListener(myListener);
		
	}
	
	
}
