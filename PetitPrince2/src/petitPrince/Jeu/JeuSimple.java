package petitPrince.Jeu;

public abstract class JeuSimple {
    private String nom;

    public JeuSimple(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public abstract int arbitrer(String c1, String c2);

    public abstract String jouerUnTour();
}