import java.util.Arrays;
import java.util.Collections;

public class Paquet {
    public static Carte[] melange(boolean jokers) {
        Carte[] ret;
        if (jokers)
            ret = new Carte[52 + 2];
        else
            /* En Java, SimpleCarte[] est compatible avec Carte[].
               On dit que ses tableaux sont covariants.
               On approfondira ça dans la suite du cours. */
            ret = new SimpleCarte[52];
        int i = 0;
        for (Couleur c : Couleur.values())
            for (Valeur v : Valeur.values())
                ret[i++] = new SimpleCarte(c, v);
        if (jokers) {
            ret[i++] = Joker.Noir;
            ret[i++] = Joker.Rouge;
        }
        Collections.shuffle(Arrays.asList(ret));
        return ret;
    }

    public static SimpleCarte[] melange() {
        return (SimpleCarte[])melange(false);
    }
}