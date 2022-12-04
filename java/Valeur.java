/* impossible d'écrire extends Comparable<Valeur> :
   une enum implémente Comparable<X>
   mais on ne peut pas implémenter deux fois une interface ! */

public interface Valeur {
    int nombre();

    default boolean gagneContre(Valeur autre) {
        return nombre() > autre.nombre();
    }
}
