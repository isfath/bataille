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
        else if (valeur.equals(o.valeur))
            return 0;
        else
            return -1;
    }

    @Override
    public String toString() {
        return valeur.toString() + couleur.toString();
    }

    public String toEmoji() {
        int[] map = new int[]{0, 0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 1};
        int codePoint = 0x1f0a0 + 16 * couleur.ordinal() + map[valeur.nombre()];
        return String.valueOf(Character.toChars(codePoint));
    }

    public Carte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }
}
