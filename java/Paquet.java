import java.util.Arrays;
import java.util.Collections;

public class Paquet {
    public static SimpleCarte[] melange() {
        SimpleCarte[] ret = new SimpleCarte[52];
        int i = 0;
        for (Couleur c : Couleur.values())
            for (Valeur v : Valeur.values())
                ret[i++] = new SimpleCarte(c, v);
        Collections.shuffle(Arrays.asList(ret));
        return ret;
    }
}