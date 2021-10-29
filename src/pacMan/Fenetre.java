package pacMan;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;

import javax.swing.JComponent;



public class Fenetre extends JComponent {

	private  Jeu game;
	PacmanListener myListener;
	
	
	private static final long serialVersionUID = 1L;

	public Fenetre (Jeu game) {
		super();
		this.game = game;
		setOpaque(true);
        setFocusable(true);
		setSize(game.getCaseSize()*game.getCaseNumWidth()+15, game.getCaseSize()*game.getCaseNumHeight()+100);
		myListener = new PacmanListener(game,this);
		addKeyListener(myListener);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		game.createMap(g);


	}
	

	public void deplacementPacman(int dx,int dy) {

			for(int x = 0 ; x < this.game.getCaseNumHeight() ; x++) {
				for(int y = 0 ; y <  this.game.getCaseNumWidth() ; y++) {
					if(game.getMap()[x][y] == 5 && game.getMap()[x+dx][y+dy] != 0 
							&& game.getMap()[x][y] != game.getMap()[x+dx][y+dy]) {
						game.setMapCase(game.getMap(),x+dx,y+dy,5);
						game.setMapCase(game.getMap(),x,y,10);
						x = this.game.getCaseNumHeight();
						y = this.game.getCaseNumWidth();
					}
				}
		}
	}
}
