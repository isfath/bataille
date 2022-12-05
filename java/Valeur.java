/* impossible d'écrire extends Comparable<Valeur> :
   les enums Figure et Point implémentent Comparable<X>
   mais on ne peut pas implémenter deux fois une interface !
   si on veut une méthode, on est donc obligé d'en définr une autre */

public interface Valeur {
    int nombre();

    public static Valeur[] values() { //FIXME static final attribute?
        Point[] n = Point.values();
        Figure[] f = Figure.values();
        Valeur[] ret = new Valeur[n.length + f.length];
        System.arraycopy(n, 0, ret, 0, n.length);
        System.arraycopy(f, 0, ret, n.length, f.length);
        return ret;
    }
}
