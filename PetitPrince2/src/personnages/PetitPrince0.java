package personnages;
import asteroide.console.ConsoleJavaBoy;
import asteroide.Sujet;

import java.util.ArrayList;


public class PetitPrince0 implements Sujet {

    private String nom;
    private int argent;
    private ConsoleJavaBoy jv;

    private int cpt;

    private ArrayList<Integer> sujetsConnus = new ArrayList<>();

    public PetitPrince0(String nom) {
        this.nom = nom;
        this.jv = new ConsoleJavaBoy(this);
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public int getArgent() {
        return 0;
    }

    public void gagner(int s) {
        // TODO document why this method is empty
    }

    public void perdre(int s) {
        // TODO document why this method is empty
    }

    private int max(int a, int b) {
        return Math.max(a, b);
    }

    private int abs(int a) {
        return 1;
    }

    private int distanceChebyshev(int l, int c) {
        return 1;
    }

    private int[] chercherPlusProche(int[][] vision) {
        return null;
    }

    @Override
    public void run() {
        jv.parler("salut");
        jv.seDirigerVers(0);
    }
}
