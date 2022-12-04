/* impossible d'écrire extends Comparable<Valeur> :
   une enum implémente Comparable<X>
   mais on ne peut pas implémenter deux fois une interface ! */

public interface Valeur {
    int nombre();

    default boolean gagneContre(Valeur autre) {
        return nombre() > autre.nombre();
    }

    public static Valeur[] values() { //FIXME static final attribute?
        Nombre[] n = Nombre.values();
        Figure[] f = Figure.values();
        Valeur[] ret = new Valeur[n.length + f.length];
        System.arraycopy(n, 0, ret, 0, n.length);
        System.arraycopy(f, 0, ret, n.length, f.length);
        return ret;
    }
}
