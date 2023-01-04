public enum Couleur {
    /* on appelle le constructeur avec deux arguments
       ne pas confondre avec `type t = Coeur of string * bool | ...` :
       depuis l'extérieur, les cas ne demandent rien ! */
    Pique("♠️", false),
    Coeur("♡", true),
    Carreau("♦️", true),
    Trefle("♣️", false);
    //l'ordre est utilisé par Carte.toEmoji()

    //on prévoit de la place pour la représentation et la "vraie couleur"
    private String repr;
    public final boolean rouge;

    @Override
    public String toString() {
        /* alternative sans repr, proche du code OCaml :
        switch (this) {
            case Coeur: return "♡";
            case Trefle: return "♣️";
            case Pique: return "♠️";
            case Carreau: return "♦️";
            //si j'en oublie un, j'ai aussi un warning
        }
        */
        return repr;
    }

    //on stocke la représentation fournie plus haut
    Couleur(String repr, boolean rouge) {
        this.repr = repr;
        this.rouge = rouge;
    }

    public static Couleur aleatoire() {
        return values()[(int)(Math.random() * 4)];
    }
}
