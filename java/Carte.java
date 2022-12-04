public class Carte implements Comparable<Carte> { //TODO essayer record
    public final Couleur couleur;
    public final Valeur valeur;

    @Override
    public boolean equals(Object obj) {
        Carte other = (Carte)obj; //crash si incompatible
        return couleur.equals(other.couleur) && valeur.equals(other.valeur);
    }

    @Override
    public int compareTo(Carte o) {
        if (valeur.gagneContre(o.valeur))
            return 1;
        else if (valeur.equals(o))
            return 0;
        else
            return -1;
    }

    @Override
    public String toString() {
        return valeur.toString() + couleur.toString();
    }

    public Carte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }
}
