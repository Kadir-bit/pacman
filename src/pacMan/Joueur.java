package pacMan;

public class Joueur {
	private int vies;
	private int score;
	private int stock = 0;
	
	public Joueur() {
		super();
		this.vies = 3;
		this.score = 0;
	}



	public void vieBonus() {
		if (this.score-stock  >= 5000) {
			setVies(getVies()+1);
			setStock(getStock()+5000);
		}
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
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
