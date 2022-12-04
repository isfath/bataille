public enum Figure implements Valeur {
    Valet,
    Dame,
    Roi,
    As;

    @Override
    public int nombre() {
        return 11 + ordinal();
    }

    @Override
    public String toString() {
        return super.toString().substring(0, 1);
    }
}
