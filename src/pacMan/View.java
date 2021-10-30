package pacMan;

import java.awt.*;

import javax.swing.*;

public class View extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public View (Fenetre fenetre,Jeu game,ScoreFenetre scoreFenetre) {
		
		JFrame frame = new JFrame("PAC-MAN");

		JPanel conteneur = new JPanel();
		conteneur.setLayout(null);
		conteneur.add(fenetre);
		conteneur.add(scoreFenetre);

		frame.add(conteneur);

		frame.setSize(game.getCaseSize()*game.getCaseNumWidth()+15, game.getCaseSize()*game.getCaseNumHeight()+70);
		frame.setResizable(true);
		frame.setLocation(500, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);







	}
	
	
}
