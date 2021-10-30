package pacMan;

import java.awt.Color;
import java.awt.Graphics;

public class Jeu {

	private final int CaseNumWidth = 18;
	private final int CaseNumHeight = 11;

	private final int CaseSize = 56;

	private int[][] map = {
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,3,1,1,1,0,1,1,1,1,1,1,0,1,1,1,2,0},
			{0,1,0,0,1,0,1,0,0,0,0,1,0,1,0,0,1,0},
			{0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0},
			{0,1,0,1,0,0,1,0,10,10,0,1,0,0,1,0,1,0},
			{1,1,5,1,1,1,1,0,10,10,0,1,1,1,1,1,1,1},
			{0,1,0,1,0,0,1,0,0,0,0,1,0,0,1,0,1,0},
			{0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0},
			{0,1,0,0,1,0,1,0,0,0,0,1,0,1,0,0,1,0},
			{0,2,1,1,1,0,1,1,1,1,1,1,0,1,1,1,4,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};
	
	public int[][] getMap() {
		return map;
	}
	
	public void setMapCase(int[][] map,int x,int y,int value) {
		this.map[x][y] = value;
	}

	private Boolean inGame;

	public Boolean getInGame() {
		return inGame;
	}

	

	public void setInGame(Boolean inGame) {
		this.inGame = inGame;
	}

	public Jeu (Joueur player) {
		super();
		this.inGame =false;
		

	}

	public int getCaseNumWidth() {
		return CaseNumWidth;
	}

	public int getCaseNumHeight() {
		return CaseNumHeight;
	}

	public int getCaseSize() {
		return CaseSize;
	}

	public Case[][] createMap (Graphics g) {
		Case[][] carte = new Case[CaseNumHeight][CaseNumWidth];

		for(int x = 0 ; x < CaseNumHeight ; x++) {
			for(int y = 0 ; y < CaseNumWidth ; y++) {

				

				carte[x][y] = new Case(x,y);

				if(map[x][y] == 0) {
					carte[x][y].setCaseType(CaseType.MUR);
					g.setColor(new Color(51,107,255));
					g.fillRect(y*CaseSize, x*CaseSize, CaseSize, CaseSize);
				} else if (map[x][y] == 1){
					g.setColor(new Color(255, 255, 255));
					g.fillOval(y*CaseSize + 28 , x*CaseSize + 28, 6, 6);
				}else if (map[x][y] == 2){
					g.setColor(new Color(106, 1, 253, 255));
					g.fillOval(y*CaseSize + 23 , x*CaseSize + 23, 15, 15);
				}else if (map[x][y] == 3){
					g.setColor(new Color(255, 129, 0));
					g.fillOval(y*CaseSize + 23 , x*CaseSize + 23, 15, 15);
				}else if (map[x][y] == 4){
					g.setColor(new Color(63, 255, 0));
					g.fillOval(y*CaseSize + 23 , x*CaseSize + 23, 15, 15);
				}else if (map[x][y] == 5){
					g.setColor(new Color(255,255,0));
					g.fillOval(y*CaseSize + 10 , x*CaseSize + 10, 35, 35);
				} else if (map[x][y] == 10) {
					g.setColor(new Color(0,0,0));
					g.fillRect(y*CaseSize, x*CaseSize, CaseSize, CaseSize);				}
			}
		}
		return carte;
	}
	
	

}
