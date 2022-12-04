import java.util.Arrays;
import java.util.Collections;

public class Paquet {
    public static Carte[] melange() {
        Carte[] ret = new Carte[52];
        int i = 0;
        for (Couleur c : Couleur.values())
            for (Valeur v : Valeur.values())
                ret[i++] = new Carte(c, v);
        Collections.shuffle(Arrays.asList(ret));
        return ret;
    }
}