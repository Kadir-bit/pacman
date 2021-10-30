package pacMan;

public class Main {

	public static void main(String[] args) {
		Joueur player = new Joueur();
		Jeu game = new Jeu(player);
		ScoreFenetre scoreFenetre = new ScoreFenetre(game,player);
		Fenetre fenetre = new Fenetre(game,player,scoreFenetre);
		new View(fenetre,game,scoreFenetre);
	}

}
