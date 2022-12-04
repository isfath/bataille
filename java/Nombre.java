public enum Nombre implements Valeur {
    N2,
    N3,
    N4,
    N5,
    N6,
    N7,
    N8,
    N9,
    N10;

    static Nombre valueOf(int n) {
        return valueOf("N" + n);
    }

    @Override
    public String toString() {
        return super.toString().substring(1);
    }
}
