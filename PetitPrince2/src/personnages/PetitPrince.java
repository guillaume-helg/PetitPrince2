package personnages;

import asteroide.Joueur;
import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

import java.util.ArrayList;


public class PetitPrince implements Joueur, Sujet {

    private String nom;
    private int argent;
    private ConsoleJavaBoy jv;
    private int cpt;

    private ArrayList<Integer> sujetsConnus = new ArrayList<>();

    public PetitPrince(String nom) {
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
        this.argent += s;
    }

    public void perdre(int s) {
        this.argent -= s;
    }

    private int max(int a, int b) {
        return 1;
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
