public class SimpleCarte extends Carte { //TODO essayer record
    public final Couleur couleur;
    public final Valeur valeur;

    @Override
    protected int nombre() {
        return valeur.nombre();
    }

    @Override
    public boolean equals(Object obj) { //impossible à définir dans Carte
        Carte other = (Carte)obj; //crash si incompatible
        return this.compareTo(other) == 0;
    }

    @Override
    public String toString() {
        return valeur.toString() + couleur.toString();
    }

    @Override
    public String toEmoji() {
        int[] map = new int[]{0, 0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 1};
        int codePoint = 0x1f0a0 + 16 * couleur.ordinal() + map[valeur.nombre()];
        return String.valueOf(Character.toChars(codePoint));
    }

    public SimpleCarte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }
}
