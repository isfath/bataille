public enum Couleur {
    /* on appelle le constructeur avec un argument
       ne pas confondre avec `type t = Coeur of string | ...` :
       depuis l'extérieur, les cas ne demandent rien ! */
    Coeur("♡"),
    Trefle("♣️"),
    Pique("♠️"),
    Carreau("♦️");

    //on prévoit de la place pour la représentation
    private String repr;

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
    Couleur(String repr) {
        this.repr = repr;
    }
}
