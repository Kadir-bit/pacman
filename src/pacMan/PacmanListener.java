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


		int keye = e.getKeyCode();


		if (keye == KeyEvent.VK_UP) {
			req_dx = -1;
			req_dy = 0;
			this.key = 38;
		} else if (keye == KeyEvent.VK_DOWN) {
			req_dx = 1;
			req_dy = 0;
			this.key = 40;
	
		} else if (keye == KeyEvent.VK_LEFT) {
			req_dx = 0;
			req_dy = -1;
			this.key = 37;
	
		} else if (keye == KeyEvent.VK_RIGHT) {
			req_dx = 0;
			req_dy = 1;
			this.key = 39;
			
		}
		
		if(keye == this.key) {
					
		fenetre.deplacementPacman(req_dx,req_dy);
		fenetre.repaint();
		//Thread.currentThread.sleep(500);
		}
		

	}


	public int getReq_dx() {
		return req_dx;
	}

	public int getReq_dy() {
		return req_dy;
	}
	

}


