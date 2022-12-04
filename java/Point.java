public enum Point implements Valeur {
    N2,
    N3,
    N4,
    N5,
    N6,
    N7,
    N8,
    N9,
    N10;

    @Override
    public int nombre() {
        return 2 + ordinal();
    }

    static Point valueOf(int n) {
        return values()[n - 2];
    }

    @Override
    public String toString() {
        return super.toString().substring(1);
    }
}
