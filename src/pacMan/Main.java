package pacMan;

public class Main {

	public static void main(String[] args) {
		Joueur player = new Joueur();
		Jeu game = new Jeu(player);
		Fenetre fenetre = new Fenetre(game);
		new View(fenetre,game);
	}

}
