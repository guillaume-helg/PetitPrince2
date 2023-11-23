package petitPrince.Jeu;

import java.util.Random;

public class JeuShifumi extends JeuSimple {

    public JeuShifumi(String nom) {
        super(nom);
    }

    @Override
    public int arbitrer(String c1, String c2) {
        return 0;
    }

    @Override
    public String jouerUnTour() {
        int pick = new Random().nextInt(Shifumi.values().length);
        return "" + Shifumi.values()[pick];
    }

    public enum Shifumi {
        FEUILLE("Feuille"),
        CISEAUX("Ciseau"),
        PIERRE("Pierre");

        private String nom;

        private Shifumi(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return this.nom;
        }
    }
}


