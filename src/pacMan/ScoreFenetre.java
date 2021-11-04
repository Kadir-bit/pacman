package pacMan;

import pacMan.Jeu;

import javax.swing.*;
import java.awt.*;

public class ScoreFenetre extends JPanel {
    private Jeu game;
    private Joueur player;


    private static final long serialVersionUID = 1L;

    public ScoreFenetre (Jeu game,Joueur player) {
        super();
        this.game = game;
        this.player = player;
        setOpaque(true);
        setBackground(Color.ORANGE);
        setSize(300,50);
        setLocation(0,game.getCaseSize()*game.getCaseNumHeight());
        setSize(game.getCaseSize()*game.getCaseNumWidth(),100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("score : "+player.getScore(),20,20);
        g.drawString("vie : "+player.getVies(),100,20);
        if(game.getInGame() == false && player.getVies() > 0) {
            g.drawString("appuyé sur espace pour commencé",400,20);
        }
    }

}
