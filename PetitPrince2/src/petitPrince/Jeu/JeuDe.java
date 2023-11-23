package petitPrince.Jeu;

import java.util.Random;

public class JeuDe extends JeuSimple {
    public JeuDe(String nom) {
        super(nom);
    }

    @Override
    public int arbitrer(String c1, String c2) {
        int nb1 = Integer.parseInt(c1);
        int nb2 = Integer.parseInt(c2);
        if (nb1 == nb2) {
            return 0;
        }
        return nb1 > nb2 ? 1 : -1;
    }


    @Override
    public String jouerUnTour() {
        java.util.Random r = new Random();
        return "" + r.nextInt(1, 6);
    }
}
