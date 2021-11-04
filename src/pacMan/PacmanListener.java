package pacMan;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class PacmanListener extends KeyAdapter{

	private int req_dx, req_dy;
	private Jeu game;
	private Fenetre fenetre;
	private int key;


	public PacmanListener(Jeu game,Fenetre fenetre) {
		super();
		this.req_dx = 0;
		this.req_dy = 0;
		this.game = game;
		this.fenetre = fenetre;
	}


	@Override
	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		if(game.getInGame() == false && key == KeyEvent.VK_SPACE){
			game.launchGame();
		} else if (game.getInGame() == true){

			if (key == KeyEvent.VK_UP) {
				req_dx = -1;
				req_dy = 0;
			} else if (key == KeyEvent.VK_DOWN) {
				req_dx = 1;
				req_dy = 0;
			} else if (key == KeyEvent.VK_LEFT) {
				req_dx = 0;
				req_dy = -1;
			} else if (key == KeyEvent.VK_RIGHT) {
				req_dx = 0;
				req_dy = 1;
			} else {
				req_dx = 0;
				req_dy = 0;
			}
		}


		fenetre.deplacementPacman(req_dx,req_dy);

	}


	public int getReq_dx() {
		return req_dx;
	}

	public int getReq_dy() {
		return req_dy;
	}


}


