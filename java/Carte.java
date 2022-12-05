public abstract class Carte implements Comparable<Carte> {
    public abstract String toEmoji();
    protected abstract int nombre();

    @Override
    public int compareTo(Carte o) {
        return Integer.compare(nombre(), o.nombre());
    }
}
