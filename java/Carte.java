public class Carte { //TODO essayer record
    public final Couleur couleur;
    public final Valeur valeur;

    @Override
    public boolean equals(Object obj) {
        Carte other = (Carte)obj; //crash si incompatible
        return couleur.equals(other.couleur) && valeur.equals(other.valeur);
    }

    //TODO comparable

    @Override
    public String toString() {
        return valeur.toString() + couleur.toString();
    }

    public Carte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }
}
