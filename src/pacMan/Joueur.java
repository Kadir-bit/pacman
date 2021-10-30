package pacMan;

public class Joueur {
	private int vies;
	private int score;
	
	public Joueur() {
		super();
		this.vies = 3;
		this.score = 0;
	}

	public void vieBonus() {
		if (this.score  > 5000) {
			this.vies +=1;
		}
	}

	public int getVies() {
		return vies;
	}

	public void setVies(int vies) {
		this.vies = vies;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score += score;
	}
}
