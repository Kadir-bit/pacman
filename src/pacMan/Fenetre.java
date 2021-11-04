package pacMan;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;

import javax.swing.*;


public class Fenetre extends JPanel {

	private  Jeu game;
	PacmanListener myListener;
	private Joueur player;
	private ScoreFenetre scoreFenetre;

	private static final long serialVersionUID = 1L;

	public Fenetre (Jeu game,Joueur player,ScoreFenetre scoreFenetre) {
		super();
		this.game = game;
		this.player = player;
		this.scoreFenetre = scoreFenetre;

		setOpaque(true);
		setLayout(null);
		setFocusable(true);
		setBackground(Color.black);
		setSize(game.getCaseSize()*game.getCaseNumWidth(), game.getCaseSize()*game.getCaseNumHeight());
		myListener = new PacmanListener(game,this);
		addKeyListener(myListener);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		game.createMap(g);

	}


	public void deplacementPacman(int dx,int dy) {

		try {

			for (int x = 0; x < this.game.getCaseNumHeight(); x++) {
				for (int y = 0; y < this.game.getCaseNumWidth(); y++) {
					if (game.getMap()[x][y] == 5 && game.getMap()[x + dx][y + dy] != 0
							&& game.getMap()[x][y] != game.getMap()[x + dx][y + dy]) {
						if (game.getMap()[x + dx][y + dy] == 1) {
							player.setScore(100);
						} else if (game.getMap()[x + dx][y + dy] == 2) {
							player.setScore(300);

						} else if (game.getMap()[x + dx][y + dy] == 3) {
							player.setScore(500);
						} else if (game.getMap()[x + dx][y + dy] == 4) {
							player.setScore(1000);
						} else if (game.getMap()[x + dx][y + dy] == 7) {
							player.setVies(player.getVies() - 1);
							if (player.getVies() == 0) {
								game.endGame();
							}
						}
						game.setMapCase(game.getMap(), x + dx, y + dy, 5);
						game.setMapCase(game.getMap(), x, y, 10);
						player.vieBonus();
						x = this.game.getCaseNumHeight();
						y = this.game.getCaseNumWidth();
						repaint();
						scoreFenetre.repaint();						//eventually metre c'est variable a 0 pour advance en continue
					}
				}
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			if(game.getMap()[5][17] == 5) {
				game.setMapCase(game.getMap(), 5, 0, 5);
				game.setMapCase(game.getMap(), 5, 17, 10);
				repaint();

			} else {
				game.setMapCase(game.getMap(), 5, 17, 5);
				game.setMapCase(game.getMap(), 5, 0, 10);
				repaint();

			}
		}
	}

	public void deplacementFantome() {

	}
}

